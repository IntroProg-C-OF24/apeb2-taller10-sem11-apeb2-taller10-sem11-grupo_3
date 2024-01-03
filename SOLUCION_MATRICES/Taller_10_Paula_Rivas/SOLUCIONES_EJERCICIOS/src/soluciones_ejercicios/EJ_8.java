/*
Ejercicio 8
Dada una matriz cuadrada y con número aleatorios únicos enteros positivos o 
negativos (-9-0, 0-9) generados automáticamente, presente los elementos de la 
diagonal principal, los ubicados sobre la diagonal principal, y bajo dicha 
principal.
 */
package soluciones_ejercicios;

import java.util.Random;

public class EJ_8 {

    public static void main(String[] args) {
        Random random = new Random();
        int n = 4;

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(19) - 9;
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        System.out.println("Elementos sobre la diagonal principal:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();

        System.out.println("Elementos bajo la diagonal principal:");
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }
}
/*
Matriz:
-7 -4 -1 -9 
-6 -5 1 1 
2 -7 -8 -3 
0 -1 -3 -7 
Elementos de la diagonal principal:
-7 -5 -8 -7 
Elementos sobre la diagonal principal:
-4 -1 -9 1 1 -3 
Elementos bajo la diagonal principal:
-6 2 -7 0 -1 -3 
*/
