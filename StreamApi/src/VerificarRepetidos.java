import java.util.*;
public class VerificarRepetidos {
    // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Os números únicos da lista são: "+checarNumerosDistintos(numeros));
    }

    public static List<Integer> checarNumerosDistintos(List<Integer> lista){
        int[] contador = new int[Collections.max(lista)+1];
        // LinkedHashMap<>() mantem os elemente na ordem de inserção. HashMap<>() ordena os elementos na ordem natural.
        Map<Integer, Integer> contagem = new LinkedHashMap<>();
        List<Integer> listaUnicos = new ArrayList<>();

        lista.forEach(n -> contagem.put(n, contador[n] += 1));

        contagem.forEach((key, value) -> {
            if (value == 1) {
                listaUnicos.add(key);
            }
        });
        return listaUnicos;
    }
}

