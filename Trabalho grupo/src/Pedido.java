import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Pessoa cliente;
    private List<ItemPedido> itens;


    public Pedido(Pessoa cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }


    public void adicionarItem(Item item, int quantidade) {
        itens.add(new ItemPedido(item, quantidade));
    }


    public double calcularTotal() {
        double total = 0;
        for (ItemPedido itemPedido : itens) {
            total += itemPedido.getSubtotal();
        }
        return total;
    }


    public void gerarComanda() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Itens do Pedido:");
        for (ItemPedido itemPedido : itens) {
            System.out.println(itemPedido);
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}
