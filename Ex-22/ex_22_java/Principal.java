public class Principal {
    public static void main(String[] args) {
        // 1. Criar os objetos Item de forma independente
        System.out.println("Criando itens disponíveis para compra...");
        Item item1 = new Item("Headset Gamer HyperX", 450.00, 1);
        Item item2 = new Item("Mousepad Speed Grande", 79.90, 1);
        Item item3 = new Item("Memória RAM DDR4 8GB", 180.00, 2); // Comprando 2 unidades
        Item item4 = new Item("SSD NVMe 1TB", 550.00, 1);

        // 2. Criar o CarrinhoDeCompras
        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
        System.out.println("\nIniciando processo de compra...\n");

        // 3. Adicionar itens ao carrinho (exercitando o método adicionarItem)
        meuCarrinho.adicionarItem(item1);
        meuCarrinho.adicionarItem(item2);
        meuCarrinho.adicionarItem(item3);
        meuCarrinho.adicionarItem(item4);
        
        // 4. Listar os itens e mostrar o valor total
        meuCarrinho.listarItens();
        System.out.printf("Valor Parcial do Carrinho: R$ %.2f\n", meuCarrinho.getValorTotal());

        // 5. Remover um item do carrinho (exercitando o método removerItem)
        System.out.println("\nCliente se arrependeu e removeu o mousepad...");
        meuCarrinho.removerItem(item2);

        // 6. Listar os itens novamente e mostrar o valor final
        meuCarrinho.listarItens();
        System.out.printf("Valor Final do Carrinho: R$ %.2f\n", meuCarrinho.getValorTotal());
    }
}