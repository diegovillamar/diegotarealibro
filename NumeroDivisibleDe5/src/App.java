//Numero divisible de 5**/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        boolean esPar = (numero % 2 == 0);
        boolean divisible5 = (numero % 5 == 0);

        if (esPar && divisible5) {
            System.out.println("El número es par y divisible entre 5.");
        } else if (esPar) {
            System.out.println("El número es par pero no divisible entre 5.");
        } else if (divisible5) {
            System.out.println("El número es divisible entre 5 pero no es par.");
        } else {
            System.out.println("El número no es ni par ni divisible entre 5.");
        }

        scanner.close();
    }
}
