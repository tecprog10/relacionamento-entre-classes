public class Departamento {
    private String nome;
    // Referência para a universidade à qual o departamento pertence (o "todo" da composição)
    private Universidade universidade;

    // Um departamento não pode ser criado sem uma universidade associada
    public Departamento(String nome, Universidade universidade) {
        this.nome = nome;
        this.universidade = universidade;
    }

    public String getNome() {
        return this.nome;
    }

    // Método essencial para permitir a navegação: do Departamento para a Universidade
    public Universidade getUniversidade() {
        return this.universidade;
    }
}