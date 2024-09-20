public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua Principal", "São Paulo", "SP");


        Pessoa cliente = new Pessoa("João Silva", endereco);


        Item item1 = new Item("16mil", 35.00);
        Item item2 = new Item("Rcuzinho do luan", 5.00);


        Pedido pedido = new Pedido(cliente);


        pedido.adicionarItem(item1, 2); // 2 pizzas
        pedido.adicionarItem(item2, 5); // 3 refrigerantes


        pedido.gerarComanda();
    }
}
