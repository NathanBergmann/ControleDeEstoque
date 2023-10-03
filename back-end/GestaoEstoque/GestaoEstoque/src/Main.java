import Entidade.Produto;
import Persistencia.EstoqueDAO;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Parafuso","4pol",5.99, 500);
        EstoqueDAO e = new EstoqueDAO();
        e.criarTabela();
        //e.inserir(p);

        List<Produto> lista = e.obterTodos();
        for(Produto t1 : lista){
            System.out.println(t1);
        }
        //e.atualizarEstoque(1, 100, false);
        e.desativar(1);
        Optional<Produto> opt = e.obterPeloId(1);
        if(opt.isPresent()){
            Produto t2 = opt.get();
            System.out.println("Retornou a tarefa "+t2);
        }else{
            System.out.println("Tarefa não foi encontrada.");
        }

    }
}