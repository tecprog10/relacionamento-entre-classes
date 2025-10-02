import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Programa principal que interage com o usuário para calcular o perímetro de um triângulo.
 */
public class Principal {

    public static void main(String[] args) {
        // Configura o Locale para usar ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Perímetro de Triângulo ---");
        System.out.println("Por favor, insira as coordenadas dos três vértices.");

        try {
            // Coleta das coordenadas do Vértice A
            System.out.println("\n--- Vértice A ---");
            System.out.print("Digite a coordenada X de A: ");
            double xA = scanner.nextDouble();
            System.out.print("Digite a coordenada Y de A: ");
            double yA = scanner.nextDouble();

            // Coleta das coordenadas do Vértice B
            System.out.println("\n--- Vértice B ---");
            System.out.print("Digite a coordenada X de B: ");
            double xB = scanner.nextDouble();
            System.out.print("Digite a coordenada Y de B: ");
            double yB = scanner.nextDouble();

            // Coleta das coordenadas do Vértice C
            System.out.println("\n--- Vértice C ---");
            System.out.print("Digite a coordenada X de C: ");
            double xC = scanner.nextDouble();
            System.out.print("Digite a coordenada Y de C: ");
            double yC = scanner.nextDouble();

            // Cria o objeto Triangulo (que por sua vez cria seus Pontos)
            Triangulo meuTriangulo = new Triangulo(xA, yA, xB, yB, xC, yC);

            // Calcula o perímetro
            double perimetro = meuTriangulo.calcularPerimetro();

            // Imprime o resultado formatado
            System.out.println("\n-------------------------------------------");
            System.out.printf("O perímetro do triângulo é: %.2f\n", perimetro);
            System.out.println("-------------------------------------------");

        } catch (InputMismatchException e) {
            System.err.println("Erro: Por favor, insira apenas números válidos. Use ponto (.) para decimais.");
        } finally {
            scanner.close(); // Fecha o scanner para liberar recursos
        }
    }
}