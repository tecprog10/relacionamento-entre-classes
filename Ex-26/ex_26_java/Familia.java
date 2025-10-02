import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma família, que é um agrupamento de Pessoas.
 * A Família "agrega" objetos Pessoa.
 */
public class Familia {
    private String sobrenome;
    private Pessoa principal; // Ex: o pai ou a mãe
    private Pessoa conjuge;
    private List<Pessoa> filhos;

    /**
     * Construtor para criar uma Família.
     * @param sobrenome O sobrenome da família.
     * @param principal A pessoa principal da família.
     * @param conjuge O(A) cônjuge da pessoa principal (pode ser null).
     */
    public Familia(String sobrenome, Pessoa principal, Pessoa conjuge) {
        this.sobrenome = sobrenome;
        this.principal = principal;
        this.conjuge = conjuge;
        this.filhos = new ArrayList<>();

        // Associa esta família às pessoas fundadoras
        this.principal.setFamilia(this);
        if (this.conjuge != null) {
            this.conjuge.setFamilia(this);
        }
    }

    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Adiciona um filho à lista de filhos da família.
     * Também estabelece a relação de paternidade e a qual família o filho pertence.
     * @param filho O objeto Pessoa a ser adicionado como filho.
     */
    public void adicionarFilho(Pessoa filho) {
        this.filhos.add(filho);
        filho.setFamilia(this); // O filho agora pertence a esta família
        filho.setPai(this.principal); // Define o pai
        filho.setMae(this.conjuge); // Define a mãe
    }

    /**
     * Gera uma representação em String da árvore familiar.
     * @return Uma String formatada com os membros da família.
     */
    public String listarArvoreFamiliar() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== Família ").append(this.sobrenome).append(" =====\n");
        
        sb.append("Pais:\n");
        sb.append("-> ").append(principal.getNomeCompleto()).append("\n");
        if (conjuge != null) {
            sb.append("-> ").append(conjuge.getNomeCompleto()).append("\n");
        }
        
        sb.append("\nFilhos:\n");
        if (filhos.isEmpty()) {
            sb.append("- Nenhum filho cadastrado.\n");
        } else {
            for (Pessoa filho : filhos) {
                sb.append("-> ").append(filho.getNomeCompleto()).append("\n");
            }
        }
        sb.append("=========================\n");
        return sb.toString();
    }
}