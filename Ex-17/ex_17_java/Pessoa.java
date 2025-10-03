import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    private Universidade universidade;

    public Pessoa(){
        
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }
    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        LocalDate dataNascimento = LocalDate.of(this.anoNascimento, this.mesNascimento, this.diaNascimento);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        this.idade = Period.between(dataNascimento, dataAtual).getYears();
    }

    public void informaDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade (se estivesse vivo): " + this.idade + " anos");
        if (this.universidade != null) {
            System.out.println("Universidade em que trabalhou: " + this.universidade.getNome());
        } else {
            System.out.println("Nenhuma universidade associada.");
        }
        System.out.println("---");
    }
}