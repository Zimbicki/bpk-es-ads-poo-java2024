import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public void adicionarPagina(String conteudo) {
        int numeroPagina = paginas.size() + 1;
        Pagina novaPagina = new Pagina(numeroPagina, conteudo);
        paginas.add(novaPagina);
    }

    public void exibirLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas:");
        for (Pagina pagina : paginas) {
            System.out.println(pagina);
        }
    }
}
