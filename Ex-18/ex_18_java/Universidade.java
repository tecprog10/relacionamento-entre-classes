import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    // Uma universidade "tem" uma lista de departamentos (Composição)
    private List<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>(); // Inicializa a lista
    }

    public String getNome() {
        return this.nome;
    }

    /**
     * Adiciona um novo departamento a esta universidade.
     * Este método cria o departamento e o associa diretamente a esta instância
     * de universidade, reforçando a relação de composição.
     */
    public Departamento adicionarDepartamento(String nomeDepto) {
        Departamento novoDepto = new Departamento(nomeDepto, this);
        this.departamentos.add(novoDepto);
        return novoDepto;
    }
}