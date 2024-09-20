public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Testesssss", "Davinci");

        livro.adicionarPagina("wellcom hell.");
        livro.adicionarPagina("Bay Bay, Thi's and love.");
        livro.adicionarPagina("take take and cook");

        livro.exibirLivro();
    }
}
