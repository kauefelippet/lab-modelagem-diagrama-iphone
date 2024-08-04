package iphone.apps;


public class ReprodutorMusical {

    String musicaAtual;
    boolean tocando = false;

    public void tocar() {
        if (musicaAtual == null) {
            System.out.println("Você deve antes escolher uma música para retomá-la.");
        } else if (musicaAtual != null && tocando) {
            System.out.println("Tocando a música \"" + musicaAtual + "\".");
            tocando = true;
        } else {
        System.out.println("Música retomada.");
        tocando = true;
        }
    }

    public void pausar() {
        if (tocando) {
            System.out.println("Música pausada.");
            tocando = false;
        } else {
            System.out.println("A música já está pausada.");
        }
    }

    public void selecionarMusica(String musica) {   
        musicaAtual = musica;
        tocando = true;
        System.out.println("\"" + musicaAtual + "\" selecionada.");
    }
}
