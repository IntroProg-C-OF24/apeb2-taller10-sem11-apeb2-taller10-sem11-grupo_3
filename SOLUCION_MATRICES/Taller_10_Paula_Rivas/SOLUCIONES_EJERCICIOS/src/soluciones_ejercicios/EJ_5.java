/*
Ejercicio 5
Desarrolla una solución que permita multiplicar dos matrices bidimensionales.
El usuario debe ingresar las dimensiones y los elementos de ambas matrices.
Realiza la multiplicación y muestra el resultado al final. Nota: Las matrices 
se deben llenar con número aleatorios únicos enteros positivos o negativos
(-9-0, 0-9).
 */
package soluciones_ejercicios;
import java.util.Scanner;
public class EJ_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filasMatrizA, columnasMatrizA, filasMatrizB, columnasMatrizB;
        int[][] resultado;

        System.out.println("Ingrese el numero de filas de la matriz A:");
        filasMatrizA = scanner.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz A:");
        columnasMatrizA = scanner.nextInt();
        int[][] matrizA = new int[filasMatrizA][columnasMatrizA];

        System.out.println("Ingrese el numero de filas de la matriz B:");
        filasMatrizB = scanner.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz B:");
        columnasMatrizB = scanner.nextInt();
        int[][] matrizB = new int[filasMatrizB][columnasMatrizB];

        if (columnasMatrizA != filasMatrizB) {
            System.out.println("No se pueden multiplicar las matrices. El numero de columnas de A debe ser igual al numero de filas de B.");
        } else {
            resultado = new int[filasMatrizA][columnasMatrizB];

            System.out.println("Matriz A:");
            for (int i = 0; i < filasMatrizA; i++) {
                for (int j = 0; j < columnasMatrizA; j++) {
                    matrizA[i][j] = (int) (Math.random() * 19 - 9);
                    System.out.print(matrizA[i][j] + "  | ");
                }
                System.out.println();
            }

            System.out.println("Matriz B:");
            for (int i = 0; i < filasMatrizB; i++) {
                for (int j = 0; j < columnasMatrizB; j++) {
                    matrizB[i][j] = (int) (Math.random() * 19 - 9);
                    System.out.print(matrizB[i][j] + "  | ");
                }
                System.out.println();
            }

            System.out.println("Resultado de la multiplicacion:");
            for (int i = 0; i < filasMatrizA; i++) {
                for (int j = 0; j < columnasMatrizB; j++) {
                    resultado[i][j] = matrizA[i][j] * matrizB[i][j];
                    System.out.print(resultado[i][j] + "  | ");
                }
                System.out.println();
            }
        }
    }
}
/*
Matriz A:
5  | 2  | 1  | 
6  | -8  | 7  | 
9  | -4  | -2  | 
Matriz B:
7  | 7  | -7  | 
2  | 4  | 0  | 
8  | -2  | -3  | 
Resultado de la multiplicacion:
35  | 14  | -7  | 
12  | -32  | 0  | 
72  | 8  | 6  | 
*/

