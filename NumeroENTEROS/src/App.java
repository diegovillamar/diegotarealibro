//calcula los numeros enteros**/

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para guardar los 3 números
        int[] numeros = new int[3];

        // Pedir al usuario que ingrese los tres números
        System.out.print("Ingresa el primer número: ");
        numeros[0] = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        numeros[1] = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        numeros[2] = scanner.nextInt();

        // Ordenar los números usando Arrays.sort
        Arrays.sort(numeros);

        // Mostrar los números ordenados
        System.out.println("Números ordenados de menor a mayor:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
