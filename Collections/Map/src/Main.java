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

        ContagemPalavras palavras = new ContagemPalavras();
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

        palavras.encontrarPalavraMaisFrequente();


    }
}
