
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos
        System.out.print("Ingresa tu nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingresa tu número de teléfono: ");
        String telefono = scanner.nextLine();

        // Mostrar los datos ingresados
        System.out.println("\n--- DATOS INGRESADOS ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
