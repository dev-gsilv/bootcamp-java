import java.util.Arrays;
import java.util.List;

public class MediaMaioresDeCinco {
    // Desafio 5 - Calcule a média dos números maiores que 5
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maioresQueCinco = numeros.stream().filter(n -> n > 5).toList();
        int media = maioresQueCinco.stream().reduce(0, Integer::sum) / maioresQueCinco.size();

        System.out.println("A média dos números > 5 é: "+media);
    }
}
