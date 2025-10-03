public class Principal {
    public static void main(String[] args) {
        // 1. Criar as Universidades
        Universidade princeton = new Universidade("Universidade de Princeton");
        Universidade cambridge = new Universidade("Universidade de Cambridge");

        Departamento deptoFisica = new Departamento("Departamento de Física");
        Departamento deptoMatematica = new Departamento("Departamento de Matemática");
        Departamento deptoEngenharia = new Departamento("Departamento de Engenharia Elétrica");
        Departamento deptoLetras = new Departamento("Departamento de Literatura Clássica");
        
        // 3. Afiliando (agregando) os departamentos às universidades
        princeton.adicionarDepartamento(deptoFisica);
        princeton.adicionarDepartamento(deptoEngenharia);
        
        cambridge.adicionarDepartamento(deptoMatematica);
        cambridge.adicionarDepartamento(deptoLetras);


        // 4. Listando os departamentos de cada universidade para verificar
        System.out.println("\n========================================");
        princeton.listarDepartamentos();
        System.out.println();
        cambridge.listarDepartamentos();
        System.out.println("========================================\n");

        // 5. Criar e associar Pessoas aos departamentos
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        einstein.setDepartamento(deptoFisica);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);
        newton.setDepartamento(deptoMatematica);
        // Criando uma nova pessoa para associar a um dos novos departamentos
        Pessoa turing = new Pessoa("Alan Turing", 23, 6, 1912);
        turing.setDepartamento(deptoMatematica);


        //Imprimindo informações
        einstein.imprimeInformacoes();
        newton.imprimeInformacoes();
        turing.imprimeInformacoes();
    }
}