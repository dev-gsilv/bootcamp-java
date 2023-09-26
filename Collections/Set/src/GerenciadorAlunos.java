import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet = new HashSet<>();

    public void adicionarAluno(String nome, long matricula, double nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover;
        for (Aluno a : alunoSet){
            if (a.getMatricula() == matricula){
                alunoParaRemover = a;
                alunoSet.remove(alunoParaRemover);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(alunoSet);
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);

        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        return alunoSet;
    }
}
