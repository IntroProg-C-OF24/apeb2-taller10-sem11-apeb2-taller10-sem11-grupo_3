package taller.pkg10.introprog.manuel.gomez;
import java.util.Scanner;
public class JuegoTresEnRaya_Ejercicio4 {
    public static void main(String[] args) {
        int cont = 1, contArray = 0;
        String movimientoFyC[][] = new String[3][3], historialM[] = new String[9];
        movimientoFyC[0][0] = "A1";
        movimientoFyC[0][1] = "A2";
        movimientoFyC[0][2] = "A3";
        movimientoFyC[1][0] = "B1";
        movimientoFyC[1][1] = "B2";
        movimientoFyC[1][2] = "B3";
        movimientoFyC[2][0] = "C1";
        movimientoFyC[2][1] = "C2";
        movimientoFyC[2][2] = "C3";
        String jugador1, jugador2, movimiento, guiaF[] = {"A","B","C"};
        String tresR[][] = new String[3][3];
        Scanner teclado = new Scanner(System.in);
        boolean banderaW, ganador = false;
        System.out.println("Ingrese el Nombre del Primer Jugador");
        jugador1 = teclado.next();
        System.out.println("Ingrese el Nombre del Segundo Jugador");
        jugador2 = teclado.next();
        System.out.println(jugador1+" sera X");
        System.out.println(jugador2+" sera O");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tresR[i][j] = " ";
            }
        }
        while (cont < 10) {
            System.out.println("    1   2   3  ");
            for (int i = 0; i < 3; i++) {
                System.out.print(guiaF[i]+" | ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tresR[i][j]+" | ");  
                }
                System.out.println("");
            }
            if ( (cont % 2 != 0) ) {
                System.out.println("-Turno de "+jugador1);
            }
            else {
                System.out.println("-Turno de "+jugador2);
            }
            System.out.println("Cual es tu movimiento");
            banderaW = true;
            while (banderaW == true) {
                System.out.println("Asegurate de escribir correctamente tu Movimiento ");
                movimiento = teclado.next();
                for (int i = 0; i < 9; i++) {
                    if (movimiento.equals(historialM[i])){
                        movimiento = "null";
                        System.out.println("[NO SE PERMITE MOVIMIENTOS REPETIDOS]");
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (movimiento.equals(movimientoFyC[i][j])) {
                            historialM[contArray] = movimiento;
                            if ( (cont % 2 != 0) ) {
                                tresR[i][j] = "X";
                                banderaW = false;
                                contArray++;
                            }
                            else {
                                tresR[i][j] = "O";
                                banderaW = false;
                                contArray++;
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 0 && j == 0) {
                        if ((tresR[i][j] == "X")&&(tresR[i][j] == tresR[0][1])&&(tresR[i][j] == tresR[0][2]))
                            ganador = true;
                        else if ((tresR[i][j] == "O")&&(tresR[i][j] == tresR[0][1])&&(tresR[i][j] == tresR[0][2]))
                            ganador = true;
                        else if ((tresR[i][j] == "X")&&(tresR[i][j] == tresR[1][0])&&(tresR[i][j] == tresR[2][0])) 
                            ganador = true;
                        else if ((tresR[i][j] == "O")&&(tresR[i][j] == tresR[1][0])&&(tresR[i][j] == tresR[2][0]))
                            ganador = true;
                    }
                    else if (i == 1 && j == 1) {
                        if ((tresR[i][j] == "X")&&(tresR[i][j] == tresR[0][1])&&(tresR[i][j] == tresR[2][1]))
                            ganador = true;
                        else if ((tresR[i][j] == "X")&&(tresR[i][j] == tresR[1][0])&&(tresR[i][j] == tresR[1][2]))
                            ganador = true;
                        else if ((tresR[i][j] == "X")&&(tresR[i][j] == tresR[0][0])&&(tresR[i][j] == tresR[2][2]))
                            ganador = true;
                        else if ((tresR[i][j] == "X")&&(tresR[i][j] == tresR[0][2])&&(tresR[i][j] == tresR[2][0]))
                            ganador = true;
                        else if ((tresR[i][j] == "O")&&(tresR[i][j] == tresR[0][1])&&(tresR[i][j] == tresR[2][1]))
                            ganador = true;
                        else if ((tresR[i][j] == "O")&&(tresR[i][j] == tresR[1][0])&&(tresR[i][j] == tresR[1][2]))
                            ganador = true;
                        else if ((tresR[i][j] == "O")&&(tresR[i][j] == tresR[0][0])&&(tresR[i][j] == tresR[2][2]))
                            ganador = true;
                        else if ((tresR[i][j] == "O")&&(tresR[i][j] == tresR[0][2])&&(tresR[i][j] == tresR[2][0]))
                            ganador = true;
                    }
                    else if (i == 2 && j == 2) {
                        if ((tresR[i][j] == "X")&&(tresR[i][j] == tresR[2][0])&&(tresR[i][j] == tresR[2][1]))
                            ganador = true;
                        else if ((tresR[i][j] == "O")&&(tresR[i][j] == tresR[2][0])&&(tresR[i][j] == tresR[2][1]))
                            ganador = true;
                        else if ((tresR[i][j] == "X")&&(tresR[i][j] == tresR[0][2])&&(tresR[i][j] == tresR[1][2]))
                            ganador = true;
                        else if ((tresR[i][j] == "O")&&(tresR[i][j] == tresR[0][2])&&(tresR[i][j] == tresR[1][2]))
                            ganador = true;
                    }
                }
            }
            if (ganador == true)
                break;
            cont++;
        }
        System.out.println("    1   2   3  ");
        for (int i = 0; i < 3; i++) {
            System.out.print(guiaF[i]+" | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tresR[i][j]+" | ");  
            }
                System.out.println("");
        }
        System.out.println("");
        if (ganador == true)
            if ((cont % 2 != 0))
                System.out.println("=============== "+jugador1+" es el GANADOR ===============");
            else 
                System.out.println("=============== "+jugador2+" es el GANADOR ===============");
        else
            System.out.println("=============== EMPATE ===============");
    }
}
//Desarrollado por Manuel Gomez


/*EJEMPLO:

    1   2   3  
A | X | O | O | 
B | O | O | X | 
C | X | X | X | 

=============== Jugador1 es el GANADOR ===============*/