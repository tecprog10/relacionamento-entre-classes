public class EMail {
    // Atributos por composição: o EMail "tem um" Assunto e "tem uma" Mensagem.
    private Assunto assunto;
    private Mensagem mensagem;

    /**
     * Construtor do EMail.
     * É aqui que a composição acontece: o EMail cria e gerencia
     * seus próprios objetos Assunto e Mensagem.
     */
    public EMail() {
        this.assunto = new Assunto();
        this.mensagem = new Mensagem();
    }

    /**
     * Método "delegado": o EMail recebe a chamada, mas delega a ação
     * para o objeto especialista, que é o 'assunto'.
     */
    public void setConteudoAssunto(String textoAssunto) {
        this.assunto.setTexto(textoAssunto);
    }

    /**
     * Método "delegado": o EMail delega a ação de adicionar texto
     * para o objeto 'mensagem'.
     */
    public void addTextoMensagem(String textoAdicional) {
        this.mensagem.addMensagem(textoAdicional);
    }

    /**
     * Mostra os dados formatados no console, buscando as informações
     * de seus objetos componentes.
     */
    public void mostraDados() {
        System.out.println("======================================");
        System.out.println("Assunto: " + this.assunto.getTexto());
        System.out.println("--------------------------------------");
        System.out.println("Mensagem:");
        System.out.println(this.mensagem.getMensagem());
        System.out.println("======================================");
    }
}