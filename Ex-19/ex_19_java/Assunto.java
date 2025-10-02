public class Assunto {
    private String texto = ""; // Inicializado para evitar NullPointerException

    /**
     * Define (sobrescreve) o texto completo do assunto.
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Retorna o texto do assunto.
     */
    public String getTexto() {
        return this.texto;
    }
}