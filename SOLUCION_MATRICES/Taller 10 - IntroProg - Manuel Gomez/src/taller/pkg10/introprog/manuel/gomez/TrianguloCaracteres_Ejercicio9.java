package taller.pkg10.introprog.manuel.gomez;
import java.util.Scanner;
public class TrianguloCaracteres_Ejercicio9 {
    public static void main(String[] args) {
        int numFilas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas filas desea para formar la figura?");
        numFilas = teclado.nextInt();
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("^ ");
            }
            System.out.println("");
        }
    }
}
// Desarrollado por Manuel Gomez

/*EJEMPLO:

Cuantas filas desea para formar la figura?
6
^ 
^ ^ 
^ ^ ^ 
^ ^ ^ ^ 
^ ^ ^ ^ ^ 
^ ^ ^ ^ ^ ^ 

*/