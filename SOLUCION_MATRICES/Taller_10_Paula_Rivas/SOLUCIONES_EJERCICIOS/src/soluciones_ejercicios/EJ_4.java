/*
Ejercicio 4
Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. 
Permita a dos jugadores marcar sus movimientos alternativamente. El juego debe 
verificar si alguno de los jugadores ha ganado o si hay un empate.
 */
package soluciones_ejercicios;
import java.util.Scanner;
public class EJ_4 {
     public static void main(String[] args) {
        char[][] tablero = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        boolean juegoActivo = true;
        char jugadorActual = 'X';
        Scanner scanner = new Scanner(System.in);

        while (juegoActivo) {

            for (char[] fila : tablero) {
                for (char casilla : fila) {
                    System.out.print("| " + casilla + " ");
                }
                System.out.println("|");
            }

            System.out.print("Jugador " + jugadorActual + ", ingrese fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Jugador " + jugadorActual + ", ingrese columna (0-2): ");
            int columna = scanner.nextInt();

            if (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ') {
                System.out.println("Movimiento no válido. Inténtalo de nuevo.");
            } else {
                tablero[fila][columna] = jugadorActual;


                if ((tablero[fila][0] == jugadorActual && tablero[fila][1] == jugadorActual && tablero[fila][2] == jugadorActual) ||
                        (tablero[0][columna] == jugadorActual && tablero[1][columna] == jugadorActual && tablero[2][columna] == jugadorActual) ||
                        (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                        (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
     
                    for (char[] row : tablero) {
                        for (char casilla : row) {
                            System.out.print("| " + casilla + " ");
                        }
                        System.out.println("|");
                    }
                    System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                    juegoActivo = false;
                } else {
       
                    boolean hayEspacio = false;
                    for (char[] row : tablero) {
                        for (char casilla : row) {
                            if (casilla == ' ') {
                                hayEspacio = true;
                                break;
                            }
                        }
                    }

                    if (!hayEspacio) {
                        for (char[] row : tablero) {
                            for (char casilla : row) {
                                System.out.print("| " + casilla + " ");
                            }
                            System.out.println("|");
                        }
                        System.out.println("¡Empate!");
                        juegoActivo = false;
                    } else {
                        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                    }
                }
            }
        }
        System.out.println("¡Gracias por jugar!");
    }
}
/*
|   |   |   |
|   |   |   |
|   |   |   |
Jugador X, ingrese fila (0-2): 
*/
