package apple.iphone;

import apple.iphone.componente.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphoneModel2007 = new Iphone();

        // Funcionalidade de chamadas
        System.out.println("### Aplicativo Chamadas ###");
        iphoneModel2007.ligar("DIO");
        div();
        iphoneModel2007.atender();
        div();
        iphoneModel2007.correioVoz();
        System.out.println("### ### ###\n");

        // Funcionalidade de navegador
        System.out.println("### Aplicativo Navegador Web ###");
        iphoneModel2007.exibirPagina();
        div();
        iphoneModel2007.atualizarPagina();
        div();
        iphoneModel2007.adicionarNovaAba();
        System.out.println("### ### ###\n");

        // Funcionalidade de reprodutor musical
        System.out.println("### Aplicativo Reprodutor Musical ###");
        iphoneModel2007.selecionarMusica("Cotidiano");
        div();
        iphoneModel2007.tocarMusica("Cotidiano");
        div();
        iphoneModel2007.pausarMusica();
        System.out.println("### ### ###\n");
    }
    public static void div(){
        System.out.println("#   #   #");
    }
}
