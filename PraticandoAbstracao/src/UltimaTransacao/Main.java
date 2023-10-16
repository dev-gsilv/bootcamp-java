package UltimaTransacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao
        Transacao novaTransacao = new Transacao(partes[0], partes[1], partes[2], Double.parseDouble(partes[3]));
        novaTransacao.imprimir();
    }
}
