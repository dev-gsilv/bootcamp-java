import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contadorPalavras;

    public ContagemPalavras() {
        this.contadorPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contadorPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contadorPalavras.isEmpty()){
            contadorPalavras.remove(palavra);
        } else {
            System.out.println("Não há palavras para remover.");
        }
    }

    public void exibirContagemPalavras(){
        if (!contadorPalavras.isEmpty()){
            System.out.println(contadorPalavras);
        } else {
            System.out.println("Não há palavras para exibir.");
        }
    }

    public void encontrarPalavraMaisFrequente(){
        Map.Entry<String, Integer> palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contadorPalavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry;
            }
        }
        System.out.println("A palavra mais frequente é: "+palavraMaisFrequente);
    }
}
