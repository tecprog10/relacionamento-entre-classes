public class Item {
    private String nome;
    private double valorUnitario;
    private int quantidade;

    /**
     * Construtor que inicializa todos os atributos do item.
     * @param nome Nome do produto.
     * @param valorUnitario Preço de uma unidade do produto.
     * @param quantidade Quantas unidades estão sendo compradas.
     */
    public Item(String nome, double valorUnitario, int quantidade) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    /**
     * Retorna o nome do item.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Calcula e retorna o valor total para este item (preço * quantidade).
     */
    public double getValorTotal() {
        return this.valorUnitario * this.quantidade;
    }

    /**
     * (Opcional, mas útil) Sobrescreve o método toString para uma exibição amigável.
     */
    @Override
    public String toString() {
        // Usando String.format para formatar a saída de valores monetários
        return String.format("%s (Qtd: %d, Preço Unit.: R$ %.2f, Subtotal: R$ %.2f)",
                this.nome, this.quantidade, this.valorUnitario, this.getValorTotal());
    }
}