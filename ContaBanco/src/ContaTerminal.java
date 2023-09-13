import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;
    private static void criarConta(){
        Scanner scn = new Scanner(System.in);
        ContaTerminal novaConta = new ContaTerminal();

        System.out.println("Seja bem-vind@ ao Banco Java! Para abrir sua conta, informe os dados solicitados.");
        System.out.print("Digite seu nome completo: ");
        novaConta.nomeCliente = scn.nextLine();
        System.out.print("Digite seu número de agência (Exemplo: 067-8): ");
        novaConta.agencia = scn.next();
        System.out.print("Digite seu número de conta (Exemplo: 1230): ");
        novaConta.numero = scn.nextInt();
        System.out.print("Digite seu saldo inicial de conta: ");
        novaConta.saldo = scn.nextFloat();
        scn.close();

        String mensagemExito = "\nOlá, "+novaConta.nomeCliente+"! Obrigado por criar uma conta em nosso banco. Sua agência é "+novaConta.agencia+", conta "+novaConta.numero+" e seu saldo de R$ "+novaConta.saldo+" já está disponível para saque.";
        System.out.println(mensagemExito);
    }
    public static void main(String[] args){
        criarConta();
    }
}
