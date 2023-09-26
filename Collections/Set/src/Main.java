import java.util.HashSet;

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

        /* Pesquisa básica com Set
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
         */

        /* Ordenação básica com Set*/
        GerenciadorAlunos turma = new GerenciadorAlunos();

        System.out.println("Turma de alunos: "+turma.exibirAlunos());

        turma.adicionarAluno("João Siqueira", 2300111L, 7d);
        turma.adicionarAluno("Maria Pereira", 2300112L, 10d);
        turma.adicionarAluno("Pedro Santana", 2300113L, 2d);
        turma.adicionarAluno("Fernanda Sousa", 2300114L, 5d);
        turma.adicionarAluno("Guilherme Silva", 2300115L, 8d);
        turma.adicionarAluno("João Pedro Siqueira", 2300111L, 7d);
        System.out.println("Turma de alunos:\n"+turma.exibirAlunos());

        turma.removerAluno(2300113L);
        turma.removerAluno(2300110L);
        System.out.println("Turma de alunos:\n"+turma.exibirAlunos());

        System.out.println("Turma de alunos por nome:\n"+turma.exibirAlunosPorNome());
        System.out.println("Turma de alunos por nota:\n"+turma.exibirAlunosPorNota());

    }
}
