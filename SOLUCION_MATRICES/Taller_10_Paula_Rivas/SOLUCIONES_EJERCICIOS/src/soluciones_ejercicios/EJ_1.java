/*
Ejercicio 1
El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al 
finalizar el periodo, la Dirección de la carrera de Computación a solicitado 
las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en 
función a los promedios por estudiante, dichos promedios se deben calcular 
(ponderar) de 3 calificaciones (ACD que representa el 35% de la nota, APE del 
35% y la nota del AA con un peso del 30%). En resumen, los requerimientos son 
los siguientes:

Registre los nombres de cada estudiante de dicho paralelo.
Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes 
e 0-10 pts.
Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente 
ponderación: ACD->35%, APE->35%, y el AA->30%.
Obtenga el promedio del curso, del paralelo C.
Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio 
por encima del promedio del curso.
Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio 
por debajo del promedio del curso.
Muestre el estudiante con su calificación, si es el del mayor promedio 
(el más alto de la clase).
Muestre el estudiante con su calificación, si es el del menor promedio (
el más bajo de la clase).
 */
package soluciones_ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EJ_1 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int limEsts = 28, limNotas = 3;
        double mayorPromedio, menorPromedio;
        String estudianteMayor = "", estudianteMenor = "";

        String[] arrNombEst = new String[limEsts];
        double[][] arrNotasEst = new double[limEsts][limNotas];
        double[] arrPromEst = new double[limEsts];
        double promedioCurso, sumaPromedios = 0;
        for (int i = 0; i < limEsts; i++) {
            System.out.print("Ingrese nombre del Estudiante " + (i + 1) + ": ");
            arrNombEst[i] = scanner.nextLine();

            for (int j = 0; j < limNotas; j++) {
                arrNotasEst[i][j] = rand.nextInt(11);
            }

            arrPromEst[i] = (arrNotasEst[i][0] * 0.35) + (arrNotasEst[i][1] * 0.35) + (arrNotasEst[i][2] * 0.3);
            sumaPromedios += arrPromEst[i];
        }

        promedioCurso = sumaPromedios / limEsts;

        System.out.println("NOMBRES  |  ACD  |  APE  |  AA  |  PROMEDIOS");

        for (int i = 0; i < limEsts; i++) {
            System.out.printf("%-10s|", arrNombEst[i]);

            for (int j = 0; j < limNotas; j++) {
                System.out.printf(" %4.2f |", arrNotasEst[i][j]);
            }

            System.out.printf(" %5.2f %n", arrPromEst[i]);
        }
         promedioCurso = sumaPromedios / limEsts;

        System.out.println("Promedio del curso: " + promedioCurso);
        System.out.println("ESTUDIANTES CON PROMEDIO SUPERIOR AL DEL CURSO");

        for (int i = 0; i < limEsts; i++) {
            if (arrPromEst[i] > promedioCurso) {
                System.out.println(arrNombEst[i] + " | PROMEDIO: " + arrPromEst[i]);
            }
        }
        System.out.println("ESTUDIANTES CON PROMEDIO INFERIOR AL DEL CURSO");

        for (int i = 0; i < limEsts; i++) {
            if (arrPromEst[i] < promedioCurso) {
                System.out.println(arrNombEst[i] + " | PROMEDIO: " + arrPromEst[i]);
            }
        }
        System.out.println("PROMEDIOS MAYOR Y MENOR DEL CURSO");

        mayorPromedio = arrPromEst[0];
        menorPromedio = arrPromEst[0];

        for (int i = 1; i < limEsts; i++) {
            if (arrPromEst[i] > mayorPromedio) {
                mayorPromedio = arrPromEst[i];
                estudianteMayor = arrNombEst[i];
            }

            if (arrPromEst[i] < menorPromedio) {
                menorPromedio = arrPromEst[i];
                estudianteMenor = arrNombEst[i];
            }
        }

        System.out.println("Estudiante con el mayor promedio: " + estudianteMayor + " | Promedio: " + mayorPromedio);
        System.out.println("Estudiante con el menor promedio: " + estudianteMenor + " | Promedio: " + menorPromedio);

    }
}
/*
NOMBRES  |  ACD  |  APE  |  AA  |  PROMEDIOS
Paula     | 9,00 | 2,00 | 4,00 |  5,05 
Camila    | 4,00 | 5,00 | 3,00 |  4,05 
Diego     | 1,00 | 7,00 | 4,00 |  4,00 
Nicolas   | 6,00 | 6,00 | 1,00 |  4,50 
Nixson    | 8,00 | 2,00 | 9,00 |  6,20 
Sofia     | 10,00 | 3,00 | 1,00 |  4,85 
Ana       | 3,00 | 9,00 | 10,00 |  7,20 
Maria     | 0,00 | 1,00 | 10,00 |  3,35 
Daniela   | 3,00 | 3,00 | 7,00 |  4,20 
Sebastias | 1,00 | 10,00 | 0,00 |  3,85 
Marco     | 5,00 | 3,00 | 9,00 |  5,50 
Ricardo   | 4,00 | 8,00 | 2,00 |  4,80 
Marlos    | 1,00 | 9,00 | 3,00 |  4,40 
Zamir     | 0,00 | 7,00 | 6,00 |  4,25 
Pablo     | 2,00 | 5,00 | 10,00 |  5,45 
Alejandro | 10,00 | 3,00 | 8,00 |  6,95 
Andrea    | 6,00 | 1,00 | 3,00 |  3,35 
Carlos    | 8,00 | 1,00 | 3,00 |  4,05 
Eduardo   | 0,00 | 9,00 | 8,00 |  5,55 
Manuel    | 6,00 | 2,00 | 0,00 |  2,80 
Bryan     | 3,00 | 9,00 | 3,00 |  5,10 
Salome    | 7,00 | 4,00 | 10,00 |  6,85 
Isabela   | 7,00 | 0,00 | 10,00 |  5,45 
Mario     | 3,00 | 3,00 | 1,00 |  2,40 
Malena    | 7,00 | 3,00 | 10,00 |  6,50 
Gabriela  | 6,00 | 2,00 | 5,00 |  4,30 
Mateo     | 10,00 | 9,00 | 2,00 |  7,25 
Miguel    | 2,00 | 2,00 | 7,00 |  3,50 
Promedio del curso: 4.84

ESTUDIANTES CON PROMEDIO SUPERIOR AL DEL CURSO
Paula | PROMEDIO: 5.05
Nixson | PROMEDIO: 6.2
Sofia | PROMEDIO: 4.85
Ana | PROMEDIO: 7.2
Marco | PROMEDIO: 5.5
Pablo | PROMEDIO: 5.45
Alejandro | PROMEDIO: 6.99
Eduardo | PROMEDIO: 5.55
Bryan | PROMEDIO: 5.1
Salome | PROMEDIO: 6.85
Isabela | PROMEDIO: 5.49
Malena | PROMEDIO: 6.5
Mateo | PROMEDIO: 7.25

ESTUDIANTES CON PROMEDIO INFERIOR AL DEL CURSO
Camila | PROMEDIO: 4.05
Diego | PROMEDIO: 4.0
Nicolas | PROMEDIO: 4.49
Maria | PROMEDIO: 3.35
Daniela | PROMEDIO: 4.19
Sebastias | PROMEDIO: 3.85
Ricardo | PROMEDIO: 4.79
Marlos | PROMEDIO: 4.4
Zamir | PROMEDIO: 4.25
Andrea | PROMEDIO: 3.34
Carlos | PROMEDIO: 4.05
Manuel | PROMEDIO: 2.8
Mario | PROMEDIO: 2.39
Gabriela | PROMEDIO: 4.3
Miguel | PROMEDIO: 3.5

PROMEDIOS MAYOR Y MENOR DEL CURSO
Estudiante con el mayor promedio: Mateo | Promedio: 7.25
Estudiante con el menor promedio: Mario | Promedio: 2.39
*/
