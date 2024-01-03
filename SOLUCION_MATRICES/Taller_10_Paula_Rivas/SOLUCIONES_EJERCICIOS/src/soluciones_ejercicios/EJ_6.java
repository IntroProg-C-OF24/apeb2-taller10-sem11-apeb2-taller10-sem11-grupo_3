/*
Ejercicio 6
Desarrolla una solución en pseudocódigo que permita mediante un menú 
(al estilo calculadora matemática), facilitar las operaciones de suma, 
resta de dos matrices. Considerar la validación de las reglas para realizar 
estas operaciones. Nota: Las matrices se deben llenar con número aleatorios 
únicos enteros positivos o negativos (-9-0, 0-9)
 */
package soluciones_ejercicios;
import java.util.Scanner;
import java.util.Random;
public class EJ_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        double[][] matrizA = new double[2][2];
        double[][] matrizB = new double[2][2];
        double[][] resultado = new double[2][2];
        boolean continuar = true;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizA[i][j] = random.nextInt(19) - 9;
                matrizB[i][j] = random.nextInt(19) - 9;
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizA[i][j] + "  | ");
            }
            System.out.println();
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizB[i][j] + "  | ");
            }
            System.out.println();
        }

        while (continuar) {
            System.out.println("Seleccione la operacion a realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("Ingrese una opcion: ");
            String opcion = teclado.nextLine();

            switch (opcion) {
                case "1" -> {
                    System.out.println("Suma de matrices:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            resultado[i][j] = matrizA[i][j] + matrizB[i][j];
                            System.out.print(resultado[i][j] + "  | ");
                        }
                        System.out.println();
                    }
                    continuar = false;
                }
                case "2" -> {
                    System.out.println("Resta de matrices:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            resultado[i][j] = matrizA[i][j] - matrizB[i][j];
                            System.out.print(resultado[i][j] + "  | ");
                        }
                        System.out.println();
                    }
                    continuar = false;
                }
                case "3" -> {
                    System.out.println("Multiplicacion elemento por elemento de matrices:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            resultado[i][j] = matrizA[i][j] * matrizB[i][j];
                            System.out.print(resultado[i][j] + "  | ");
                        }
                        System.out.println();
                    }
                    continuar = false;
                }
                case "4" -> {
                    System.out.println("Division de matrices:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (matrizB[i][j] != 0) {
                                resultado[i][j] = matrizA[i][j] / matrizB[i][j];
                            } else {
                                resultado[i][j] = 0;
                            }
                            System.out.print(resultado[i][j] + "  | ");
                        }
                        System.out.println();
                    }
                    continuar = false;
                }
            }
        }       
    }
}
/*
Matriz A:
2.0  | 6.0  | 
-5.0  | 3.0  | 
Matriz B:
9.0  | -9.0  | 
-4.0  | -2.0  | 
Seleccione la operacion a realizar:
1. Suma
2. Resta
3. Multiplicacion
4. Division
Ingrese una opcion: 
4
Division de matrices:
0.2222222222222222  | -0.6666666666666666  | 
1.25  | -1.5  | 
*/

