package iphone.apps;


public class AparelhoTelefonico {
    
    private void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void ligar(String numero) {
        iniciarCorreioVoz();
        System.out.println("Ligando para o número " + numero);
    }

    public void atender() {
        System.out.println("Chamada recebida atendida.");
    }
}
