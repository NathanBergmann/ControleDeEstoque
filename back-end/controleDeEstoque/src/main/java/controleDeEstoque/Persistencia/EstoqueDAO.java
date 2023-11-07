package controleDeEstoque.Persistencia;
import java.sql.*;
import controleDeEstoque.Entidade.Produto;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EstoqueDAO extends BaseDAO{
    public void criarTabela(){
        String sql = """
                CREATE TABLE IF NOT EXISTS produtos (
                     id_produto integer primary key autoincrement,
                     nome VARCHAR(100) NOT NULL,
                     descricao VARCHAR(255),
                     preco DECIMAL(10, 2) NOT NULL,
                     data_alteracao datetime,
                     quantidade integer,
                     ativo boolean
                );
                """;
        try(PreparedStatement p = obterConexao().prepareStatement(sql)){
            p.executeUpdate();
        }catch (SQLException e){
            System.out.println("Erro ao criar tabela Produto. ");
            e.printStackTrace();
        }
        //fazendo o prepared statment no try, ele fecha automáticamente
    }

    public void inserir(Produto produto){
        try(Connection c = obterConexao()){
            String sql = """
                    insert into produtos(nome,descricao,preco,data_alteracao,quantidade,ativo)
                    values(?,?,?,?,?,true)
                    """;
            try(PreparedStatement p = c.prepareStatement(sql)){
                p.setString(1, produto.getNome());
                p.setString(2,produto.getDescricao());
                p.setDouble(3,produto.getPreco());
                p.setDate(4, produto.getDataAteracao());
                p.setInt(5,produto.getQtdeEstoque());
                p.executeUpdate();
            }catch (SQLException e){
                System.out.println("Erro ao inserir Produto. "+ produto.toString());
                e.printStackTrace();
            }
        }catch (SQLException e){
            System.out.println("Erro na conexão.");
            e.printStackTrace();
        }

    }
    public void desativar(long id){
        String sql = """
                    update produtos set ativo = false where id_produto = ?
                    """;
        try(PreparedStatement p = obterConexao().prepareStatement(sql)){
            p.setLong(1,id);
            p.executeUpdate();
        }catch (SQLException e){
            System.out.println("Erro ao desativar produto "+id);
            e.printStackTrace();
        }
    }

    public void atualizarEstoque(long id, int qtde, boolean diminuir){
        if (diminuir){
            qtde = qtde * (-1);
        }
        String sql = """
                select quantidade from produtos where id_produto = ?
                """;
        int qtdeEstoque = 0;
        try(PreparedStatement p = obterConexao().prepareStatement(sql)){
            p.setLong(1, id);
            ResultSet rs = p.executeQuery();
            if (rs.next()){
                qtdeEstoque = rs.getInt("quantidade");
            }
        }catch (SQLException e){
            System.out.println("Erro ao consultar produto "+ id);
            e.printStackTrace();
            return;
        }
        qtde = qtde + qtdeEstoque;
        sql = """
                    update produtos set
                        quantidade = ?
                        ,data_alteracao = ?
                    where id_produto = ?
                    """;
        try(PreparedStatement p = obterConexao().prepareStatement(sql)){
            p.setInt(1, qtde);
            p.setDate(2,Date.valueOf(LocalDate.now()));
            p.setLong(3, id);
            p.executeUpdate();
        }catch (SQLException e){
            System.out.println("Erro ao atualizar quantidade produto "+ id);
            e.printStackTrace();
        }
    }
    public Optional<Produto> obterPeloId(long id){
        String sql = """
                    select id_produto
                          ,nome
                          ,descricao
                          ,preco
                          ,data_alteracao
                          ,quantidade
                          ,ativo
                    from produtos
                    where id_produto = ?
                    """;
        Produto prod = null;
        try(PreparedStatement p = obterConexao().prepareStatement(sql)){
            p.setLong(1,id);
            ResultSet rs = p.executeQuery();
            if(rs.next() && rs.getBoolean("ativo")){
                prod = new Produto();
                prod.setId(rs.getLong("id_produto"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setNome(rs.getString("nome"));
                prod.setDataAteracao(rs.getDate("data_alteracao").toLocalDate());
                prod.setPreco(rs.getDouble("preco"));
                prod.setQtdeEstoque(rs.getInt("quantidade"));
            }
            else{
                System.out.println("Produto não encontrado!");
            }
        }catch (SQLException e){
            System.out.println("Erro ao consultar Produto com id "+id);
            e.printStackTrace();
        }
        return Optional.ofNullable(prod);
    }
    public List<Produto> obterTodos(){
        String sql = """
                    select id_produto
                          ,nome
                          ,descricao
                          ,preco
                          ,data_alteracao
                          ,quantidade
                    from produtos
                    where ativo = true
                    """;

        List<Produto> lista = new ArrayList<>();
        try(PreparedStatement p = obterConexao().prepareStatement(sql)){
            ResultSet rs = p.executeQuery();
            Produto prod = null;
            while(rs.next()) {
                prod = new Produto();
                prod.setId(rs.getLong("id_produto"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setNome(rs.getString("nome"));
                prod.setDataAteracao(rs.getDate("data_alteracao").toLocalDate());
                prod.setPreco(rs.getDouble("preco"));
                prod.setQtdeEstoque(rs.getInt("quantidade"));
                lista.add(prod);
            }
        }catch (SQLException e) {
            System.out.println("Erro ao consultar Produtos");
            e.printStackTrace();
        }
        return lista;
    }
}
