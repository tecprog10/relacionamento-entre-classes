public class Principal {
    public static void main(String[] args) {
        // 1. Criar os objetos de Universidade
        Universidade princeton = new Universidade("Universidade de Princeton");
        Universidade cambridge = new Universidade("Universidade de Cambridge");

        // 2. Adicionar os departamentos às suas respectivas universidades
        // O próprio método já retorna o departamento criado para podermos usá-lo
        Departamento deptoFisica = princeton.adicionarDepartamento("Departamento de Física");
        Departamento deptoMatematica = cambridge.adicionarDepartamento("Departamento de Matemática");

        // 3. Criar os objetos de Pessoa
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        // 4. Associar cada pessoa ao seu departamento de trabalho
        einstein.setDepartamento(deptoFisica);
        newton.setDepartamento(deptoMatematica);

        // 5. Imprimir as informações
        System.out.println("INFORMAÇÕES DAS PERSONALIDADES:");
        System.out.println("========================================");
        
        einstein.imprimeInformacoes();
        newton.imprimeInformacoes();
    }
}