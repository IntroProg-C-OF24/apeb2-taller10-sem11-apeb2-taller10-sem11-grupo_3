package taller.pkg10.introprog.manuel.gomez;
import java.util.Scanner;
public class DiagonalPrincipal_Ejercicio8 {
    public static void main(String[] args) {
        int dimension, cont = 0, cont2 = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la Dimension de la Matriz");
        dimension = teclado.nextInt();
        int matriz[][] = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = (int)(Math.random()*20-10);
            }
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (matriz[i][j] >= 0)
                    System.out.print("   "+matriz[i][j]);
                else
                    System.out.print("  "+matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Los elementos de la Diagonal Principal y los elementos ubicados SOBRE dicha diagonal son:");
        while (cont < dimension) {
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    if ( (i+cont) == j)
                        System.out.printf("%d ",matriz[i][j]);
                }
            }
            System.out.println("");
            cont++;
        }
        System.out.println("Los elementos de la Diagonal Principal y los elementos ubicados DEBAJO dicha diagonal son:");
        while (cont2 < dimension) {
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    if ( i == (j+cont2))
                        System.out.printf("%d ",matriz[i][j]);
                }
            }
            System.out.println("");
            cont2++;
        }
    }
}
//Desarrollado por Manuel Gomez

/*EJEMPLO:

Ingrese la Dimension de la Matriz
4
   4   7   6  -3
   7  -7   7   2
  -4   8  -5   2
   6   8   0   1
Los elementos de la Diagonal Principal y los elementos ubicados SOBRE dicha diagonal son:
4 -7 -5 1 
7 7 2 
6 2 
-3 
Los elementos de la Diagonal Principal y los elementos ubicados DEBAJO dicha diagonal son:
4 -7 -5 1 
7 8 0 
-4 8 
6 

*/