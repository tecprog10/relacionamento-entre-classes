import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Relação de agregação: o carrinho "tem" uma lista de itens.
    // Usamos ArrayList para facilitar a adição e remoção.
    private List<Item> itens;

    /**
     * Construtor que inicializa a lista de itens do carrinho.
     */
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    /**
     * Adiciona um item (previamente criado) ao carrinho.
     * @param i O objeto Item a ser adicionado.
     */
    public void adicionarItem(Item i) {
        this.itens.add(i);
        System.out.println(">> Item '" + i.getNome() + "' adicionado ao carrinho.");
    }

    /**
     * Remove um item específico do carrinho.
     * @param i O objeto Item a ser removido.
     */
    public void removerItem(Item i) {
        boolean foiRemovido = this.itens.remove(i);
        if (foiRemovido) {
            System.out.println(">> Item '" + i.getNome() + "' removido do carrinho.");
        } else {
            System.out.println(">> Item '" + i.getNome() + "' não foi encontrado no carrinho para remoção.");
        }
    }

    /**
     * Calcula o valor total do carrinho somando o valor total de cada item.
     * @return O valor total (double) de todos os itens no carrinho.
     */
    public double getValorTotal() {
        double total = 0.0;
        // Itera sobre cada item na lista
        for (Item item : this.itens) {
            // Soma o valor total de cada item ao total do carrinho
            total += item.getValorTotal();
        }
        return total;
    }
    
    /**
     * (Opcional, mas útil) Método para listar todos os itens presentes no carrinho.
     */
    public void listarItens() {
        System.out.println("\n--- Itens no Carrinho ---");
        if (this.itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            for (Item item : this.itens) {
                System.out.println(item); // Chama o método toString() do Item
            }
        }
        System.out.println("-------------------------");
    }
}