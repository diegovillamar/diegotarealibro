//calcular el salario**/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario las horas trabajadas
        System.out.print("Ingresa las horas trabajadas esta semana: ");
        double horasTrabajadas = scanner.nextDouble();

        // Definir la tarifa por hora
        double tarifaHora = 12.0;

        // Calcular el salario semanal
        double salarioSemanal = horasTrabajadas * tarifaHora;

        // Mostrar el resultado
        System.out.println("El salario semanal es: " + salarioSemanal + " euros");

        // Cerrar el Scanner
        scanner.close();
    }
}
