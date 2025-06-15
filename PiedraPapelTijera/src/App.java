//juego de piedra papel tijera**/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir jugada del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador1 = scanner.nextLine().trim().toLowerCase();

        // Pedir jugada del jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugador2 = scanner.nextLine().trim().toLowerCase();

        // Validar entradas
        boolean entradaValida1 = jugador1.equals("piedra") || jugador1.equals("papel") || jugador1.equals("tijera");
        boolean entradaValida2 = jugador2.equals("piedra") || jugador2.equals("papel") || jugador2.equals("tijera");

        if (!entradaValida1 || !entradaValida2) {
            System.out.println("¡Error! Alguno de los jugadores ha ingresado una opción no válida.");
        } else {
            // Lógica del juego
            if (jugador1.equals(jugador2)) {
                System.out.println("Empate");
            } else if (
                (jugador1.equals("piedra") && jugador2.equals("tijera")) ||
                (jugador1.equals("papel") && jugador2.equals("piedra")) ||
                (jugador1.equals("tijera") && jugador2.equals("papel"))
            ) {
                System.out.println("Gana el jugador 1");
            } else {
                System.out.println("Gana el jugador 2");
            }
        }

        scanner.close();
    }
}
