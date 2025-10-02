// NENHUMA ALTERAÇÃO NECESSÁRIA NESTA CLASSE
import java.util.Calendar;

public class Pessoa {
    private String nome;
    // Atributo de data de nascimento agora é um objeto Calendar (Composição)
    private Calendar dataNascimento;
    private Departamento departamento;

    /**
     * O construtor continua recebendo dia, mês e ano para facilitar o uso,
     * mas internamente, ele monta o objeto Calendar.
     */
    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        
        // 1. Obtém uma instância de Calendar (como orientado na dica)
        this.dataNascimento = Calendar.getInstance();
        
        // 2. Ajusta a data para o nascimento da pessoa
        // ATENÇÃO: Na classe Calendar, os meses são baseados em zero (Janeiro=0, Fevereiro=1, etc.)
        // Por isso, subtraímos 1 do mês recebido.
        this.dataNascimento.set(ano, mes - 1, dia);
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Imprime os dados da pessoa. O cálculo da idade agora é feito
     * manualmente usando os dados do objeto Calendar.
     */
    public void imprimeInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade (se estivesse vivo): " + this.getIdade() + " anos");

        if (this.departamento != null) {
            System.out.println("Departamento: " + this.departamento.getNome());
            System.out.println("Universidade: " + this.departamento.getUniversidade().getNome());
        } else {
            System.out.println("Nenhum departamento associado.");
        }
        System.out.println("----------------------------------------");
    }
    
    /**
     * Método privado para calcular a idade a partir do objeto Calendar.
     */
    private int getIdade() {
        // Cria um objeto Calendar para a data de hoje
        Calendar hoje = Calendar.getInstance();

        // Obtém o ano de hoje e do nascimento
        int anoAtual = hoje.get(Calendar.YEAR);
        int anoNascimento = this.dataNascimento.get(Calendar.YEAR);

        // Calcula a diferença inicial de anos
        int idade = anoAtual - anoNascimento;

        // Obtém o mês e dia de hoje e do nascimento
        int mesAtual = hoje.get(Calendar.MONTH);
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        
        int mesNascimento = this.dataNascimento.get(Calendar.MONTH);
        int diaNascimento = this.dataNascimento.get(Calendar.DAY_OF_MONTH);

        // Se a pessoa ainda não fez aniversário neste ano, subtrai 1 da idade
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        return idade;
    }
}