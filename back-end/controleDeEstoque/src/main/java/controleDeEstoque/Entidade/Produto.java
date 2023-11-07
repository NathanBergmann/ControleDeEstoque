package controleDeEstoque.Entidade;


import java.sql.Date;
import java.time.*;
public class Produto {
    private long id;
    private String nome;
    private String descricao;
    private Double preco;
    private int qtdeEstoque;
    private boolean ativo;
    private LocalDate dataAteracao;
    public Produto(){
    }
    public Produto(String nome, String descricao, Double preco, int qtdeEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdeEstoque = qtdeEstoque;
        this.ativo = true;
        this.dataAteracao = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", qtdeEstoque=" + qtdeEstoque +
                ", ativo=" + ativo +
                ", dataAteracao=" + dataAteracao +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataAteracao() {
        return Date.valueOf(dataAteracao);
    }

    public void setDataAteracao(LocalDate dataAteracao) {
        this.dataAteracao = dataAteracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

