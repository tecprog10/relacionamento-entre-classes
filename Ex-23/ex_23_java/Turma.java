import java.util.ArrayList;
import java.util.Iterator;

/**
 * Representa uma turma (disciplina) com um conjunto de alunos.
 */
public class Turma {
    // Atributos
    private ArrayList<Aluno> alunos;
    private int numeroDeVagas;
    private String nomeDaTurma;

    /**
     * Construtora para criar uma Turma.
     * @param nomeDaTurma O nome da disciplina e código (ex: "Programação II - T01").
     * @param numeroDeVagas O número máximo de alunos na turma.
     */
    public Turma(String nomeDaTurma, int numeroDeVagas) {
        this.nomeDaTurma = nomeDaTurma;
        this.numeroDeVagas = numeroDeVagas;
        this.alunos = new ArrayList<>(); // Inicializa a coleção de alunos
    }
    
    /**
     * Matricula um aluno na turma, se houver vaga disponível.
     * @param aluno O objeto Aluno a ser matriculado.
     * @return true se a matrícula foi bem-sucedida, false caso contrário.
     */
    public boolean matricularAluno(Aluno aluno) {
        if (alunos.size() < numeroDeVagas) {
            alunos.add(aluno);
            return true;
        }
        return false; // Turma cheia
    }

    /**
     * Cancela a matrícula de um aluno pelo nome.
     * @param nomeAluno O nome do aluno a ser removido.
     * @return true se o aluno foi encontrado e removido, false caso contrário.
     */
    public boolean cancelarMatricula(String nomeAluno) {
        // Usamos um Iterator para remover um item enquanto percorremos a lista
        // de forma segura e evitar ConcurrentModificationException.
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            Aluno aluno = iterator.next();
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                iterator.remove();
                return true; // Aluno encontrado e removido
            }
        }
        return false; // Aluno não encontrado
    }

    /**
     * Gera um relatório completo sobre o desempenho da turma.
     * @return Uma String formatada com as estatísticas da turma.
     */
    public String gerarRelatorio() {
        if (alunos.isEmpty()) {
            return "Relatório da Turma: " + nomeDaTurma + "\nNão há alunos matriculados.";
        }

        double somaDasMedias = 0;
        int aprovados = 0;
        int finalistas = 0;
        int reprovados = 0;
        ArrayList<String> alunosAbaixoDaMedia = new ArrayList<>();

        // 1. Calcular a média da turma
        for (Aluno aluno : alunos) {
            somaDasMedias += aluno.calcularMedia();
        }
        double mediaDaTurma = somaDasMedias / alunos.size();

        // 2. Contar status e identificar alunos abaixo da média
        // Critérios de avaliação (padrão comum):
        // Aprovado: Média >= 70
        // Final: 40 <= Média < 70
        // Reprovado: Média < 40
        for (Aluno aluno : alunos) {
            double mediaAluno = aluno.calcularMedia();
            if (mediaAluno >= 70) {
                aprovados++;
            } else if (mediaAluno >= 40) {
                finalistas++;
            } else {
                reprovados++;
            }

            if (mediaAluno < mediaDaTurma) {
                alunosAbaixoDaMedia.add(aluno.getNome());
            }
        }
        
        // 3. Montar a String do relatório usando StringBuilder para eficiência
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("===== Relatório da Turma: ").append(nomeDaTurma).append(" =====\n");
        relatorio.append(String.format("Média geral da turma: %.2f\n", mediaDaTurma));
        relatorio.append("----------------------------------------\n");
        relatorio.append("Total de Alunos: ").append(alunos.size()).append("\n");
        relatorio.append("Alunos Aprovados: ").append(aprovados).append("\n");
        relatorio.append("Alunos em Final: ").append(finalistas).append("\n");
        relatorio.append("Alunos Reprovados: ").append(reprovados).append("\n");
        relatorio.append("----------------------------------------\n");
        relatorio.append("Alunos com nota abaixo da média da turma:\n");
        if (alunosAbaixoDaMedia.isEmpty()) {
            relatorio.append("- Nenhum aluno abaixo da média.\n");
        } else {
            for (String nome : alunosAbaixoDaMedia) {
                relatorio.append("- ").append(nome).append("\n");
            }
        }
        relatorio.append("========================================\n");
        
        return relatorio.toString();
    }
}