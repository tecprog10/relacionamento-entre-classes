public class Departamento {
    private String nome;
    // A referência para a universidade ainda existe
    private Universidade universidade;

    /**
     * Construtor para criar um Departamento de forma independente.
     * A universidade será associada depois.
     */
    public Departamento(String nome) {
        this.nome = nome;
        this.universidade = null; // Começa sem universidade afiliada
    }

    public String getNome() {
        return this.nome;
    }

    public Universidade getUniversidade() {
        return this.universidade;
    }
    
    /**
     * Método para definir/alterar a universidade a qual o departamento está filiado.
     * Este é o método chave para estabelecer a agregação.
     */
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
}