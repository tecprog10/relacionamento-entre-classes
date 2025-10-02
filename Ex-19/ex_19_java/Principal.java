public class Principal {
    public static void main(String[] args) {
        // 1. Cria um objeto EMail.
        // Note que não precisamos criar Assunto e Mensagem separadamente.
        // O próprio EMail já faz isso internamente.
        EMail meuEmail = new EMail();

        System.out.println("Preenchendo os dados do e-mail...");

        // 2. Preenche o assunto e a mensagem usando os métodos do EMail.
        meuEmail.setConteudoAssunto("Reunião Semanal de Alinhamento");

        // Adicionando o texto da mensagem em partes
        meuEmail.addTextoMensagem("Olá, equipe.\n\n");
        meuEmail.addTextoMensagem("Lembrete de nossa reunião amanhã às 10h. ");
        meuEmail.addTextoMensagem("Por favor, tragam os relatórios de progresso.\n\n");
        meuEmail.addTextoMensagem("Atenciosamente,\nGerência de Projetos");

        System.out.println("...Preenchimento concluído!\n");

        // 3. Pede para o objeto EMail mostrar seus dados.
        meuEmail.mostraDados();
    }
}