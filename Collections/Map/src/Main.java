public class Main {
    public static void main(String[] args) {
        /* Dicionario dicionario = new Dicionario();
        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("Teste");

        dicionario.adicionarPalavra("Teste", "Testando o método adicionarPalavra.");
        dicionario.adicionarPalavra("Prato", "Utensílio para servir comida.");
        dicionario.adicionarPalavra("Janela", "Abertura na parede para entrada de luz e ar.");
        dicionario.adicionarPalavra("Tinta", "Pigmento para colorir objetos.");
        dicionario.adicionarPalavra("Teste", "Testando o método adicionarPalavra.");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("Teste");
        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Tinta");
        dicionario.pesquisarPorPalavra("Teste");*/

        /*ContagemPalavras palavras = new ContagemPalavras();
        palavras.exibirContagemPalavras();

        palavras.adicionarPalavra("Lorem", 3);
        palavras.adicionarPalavra("Ipsum", 8);
        palavras.adicionarPalavra("Dolor", 6);
        palavras.adicionarPalavra("sit", 9);
        palavras.adicionarPalavra("amet", 3);
        palavras.adicionarPalavra("elit", 4);
        palavras.adicionarPalavra("sed", 6);
        palavras.exibirContagemPalavras();

        palavras.removerPalavra("Dolor");
        palavras.exibirContagemPalavras();

        palavras.encontrarPalavraMaisFrequente();*/

        LivrariaOnline livraria = new LivrariaOnline();
        System.out.println("Livros ordenados por preço:\n"+livraria.exibirLivrosOrdenadosPorPreco());

        livraria.adicionarLivro("amazon.com.br/dp/6586064910", "Box Fundação", "Isaac Asimov", 293.96);
        livraria.adicionarLivro("amazon.com.br/dp/testeLivroMaisCaro", "Box Fundação edição 2023", "Isaac Asimov", 293.96);
        livraria.adicionarLivro("amazon.com.br/dp/8576571978", "Trilogia da Fundação", "Isaac Asimov", 150.89);
        livraria.adicionarLivro("amazon.com.br/dp/B00IYNEC4K", "Silo Livro 3", "Hugh Howey", 19.95);
        livraria.adicionarLivro("amazon.com.br/dp/testeLivroMaisBarato", "Silo Livro 3 edição 2023", "Hugh Howey", 19.95);
        livraria.adicionarLivro("amazon.com.br/dp/B00TE3U3EC", "Silo Livro 1", "Hugh Howey", 44.91);
        livraria.adicionarLivro("amazon.com.br/dp/B01KYGDL2I", "Silo Livro 2", "Hugh Howey", 40.41);
        System.out.println("Livros ordenados por preço:\n"+livraria.exibirLivrosOrdenadosPorPreco());

        livraria.pesquisarLivrosPorAutor("Isaac Asimov");
        livraria.pesquisarLivrosPorAutor("Hugh Howey");

        livraria.obterLivroMaisCaro();
        livraria.exibirLivroMaisBarato();

        livraria.removerLivro("Silo Livro 1");
        System.out.println("Livros ordenados por preço:\n"+livraria.exibirLivrosOrdenadosPorPreco());




    }
}
