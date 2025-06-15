//numero de multiplicacion**/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir el primer número
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        // Pedir el segundo número
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcular la multiplicación
        double resultado = numero1 * numero2;

        // Mostrar el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        // Cerrar el Scanner
        scanner.close();
    }
}
