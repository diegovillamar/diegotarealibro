//tablas de multiplicar**/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número al usuario
        System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Mostrar la tabla de multiplicar del número
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
