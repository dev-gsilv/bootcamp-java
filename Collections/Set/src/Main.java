public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas mundoJava = new ConjuntoPalavrasUnicas();

        mundoJava.exibirPalavrasUnicas();

        mundoJava.adicionarPalavra("Java");
        mundoJava.adicionarPalavra("Kotlin");
        mundoJava.adicionarPalavra("Maven");
        mundoJava.adicionarPalavra("Maven");

        mundoJava.exibirPalavrasUnicas();

        System.out.println("A palavra Maven existe? "+mundoJava.verificarPalavra("Maven"));
        mundoJava.removerPalavra("Maven");
        System.out.println("A palavra Maven existe? "+mundoJava.verificarPalavra("Maven"));

    }
}
