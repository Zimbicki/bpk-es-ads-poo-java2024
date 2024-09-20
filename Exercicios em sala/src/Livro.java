public class Livro {
    private String titulo;
    private String isbn;
    private String autor;
    private String editora;
    private int ano;
    public Livro(String titulo, String isbn, String autor, String editora, int ano) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }
}
