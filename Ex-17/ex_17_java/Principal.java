import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
    
        Universidade princeton = new Universidade("Princeton (Nova Jersey - Estados Unidos da América)");
        Universidade cambridge = new Universidade("Cambridge (Inglaterra)"); 

        //Criação de Einstein
        Pessoa einstein = new Pessoa();
        einstein.setNome("Albert Einstein"); 
        einstein.setDataDeNascimento(14, 3, 1879);
        einstein.setUniversidade(princeton);

        //Criação de newton
        Pessoa newton = new Pessoa();
        newton.setNome("Isaac Newton"); 
        newton.setDataDeNascimento(4, 1, 1643);
        newton.setUniversidade(cambridge); 

        // Obtém a data atual para o cálculo da idade
        LocalDate hoje = LocalDate.now();
        int diaAtual = hoje.getDayOfMonth();
        int mesAtual = hoje.getMonthValue();
        int anoAtual = hoje.getYear();
        einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        einstein.informaDados();
        newton.informaDados();
    }
}