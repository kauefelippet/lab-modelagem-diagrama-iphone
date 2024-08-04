import iphone.apps.AparelhoTelefonico;
import iphone.apps.NavegadorInternet;
import iphone.apps.ReprodutorMusical;

public class Iphone {

    public static void main(String[] args) {

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet safari = new NavegadorInternet();
        ReprodutorMusical itunes = new ReprodutorMusical();

        itunes.selecionarMusica("Currents - The Rope");
        itunes.tocar();
        itunes.pausar();
        System.out.println("\n");
        
        safari.adicionarAba();
        safari.exibirPagina("https://www.google.com");
        safari.atualizarPagina();
        System.out.println("\n");

        telefone.ligar("(00) 91234-5678");
        telefone.atender();
    }
}
