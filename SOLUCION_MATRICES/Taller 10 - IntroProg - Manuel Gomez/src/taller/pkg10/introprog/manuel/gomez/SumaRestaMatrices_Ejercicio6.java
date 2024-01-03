package taller.pkg10.introprog.manuel.gomez;
import java.util.Scanner;
public class SumaRestaMatrices_Ejercicio6 {
    public static void main(String[] args) {
        int numFilas, numColumnas;
        String simbolo;
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
        System.out.println("\nSi desea sumar ambas matrices introduzca el simbolo +");
        System.out.println("Si desea restar ambas matrices introduzca el simbolo -");
        do {      
            simbolo = teclado.next();
            if ("+".equals(simbolo)) {
                for (int i = 0; i < numFilas; i++) {
                    for (int j = 0; j < numColumnas; j++) {
                        resultados[i][j] = (matriz1[i][j])+(matriz2[i][j]);
                    }
                }
                break;
            }
            else if ("-".equals(simbolo)) {
                for (int i = 0; i < numFilas; i++) {
                    for (int j = 0; j < numColumnas; j++) {
                        resultados[i][j] = (matriz1[i][j])-(matriz2[i][j]);
                    }
                }
                break;
            }
            System.out.println("[Por favor ingrese correctamente]");
        } while (true);
        System.out.println("\nRESULTADOS\n");
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

   9   8  -7  -4
   0   5  -8   7
   0   6   5   6
  -6  -3   2   2

Matriz 2 

  -3  -7   8   6
   1   6   8   0
   3   9  -6   0
  -9  -6  -6  -8

Si desea sumar ambas matrices introduzca el simbolo +
Si desea restar ambas matrices introduzca el simbolo -
-

RESULTADOS

 12   15  -15  -10  
 -1   -1  -16    7  
 -3   -3   11    6  
  3    3    8   10  

*/