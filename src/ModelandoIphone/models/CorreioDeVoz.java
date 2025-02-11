package ModelandoIphone.models;

import java.time.Duration;

public class CorreioDeVoz extends Media {
    private Duration duracao;

    public CorreioDeVoz(Duration duracao) {
        this.duracao = duracao;
    }

    public Duration getDuracao() {
        return this.duracao;
    }
}
