/**
 * Representa um ponto no plano cartesiano com coordenadas (x, y).
 */
public class Ponto {
    private double x;
    private double y;

    /**
     * Construtor para criar um Ponto.
     * @param x A coordenada do eixo X.
     * @param y A coordenada do eixo Y.
     */
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters para acessar as coordenadas
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * Calcula a distância euclidiana entre este ponto e outro ponto.
     * A fórmula da distância é: D = sqrt((x2 - x1)^2 + (y2 - y1)^2)
     * @param outroPonto O ponto de destino para o qual a distância será calculada.
     * @return A distância entre os dois pontos.
     */
    public double distanciaAte(Ponto outroPonto) {
        double deltaX = outroPonto.getX() - this.x;
        double deltaY = outroPonto.getY() - this.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
}