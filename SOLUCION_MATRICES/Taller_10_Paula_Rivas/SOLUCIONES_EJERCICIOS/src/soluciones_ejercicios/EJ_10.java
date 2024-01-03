/*
Ejercicio 10
Con el objetivo de manipular correctamente los ciclos repetitivos anidados, 
se solicita, dado la altura de las salida, generar por pantalla las siguientes 
figuras. Nota: Ud. puede elegir libremente el caracter a mostrar. 
Nota: Analice cual debería ser el límite correcto (mínimo y máximo) de la doble 
img para que sea una doble pirámide legible, validar ese dato de entrada.
Ejemplo dado un límite de 7
   *
  * *
 * * *
* * * *
 * * *
  * *
   *
 */
package soluciones_ejercicios;

public class EJ_10 {

    public static void main(String[] args) {
        int altura = 4;
        int limite = altura * 2 - 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < limite; j++) {
                if ((j >= (altura - i) - 1) && (j <= altura + i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = altura - 2; i >= 0; i--) {
            for (int j = 0; j < limite; j++) {
                if ((j >= (altura - i) - 1) && (j <= (altura + i) - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*
      *       
    * * *     
  * * * * *   
* * * * * * * 
  * * * * *   
    * * *     
      *       
*/