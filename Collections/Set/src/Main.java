public class Main {
    public static void main(String[] args) {
        /* Operações Básicas com Set
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
        */

        /* Pesquisa básica com Set*/
        ListaTarefas estudar = new ListaTarefas();

        estudar.exibirTarefas();
        estudar.contarTarefas();
        estudar.adicionarTarefa("Java");
        estudar.adicionarTarefa("Spring Boot");
        estudar.adicionarTarefa("SQL");
        estudar.adicionarTarefa("BANCO DE DADOS");
        estudar.adicionarTarefa("sql");
        estudar.adicionarTarefa("GIT");
        estudar.adicionarTarefa("GIT");
        estudar.exibirTarefas();
        estudar.contarTarefas();

        estudar.removerTarefa("teste");
        estudar.removerTarefa("git");
        estudar.exibirTarefas();
        estudar.contarTarefas();

        System.out.println(estudar.obterTarefasConcluidas());
        System.out.println(estudar.obterTarefasPendentes());

        estudar.marcarTarefaConcluida("JAVA");
        estudar.marcarTarefaConcluida("SQL");
        System.out.println(estudar.obterTarefasConcluidas());

        estudar.marcarTarefaPendente("Java");
        System.out.println(estudar.obterTarefasPendentes());

        estudar.limparListaTarefas();
        estudar.exibirTarefas();
    }
}
