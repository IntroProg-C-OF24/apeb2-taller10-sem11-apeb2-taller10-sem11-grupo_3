package taller.pkg10.introprog.manuel.gomez;
import java.util.Scanner;
public class MultiplicacionMatrices_Ejercicio5 {
    public static void main(String[] args) {
        int numFilas, numColumnas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de las Matrices");
        numFilas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas de las Matrices");
        numColumnas = teclado.nextInt();
        int matriz1[][] = new int[numFilas][numColumnas];
        int matriz2[][] = new int[numFilas][numColumnas];
        int resultados[][] = new int[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                matriz1[i][j] = (int)(Math.random()*20-10);
                matriz2[i][j] = (int)(Math.random()*20-10);
            }
        }
        System.out.println("\nMatriz 1 \n");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (matriz1[i][j] >= 0)
                    System.out.print("   "+matriz1[i][j]);
                else
                    System.out.print("  "+matriz1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\nMatriz 2 \n");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (matriz2[i][j] >= 0)
                    System.out.print("   "+matriz2[i][j]);
                else
                    System.out.print("  "+matriz2[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                resultados[i][j] = (matriz1[i][j])*(matriz2[i][j]);
            }
        }
        System.out.println("\nResultados\n");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (resultados[i][j] >= 0 && resultados[i][j] < 10)
                    System.out.printf("  %d  ",resultados[i][j]);
                else if ( (resultados[i][j] > -10 && resultados[i][j] < 0) || resultados[i][j] >= 10)
                    System.out.printf(" %d  ",resultados[i][j]);
                else
                    System.out.printf("%d  ",resultados[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
//Desarrollado por Manuel Gomez

/*EJEMPLO:

Matriz 1 

   8  -5  -4  -9
  -3   2   7   2
  -1   0   5   1
   1  -7  -7   3

Matriz 2 

   3   2  -7   4
   0  -4   9  -5
   0  -1  -4  -4
   9  -2  -4   4

Resultados

 24  -10   28  -36  
  0   -8   63  -10  
  0    0  -20   -4  
  9   14   28   12  

*/