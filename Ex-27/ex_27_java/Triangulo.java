/**
 * Representa um triângulo no plano cartesiano.
 * Esta classe é COMPOSTA por três objetos da classe Ponto.
 */
public class Triangulo {
    // Os vértices são partes integrantes do triângulo.
    // Eles são criados e gerenciados pela classe Triangulo.
    private Ponto verticeA;
    private Ponto verticeB;
    private Ponto verticeC;

    /**
     * Construtor para criar um Triangulo a partir das coordenadas de seus vértices.
     * Os objetos Ponto são instanciados aqui, demonstrando a composição.
     * @param xA Coordenada X do vértice A.
     * @param yA Coordenada Y do vértice A.
     * @param xB Coordenada X do vértice B.
     * @param yB Coordenada Y do vértice B.
     * @param xC Coordenada X do vértice C.
     * @param yC Coordenada Y do vértice C.
     */
    public Triangulo(double xA, double yA, double xB, double yB, double xC, double yC) {
        this.verticeA = new Ponto(xA, yA);
        this.verticeB = new Ponto(xB, yB);
        this.verticeC = new Ponto(xC, yC);
    }

    /**
     * Calcula o perímetro do triângulo.
     * O perímetro é a soma das distâncias entre seus vértices (comprimento dos lados).
     * @return O valor do perímetro.
     */
    public double calcularPerimetro() {
        // Reusa o método distanciaAte da classe Ponto
        double ladoAB = verticeA.distanciaAte(verticeB);
        double ladoBC = verticeB.distanciaAte(verticeC);
        double ladoCA = verticeC.distanciaAte(verticeA);

        return ladoAB + ladoBC + ladoCA;
    }
}