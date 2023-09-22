public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras novoCarrinho = new CarrinhoDeCompras();

        novoCarrinho.adicionarItem("Relógio", 100.00, 2);
        novoCarrinho.adicionarItem("Relógio", 100.00, 2);
        novoCarrinho.adicionarItem("Smartphone", 1000.00, 1);
        novoCarrinho.adicionarItem("Câmera", 500.00, 1);
        System.out.println("Seu carrinho de compras tem R$ "+novoCarrinho.calcularValorTotal()+" em produtos.");
        novoCarrinho.exibirItens();
        novoCarrinho.removerItem("relógio");
        novoCarrinho.exibirItens();
        System.out.println("Seu carrinho de compras tem R$ "+novoCarrinho.calcularValorTotal()+" em produtos.");

    }
}
