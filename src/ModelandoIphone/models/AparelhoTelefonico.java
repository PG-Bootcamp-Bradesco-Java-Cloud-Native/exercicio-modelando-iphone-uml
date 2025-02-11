package ModelandoIphone.models;

public class AparelhoTelefonico {
    private String numero = "(##) # ####-####";

    public void ligar(String numero) {
        Ligacao ligacao = new Ligacao(this.numero, numero);
        System.out.println("Ligando para numero especificado (" + numero + ")...");
    }

    public void atender(Ligacao ligacao) {
        ligacao.setAtendida();
        System.out.println("Ligação atendida.");
        System.out.println(ligacao.toString());
    }

    public void iniciarCorreioVoz(Ligacao ligacao) {
        System.out.println("Correio de voz recebido tem a duração de " + ligacao.getCorreioVoz().getDuracao());
        System.out.println("Reproduzindo correio de voz...");
    }
}
