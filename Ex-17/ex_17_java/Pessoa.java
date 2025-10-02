import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Universidade universidade; // Relacionamento com a classe Universidade

    // Construtor da Pessoa
    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    // Método para associar uma universidade a esta pessoa
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    // Método que imprime os dados da pessoa no console
    public void imprimeInformacoes() {
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(this.dataNascimento, hoje).getYears();

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade (se estivesse vivo): " + idade + " anos");

        // Verifica se a pessoa tem uma universidade associada antes de imprimir
        if (this.universidade != null) {
            System.out.println("Trabalhou na: " + this.universidade.getNome());
        } else {
            System.out.println("Nenhuma universidade associada.");
        }
        System.out.println("----------------------------------------");
    }
}