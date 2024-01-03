package taller.pkg10.introprog.manuel.gomez;
import java.util.Scanner;
public class RomboCaracteres_Ejercicio10 {
    public static void main(String[] args) {
        int nFilas = 0, cont = 0;
        boolean numImpar = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas filas desea para formar la figura? [SOLO NUMEROS IMPARES]");
        while (numImpar == false) {
            nFilas = teclado.nextInt();
            if ((nFilas % 2) == 0) {
                System.out.println("[SOLO NUMEROS IMPARES]");
                System.out.println("-Ingrese nuevamente");
            }
            else {
                numImpar = true;
            }
        }
        for (int i = 0; i < nFilas; i++) {
            if (i <= (nFilas/2)){
                for (int j = 0; j <= i; j++) {
                    while (cont < nFilas-i) {
                        System.out.printf(" ");
                        cont++;
                    }
                    System.out.printf("^ ");
                }
            }
            else {
                for (int j = 0; j < nFilas-i; j++) {
                    while (cont < i+1) {
                        System.out.printf(" ");
                        cont++;
                    }
                    System.out.printf("^ ");
                }
            }
            System.out.println("");
            cont = 0;
        }
    }
}
//Desarrollado por Manuel Gomez

/*EJEMPLO:

Cuantas filas desea para formar la figura? [SOLO NUMEROS IMPARES]
9
         ^ 
        ^ ^ 
       ^ ^ ^ 
      ^ ^ ^ ^ 
     ^ ^ ^ ^ ^ 
      ^ ^ ^ ^ 
       ^ ^ ^ 
        ^ ^ 
         ^ 

*/