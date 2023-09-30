import java.util.*;
public class VerificarRepetidos {
    // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Os números únicos da lista são: "+checarNumerosDistintos(numeros));
    }

    public static List<Integer> checarNumerosDistintos(List<Integer> lista){
        int[] contador = new int[lista.size()*10];
        Map<Integer, Integer> contagem = new HashMap<>();
        List<Integer> unicos = new ArrayList<>();

        lista.forEach(n -> contagem.put(n, contador[n] += 1));

        for(Map.Entry<Integer, Integer> c : contagem.entrySet()){
            if (c.getValue() == 1){
                unicos.add(c.getKey());
            }
        }
        return unicos;
    }
}

