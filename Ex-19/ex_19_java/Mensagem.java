public class Mensagem {
    private String texto = ""; // Inicializado para permitir a concatenação

    /**
     * Adiciona (concatena) um novo trecho de texto à mensagem existente.
     */
    public void addMensagem(String textoAdicional) {
        this.texto += textoAdicional;
    }

    /**
     * Retorna o texto completo da mensagem.
     */
    public String getMensagem() {
        return this.texto;
    }
}