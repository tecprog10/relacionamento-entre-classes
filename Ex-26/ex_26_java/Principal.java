public class Principal {

    public static void main(String[] args) {
        System.out.println("Demonstração de Agregação: Família e Pessoa\n");

        // 1. Criar os objetos Pessoa. Eles existem por conta própria.
        System.out.println("Criando objetos Pessoa independentes...");
        Pessoa pai = new Pessoa("Homer");
        Pessoa mae = new Pessoa("Marge");
        Pessoa filho1 = new Pessoa("Bart");
        Pessoa filha2 = new Pessoa("Lisa");
        Pessoa filha3 = new Pessoa("Maggie");
        
        // Neste ponto, eles ainda não têm sobrenome associado
        System.out.println("Nome do pai antes de formar a família: " + pai.getNomeCompleto());
        System.out.println("----------------------------------------------\n");

        // 2. Criar o objeto Família, agregando as Pessoas já existentes.
        System.out.println("Criando a Família Simpson e agregando as Pessoas...");
        Familia familiaSimpson = new Familia("Simpson", pai, mae);

        // 3. Adicionar os filhos à família.
        familiaSimpson.adicionarFilho(filho1);
        familiaSimpson.adicionarFilho(filha2);
        familiaSimpson.adicionarFilho(filha3);
        System.out.println("Filhos adicionados à família.\n");
        
        // 4. Testar os métodos.
        
        // Agora, as pessoas associadas à família têm nome completo.
        System.out.println("Nome completo do pai agora: " + pai.getNomeCompleto());
        System.out.println("Nome completo da filha: " + filha2.getNomeCompleto());
        System.out.println("----------------------------------------------\n");

        // 5. Listar a árvore familiar completa.
        System.out.println(familiaSimpson.listarArvoreFamiliar());

        // 6. Demonstrar a independência (o conceito de agregação).
        // Se a referência 'familiaSimpson' fosse perdida ou anulada,
        // os objetos Pessoa (pai, mae, filhos) continuariam existindo na memória.
        Pessoa lisa = filha2; // Mantemos uma referência a Lisa
        // familiaSimpson = null; // Simulando a "dissolução" da família
        
        System.out.println("Mesmo que a família fosse desfeita, o objeto 'Lisa' ainda existe:");
        System.out.println("-> " + lisa.getNome()); // O nome ainda existe
        // Note que o sobrenome seria perdido se a família fosse realmente destruída
        // e o garbage collector limpasse o objeto Família da memória.
        // No entanto, o objeto Pessoa em si permanece.
    }
}