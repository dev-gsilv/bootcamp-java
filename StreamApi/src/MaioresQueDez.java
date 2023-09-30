import java.util.Arrays;
import java.util.List;

public class MaioresQueDez {
    // Desafio 6 - Verificar se a lista contém algum número maior que 10
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 42, 123);

        List<Integer> maioresQueDez = numeros.stream()
                .filter(n -> n > 10).toList();

        System.out.println("A lista dos números maiores que 10 é: "+maioresQueDez);
    }
}
