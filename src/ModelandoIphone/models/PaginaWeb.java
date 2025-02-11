package ModelandoIphone.models;

public class PaginaWeb extends NamedMedia {
    private String url;

    public PaginaWeb(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    @Override
    public String toString() {
        return new StringBuilder("Dados da Página:\n")
                .append("\tTítulo: ").append(this.titulo)
                .append("\tURL: ").append(this.url)
                .toString();
    }
}
