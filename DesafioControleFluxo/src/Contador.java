import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("\nBem-vind@ ao desafio \"Contador\". Informe os dados requisitados para continuar.");
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scn.nextInt();
        System.out.print("Digite o segundo número inteiro, maior que o anterior: ");
        int numero2 = scn.nextInt();
        scn.close();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro! Tente novamente.");
        }
    }
    static void contar(int num1, int num2 ) throws ParametrosInvalidosException {
        if (num1 >= num2)
            throw new ParametrosInvalidosException();

        int contagem = num2 - num1;
        for (int i=1; i <= contagem; i++){
            System.out.println("Imprimindo o número "+i);
        }
    }
}
