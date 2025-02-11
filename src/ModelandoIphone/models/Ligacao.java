package ModelandoIphone.models;

import java.util.Date;

public class Ligacao {
    private String numeroOut;
    private String numeroIn;
    private Date horarioInicial;
    private Date horarioFinal = null;
    private CorreioDeVoz correioDeVoz = null;
    private Boolean foiAtendida = false;

    public Ligacao(String numeroOut, String numeroIn) {
        this.numeroOut = numeroOut;
        this.numeroIn = numeroIn;
        this.horarioInicial = new Date();
        this.horarioFinal = null;
        this.foiAtendida = false;
        this.correioDeVoz = null;
    }

    public String getNumeroOut() {
        return this.numeroOut;
    }

    public String getNumeroIn() {
        return this.numeroIn;
    }

    public Date getHorarioInicial() {
        return this.horarioInicial;
    }

    public Date getHorarioFinal() {
        return this.horarioFinal;
    }

    public void setHorarioFinal(Date horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public Boolean getFoiAtendida() {
        return this.foiAtendida;
    }

    public CorreioDeVoz getCorreioVoz() {
        return this.correioDeVoz;
    }

    public void setCorreioVoz(CorreioDeVoz correioDeVoz) {
        this.correioDeVoz = correioDeVoz;
    }

    public void setAtendida() {
        this.foiAtendida = true;
    }

    @Override
    public String toString() {
        return new StringBuilder("Dados da ligação:\n")
                .append("\tnumeroOut: ").append(this.numeroOut)
                .append("\tnumeroIn: ").append(this.numeroIn)
                .append("\thorarioInicial: ").append(this.horarioInicial)
                .append("\thorarioFinal: ").append(this.horarioFinal)
                .append("\tcorreioDeVoz: ").append(this.correioDeVoz)
                .append("\tfoiAtendida: ").append(this.foiAtendida)
                .toString();
    }
}
