public class ItemPedido {
    private Item item;
    private int quantidade;

        public ItemPedido(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }


    public double getSubtotal() {
        return item.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return item.getNome() + " (Quantidade: " + quantidade + ") - Subtotal: R$ " + getSubtotal();
    }
}
