public class Principal {
    public static void main(String[] args) {
        // --- Criação dos Clientes ---
        Cliente cliente1 = new Cliente("João da Silva", "111.222.333-44");
        Cliente cliente2 = new Cliente("Maria Oliveira", "555.666.777-88");

        // --- Criação das Contas ---
        Conta conta1 = new Conta(1001);
        Conta conta2 = new Conta(2002);
        Conta conta3 = new Conta(3003); // Conta conjunta
        Conta conta4 = new Conta(4004);

        // --- Associação Unidirecional de Cliente para Conta ---
        // Cliente 1 é titular de 3 contas
        cliente1.adicionarConta(conta1);
        cliente1.adicionarConta(conta2);
        cliente1.adicionarConta(conta3);
        
        // Tentativa de adicionar uma 4ª conta (não deve ser possível)
        cliente1.adicionarConta(conta4);

        // Cliente 2 é titular da conta conjunta
        cliente2.adicionarConta(conta3);

        System.out.println("\n### Operações Iniciais ###");
        // --- Operações na Conta 1 (apenas do Cliente 1) ---
        conta1.depositar(1500.00);
        conta1.sacar(200.00);

        // --- Operações na Conta 3 (conjunta) ---
        conta3.depositar(3000.00);
        conta3.sacar(500.00);
        
        // --- Demonstração do método aplicarRecursos() ---
        cliente1.aplicarRecursos(100);

        // --- Geração dos Relatórios ---
        System.out.println("\n### Relatórios Finais ###");
        System.out.println(cliente1.gerarRelatorio());
        System.out.println(cliente2.gerarRelatorio());
    }
}