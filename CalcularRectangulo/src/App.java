//calcular el rectangulo**/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la base del rectángulo
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();

        // Pedir al usuario la altura del rectángulo
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área
        double area = base * altura;

        // Mostrar el resultado
        System.out.println("El área del rectángulo es: " + area);

        // Cerrar el scanner
        scanner.close();
    }
}
