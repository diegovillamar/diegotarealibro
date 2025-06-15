//5 de 0 a 100 utilizando un bucle do-while.**/

import java.util.*;
public class App {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 5 del 0 al 100:");

        int i = 0;
        do {
            System.out.println(i);
            i += 5;
        } while (i <= 100);
    }
}
