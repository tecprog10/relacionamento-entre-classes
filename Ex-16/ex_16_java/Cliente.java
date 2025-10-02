public class Cliente {
    private String nome;
    private String cpf;
    // Atributo do link para a associação unidirecional com Conta
    private Conta[] contas;
    private int indiceContas; // Para controlar o número de contas adicionadas

    /**
     * Construtora para iniciar os atributos do cliente.
     * @param nome O nome do cliente.
     * @param cpf O CPF do cliente.
     */
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new Conta[3]; // Cliente pode ter até 3 contas
        this.indiceContas = 0;
    }

    /**
     * Adiciona uma conta ao cliente, se houver espaço.
     * @param conta A conta a ser adicionada.
     */
    public void adicionarConta(Conta conta) {
        if (indiceContas < 3) {
            this.contas[indiceContas] = conta;
            this.indiceContas++;
            System.out.println("Conta " + conta.getNumero() + " adicionada ao cliente " + this.nome);
        } else {
            System.out.println("Limite de contas atingido para o cliente " + this.nome);
        }
    }

    /**
     * Aplica um valor de recursos (depósito) em todas as contas do cliente.
     * @param valor O valor a ser depositado em cada conta.
     */
    public void aplicarRecursos(int valor) {
        System.out.println("\n-- Aplicando recursos de R$" + valor + " para o cliente " + this.nome + " --");
        for (int i = 0; i < indiceContas; i++) {
            contas[i].depositar(valor);
        }
    }

    /**
     * Gera um relatório com os dados do cliente e o saldo de suas contas.
     * @return Uma String com o relatório completo.
     */
    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("========================================\n");
        relatorio.append("Relatório do Cliente\n");
        relatorio.append("========================================\n");
        relatorio.append("Nome: ").append(this.nome).append("\n");
        relatorio.append("CPF: ").append(this.cpf).append("\n\n");
        relatorio.append("--- Contas Associadas ---\n");

        if (indiceContas == 0) {
            relatorio.append("Nenhuma conta associada.\n");
        } else {
            for (int i = 0; i < indiceContas; i++) {
                relatorio.append("Conta Número: ").append(contas[i].getNumero()).append("\n");
                relatorio.append(String.format("Saldo: R$%.2f\n", contas[i].getSaldo()));
                relatorio.append("----------------------------------------\n");
            }
        }
        return relatorio.toString();
    }
}
