import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    // A pessoa agora tem uma associação com um Departamento
    private Departamento departamento;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    // Método para associar um departamento a esta pessoa
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Imprime os dados da pessoa, incluindo o departamento e a universidade
     * associada a esse departamento.
     */
    public void imprimeInformacoes() {
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(this.dataNascimento, hoje).getYears();

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade (se estivesse vivo): " + idade + " anos");

        // Verifica se a pessoa tem um departamento associado
        if (this.departamento != null) {
            // Imprime o nome do departamento
            System.out.println("Departamento: " + this.departamento.getNome());
            // Navega do departamento para a universidade para imprimir o nome dela
            System.out.println("Universidade: " + this.departamento.getUniversidade().getNome());
        } else {
            System.out.println("Nenhum departamento associado.");
        }
        System.out.println("----------------------------------------");
    }
}