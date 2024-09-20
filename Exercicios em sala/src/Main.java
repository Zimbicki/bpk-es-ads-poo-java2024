public class Main {
    public static void main(String[] args) {
        // Criando pessoas
        Pessoa pai = new Pessoa("Carlos", 50);
        Pessoa mae = new Pessoa("Ana", 48);
        Pessoa filho = new Pessoa("João", 20);

        // Definindo pai e mãe do João
        filho.setPai(pai);
        filho.setMae(mae);

        // Exibindo informações do filho
        filho.exibirInformacoes();
    }
}
