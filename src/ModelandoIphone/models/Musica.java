package ModelandoIphone.models;

import java.time.Duration;

public class Musica extends NamedMedia {
    private String artista;
    private Duration duracao;

    public Musica(String artista, Duration duracao) {
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getArtista() {
        return this.artista;
    }

    public Duration getDuracao() {
        return this.duracao;
    }

    @Override
    public String toString() {
        return new StringBuilder("Dados da Música:\n")
                .append("\tTítulo: ").append(this.titulo)
                .append("\tArtista: ").append(this.artista)
                .append("\tDuração: ").append(this.duracao)
                .toString();
    }
}
