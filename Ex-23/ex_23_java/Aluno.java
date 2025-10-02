/**
 * Representa um aluno com nome e duas notas parciais.
 */
public class Aluno {
    // Atributos
    private int primeiraNotaParcial;
    private int segundaNotaParcial;
    private String nome;

    /**
     * Construtora para criar um objeto Aluno com todos os dados.
     * @param nome O nome do aluno.
     * @param primeiraNota A primeira nota parcial (0-100).
     * @param segundaNota A segunda nota parcial (0-100).
     */
    public Aluno(String nome, int primeiraNota, int segundaNota) {
        this.nome = nome;
        this.primeiraNotaParcial = primeiraNota;
        this.segundaNotaParcial = segundaNota;
    }

    // Métodos para ler os atributos (Getters)
    public int getPrimeiraNotaParcial() {
        return primeiraNotaParcial;
    }

    public int getSegundaNotaParcial() {
        return segundaNotaParcial;
    }

    public String getNome() {
        return nome;
    }

    // Métodos para escrever nos atributos (Setters)
    public void setPrimeiraNotaParcial(int primeiraNotaParcial) {
        this.primeiraNotaParcial = primeiraNotaParcial;
    }

    public void setSegundaNotaParcial(int segundaNotaParcial) {
        this.segundaNotaParcial = segundaNotaParcial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Calcula a média final do aluno.
     * @return A média aritmética das duas notas parciais.
     */
    public double calcularMedia() {
        return (this.primeiraNotaParcial + this.segundaNotaParcial) / 2.0;
    }
}