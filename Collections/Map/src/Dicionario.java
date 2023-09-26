import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavras(){
        if (!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        } else{
            System.out.println("O dicionário está vazio.");
        }
    }

    public void pesquisarPorPalavra(String palavra){
        String pesquisa = dicionarioMap.get(palavra);
        if (!dicionarioMap.isEmpty() && pesquisa != null){
            System.out.println(pesquisa);
        } else {
            System.out.println("A palavra pesquisada não existe no dicionário.");
        }

    }
}
