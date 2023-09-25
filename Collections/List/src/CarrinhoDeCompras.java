import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {
    List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
        System.out.println("Carrinho criado!");
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item novoItem = new Item(nome, preco, quantidade);
        carrinho.add(novoItem);
        System.out.println("Item "+nome+" adicionado ao carrinho.");
    }

    public void removerItem(String nome){
        ArrayList<Item> listaExclusao = new ArrayList<>();
        for (Item i : carrinho){
            if (i.getNome().equalsIgnoreCase(nome)){
                listaExclusao.add(i);
            }
        }
        carrinho.removeAll(listaExclusao);
        System.out.println("Item removido:  "+listaExclusao);

    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item i : carrinho){
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println("Carrinho atualizado:");
        System.out.println(carrinho);

    }
}
