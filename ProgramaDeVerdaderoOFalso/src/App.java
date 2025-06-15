//verdadero o falso**/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        // Preguntas del test
        String[] preguntas = {
            "1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.",
            "2. Ha aumentado sus gastos de vestuario.",
            "3. Ha perdido el interés que mostraba anteriormente por ti.",
            "4. Ahora se afeita/se arregla el pelo y se asea con más frecuencia.",
            "5. No te deja que mires la agenda de su teléfono móvil.",
            "6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.",
            "7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.",
            "8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.",
            "9. Has notado que últimamente se perfuma más.",
            "10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo."
        };

        System.out.println("Contesta con 'verdadero' o 'falso'.\n");

        // Ciclo de preguntas
        for (String pregunta : preguntas) {
            System.out.println(pregunta);
            System.out.print("Respuesta: ");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            if (respuesta.equals("verdadero")) {
                puntos += 3;
            }
        }

        // Resultado final
        System.out.println("\n--- RESULTADO DEL TEST ---");
        if (puntos >= 0 && puntos <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (puntos <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente,\naunque seguramente será algo sin importancia. No bajes la guardia.");
        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.\nTe aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }

        scanner.close();
    }
}
