import java.util.*;

public class OrdenarLista {
    // Desafio 1 - Mostre a lista na ordem numérica
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

        // Imprime cada número numa linha separada. L12=lambda; L13=method reference.
        numerosOrdenados.forEach(e -> System.out.println(e));
        numerosOrdenados.forEach(System.out::println);
        // Imprime o array completo numa única linha.
        System.out.println(numerosOrdenados);
    }
}
