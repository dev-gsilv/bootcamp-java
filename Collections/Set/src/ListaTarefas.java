import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : tarefaSet){
            if (t.getDescricao().equals(descricao.toLowerCase())){
                tarefaParaRemover = t;
                tarefaSet.remove(tarefaParaRemover);
                System.out.println("Tarefa "+ descricao +" removida!");
                break;
            }
        } if (tarefaParaRemover==null){
            System.out.println("Impossível remover tarefa "+ descricao +". Descrição não encontrada.");
        }
    }

    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()){
            System.out.println("Tarefas: \n"+tarefaSet);
        } else{
            System.out.println("Não há tarefas para exibir.");
        }

    }

    public void contarTarefas(){
        System.out.println("A lista de tarefas contem "+tarefaSet.size()+" elemento(s).");
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        if (tarefasConcluidas.isEmpty()){
            System.out.print("Nenhuma tarefa foi concluída. ");
        } else {
            System.out.println("Tarefas concluídas: ");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if (!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        if (tarefasPendentes.isEmpty()){
            System.out.print("Nenhuma tarefa está pendente!");
        } else {
            System.out.println("Tarefas pendentes: ");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }
}
