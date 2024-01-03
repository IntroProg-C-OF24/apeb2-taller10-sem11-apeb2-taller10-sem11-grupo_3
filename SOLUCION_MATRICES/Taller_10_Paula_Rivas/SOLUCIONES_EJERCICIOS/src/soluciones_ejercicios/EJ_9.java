/*
Ejercicio 9
Con el objetivo de manipular correctamente los ciclos repetitivos anidados, se 
solicita, dado la altura de la salida, generar por pantalla las siguientes 
figuras. Nota: Ud. puede elegir libremente el caracter a mostrar en la figura.
*
* *
* * *
* * * *
 */
package soluciones_ejercicios;

import java.util.Scanner;

public class EJ_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la figura: ");
        int altura = scanner.nextInt();

        // Dibujar la figura
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
Ingrese la altura de la figura: 7
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
*/