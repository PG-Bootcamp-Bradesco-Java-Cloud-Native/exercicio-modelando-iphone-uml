package ModelandoIphone.models;

public class ReprodutorMusical {
    private Musica musicaSelecionada;

    public void tocar() {
        System.out.println("Tocando música selecionada: " + musicaSelecionada.getTitulo());
    }

    public void pausar() {
        System.out.println("Pausando música selecionada: " + musicaSelecionada.getTitulo());
    }

    public void selecionarMusica(Musica musica) {
        this.musicaSelecionada = musica;
        System.out.println("Nova música selecionada: " + musica.getTitulo());
    }
}
