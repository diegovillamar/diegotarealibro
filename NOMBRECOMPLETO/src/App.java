 // Ejercicio 1: Crear una variable y mostrar su valor por pantalla

 import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre completo
        System.out.print("Ingresa tu nombre completo: ");
        String nombre = scanner.nextLine();

        // Mostrar el valor de la variable nombre
        System.out.println("Mi nombre es: " + nombre);

        // Cerrar el Scanner
        scanner.close();
    }
}
