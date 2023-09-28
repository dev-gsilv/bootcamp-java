import java.util.Arrays;
import java.util.List;

public class VerificaPositivos {
    // Desafio 3 - Verifique se todos os números da lista são positivos
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, -4, -3);

        List<Integer> listaPositivos = numeros.stream()
                .filter(n -> n >= 0).toList();

        System.out.println("A lista dos números positivos é: "+listaPositivos);
    }
}
