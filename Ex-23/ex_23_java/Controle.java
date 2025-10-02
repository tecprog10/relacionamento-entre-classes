import java.util.Scanner;

/**
 * Classe principal para interação com o usuário e controle do sistema de turmas.
 */
public class Controle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Criar a Turma
        System.out.println("--- Cadastro da Turma ---");
        System.out.print("Digite o nome da turma (Ex: POO - T01): ");
        String nomeTurma = scanner.nextLine();
        System.out.print("Digite o número de vagas: ");
        int vagas = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha pendente

        Turma turma = new Turma(nomeTurma, vagas);
        System.out.println("Turma '" + nomeTurma + "' criada com sucesso!\n");

        // 2. Laço principal do menu
        int opcao;
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1) Matricular novo aluno");
            System.out.println("2) Cancelar matrícula de aluno");
            System.out.println("3) Gerar relatório da turma");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 1: // Matricular Aluno
                    System.out.println("\n--- Matricular Aluno ---");
                    System.out.print("Digite o nome do aluno (ou 'fim' para voltar): ");
                    String nomeAluno = scanner.nextLine();
                    
                    if (nomeAluno.equalsIgnoreCase("fim")) {
                        break;
                    }
                    
                    System.out.print("Digite a primeira nota parcial (0-100): ");
                    int nota1 = scanner.nextInt();
                    System.out.print("Digite a segunda nota parcial (0-100): ");
                    int nota2 = scanner.nextInt();
                    scanner.nextLine(); // Consome a quebra de linha

                    Aluno novoAluno = new Aluno(nomeAluno, nota1, nota2);
                    if (turma.matricularAluno(novoAluno)) {
                        System.out.println("-> Aluno matriculado com sucesso!");
                    } else {
                        System.out.println("-> ERRO: Matrícula não realizada. A turma está cheia.");
                    }
                    break;

                case 2: // Cancelar Matrícula
                    System.out.println("\n--- Cancelar Matrícula ---");
                    System.out.print("Digite o nome do aluno a ser removido: ");
                    String nomeParaCancelar = scanner.nextLine();
                    
                    if (turma.cancelarMatricula(nomeParaCancelar)) {
                        System.out.println("-> Matrícula de '" + nomeParaCancelar + "' cancelada.");
                    } else {
                        System.out.println("-> ERRO: Aluno '" + nomeParaCancelar + "' não encontrado.");
                    }
                    break;

                case 3: // Gerar Relatório
                    System.out.println("\n--- Relatório ---");
                    System.out.println(turma.gerarRelatorio());
                    break;

                case 4: // Sair
                    System.out.println("Encerrando o programa. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }

        } while (opcao != 4);

        scanner.close(); // Fecha o scanner ao final do programa
    }
}