package ModelandoIphone.models;

public class Navegador {
    private PaginaWeb paginaCarregada = null;

    void exibirPagina(PaginaWeb pagina) {
        this.paginaCarregada = pagina;
        System.out.println("Exibindo página: " + this.paginaCarregada.getTitulo());
    }

    void adicionarNovaAba() {
        paginaCarregada = null;
        System.out.println("Nova aba adicionada.");
    }

    void atualizarPagina() {
        System.out.println("Atualizando página: " + this.paginaCarregada.getTitulo());
    }
}
