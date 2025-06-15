//realizar un conversor kb a mb**/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los KB
        System.out.print("Ingresa la cantidad de Kilobytes (KB): ");
        double kilobytes = scanner.nextDouble();

        // Convertir KB a MB (1 MB = 1024 KB)
        double megabytes = kilobytes / 1024;

        // Mostrar el resultado
        System.out.println(kilobytes + " KB equivalen a " + megabytes + " MB");

        // Cerrar el Scanner
        scanner.close();
    }
}
