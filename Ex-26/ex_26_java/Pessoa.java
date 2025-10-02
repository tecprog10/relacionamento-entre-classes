/**
 * Representa um indivíduo.
 * Uma Pessoa pode existir independentemente de uma Família.
 */
public class Pessoa {
    private String nome;
    private Familia familia; // Referência à família da qual a pessoa faz parte
    private Pessoa pai;
    private Pessoa mae;

    /**
     * Construtor para criar uma Pessoa apenas com o nome.
     * As associações com família e pais são feitas posteriormente.
     * @param nome O primeiro nome da pessoa.
     */
    public Pessoa(String nome) {
        this.nome = nome;
        this.familia = null; // Inicialmente, a pessoa não pertence a nenhuma família
        this.pai = null;
        this.mae = null;
    }

    public String getNome() {
        return nome;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    
    // Método package-private para que apenas a classe Familia possa atribuir a família.
    void setFamilia(Familia familia) {
        this.familia = familia;
    }

    /**
     * Retorna o nome completo da pessoa, combinando seu nome com o sobrenome da família.
     * @return O nome completo (ex: "Bart Simpson") ou apenas o primeiro nome se não estiver em uma família.
     */
    public String getNomeCompleto() {
        if (this.familia != null && this.familia.getSobrenome() != null) {
            return this.nome + " " + this.familia.getSobrenome();
        }
        return this.nome; // Retorna apenas o nome se não houver família associada
    }

    @Override
    public String toString() {
        // Facilita a impressão do objeto Pessoa
        return getNomeCompleto();
    }
}