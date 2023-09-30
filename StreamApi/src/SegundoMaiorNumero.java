import java.util.Arrays;
import java.util.List;

public class SegundoMaiorNumero {
    // Desafio 7 - Encontrar o segundo número maior da lista
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 33, 4, 5, 66, 743, 8, 9, 10000, 5, 4, 3);

        Object[] numerosOrdenados = numeros.stream().sorted().toArray();
        int segundoMaior = (Integer) numerosOrdenados[numerosOrdenados.length-2];
        System.out.println("O segundo maior número da lista é: "+ segundoMaior);
    }
}
