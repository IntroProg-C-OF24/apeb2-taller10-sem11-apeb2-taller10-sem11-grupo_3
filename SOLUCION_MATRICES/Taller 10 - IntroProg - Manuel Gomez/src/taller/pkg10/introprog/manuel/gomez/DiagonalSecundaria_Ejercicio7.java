package taller.pkg10.introprog.manuel.gomez;
import java.util.Scanner;
public class DiagonalSecundaria_Ejercicio7 {
    public static void main(String[] args) {
        int dimension, contJ, cont = 1, cont2 = -1;
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
        System.out.println("");
        System.out.println("Los elementos de la Diagonal Secundaria y los elementos ubicados SOBRE dicha diagonal son:");
        while (cont <= dimension) {
            contJ = dimension-cont;
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    if ( j == contJ)
                        System.out.printf("%d ",matriz[i][j]);
                }
                contJ--;
            }
            System.out.println("");
            cont++;
        }
        System.out.println("");
        System.out.println("Los elementos de la Diagonal Secundaria y los elementos ubicados DEBAJO dicha diagonal son:");
        while (cont2 < dimension) {
            contJ = dimension+cont2;
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    if ( j == contJ)
                        System.out.printf("%d ",matriz[i][j]);
                }
                contJ--;
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
   3   5   0  -8
   4   9   5  -8
  -6  -9  -5  -9
   6   6   7   7

Los elementos de la Diagonal Secundaria y los elementos ubicados SOBRE dicha diagonal son:
-8 5 -9 6 
0 9 -6 
5 4 
3 

Los elementos de la Diagonal Secundaria y los elementos ubicados DEBAJO dicha diagonal son:
-8 5 -9 6 
-8 -5 6 
-9 7 
7 

*/