package taller.pkg10.introprog.manuel.gomez;
public class PrimerCicloParaleloC_Ejercicio1 {
    public static void main(String[] args) {
        int numEst = 28;
        double promedioC, mejorProm = 0, peorProm, sumaP = 0;
        String nomMejorEst = "", nomPeorEst = "";
        String nomEst[] = {"Marco","Bryan","Eimer","Nayeli","Manuel C.","Alisson","Jean C.","Juan D.","Ricardo","Jhon G.",
            "Manuel G.","Juan","Diego","Junior","Juan P.","Dario","Mario","Rafaella","Jhon Q.","Paula",
            "Leydi","Axel","Carlos","Flor","Adrian","Pablo","Pedro","Jean Z."};
        double calificaciones[][] =  new double[numEst][4];
        for (int i = 0; i < numEst; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3) 
                    calificaciones[i][j] = (calificaciones[i][0]*0.35)+(calificaciones[i][1]*0.35)+(calificaciones[i][2]*0.3);
                else
                    calificaciones[i][j] = (double)(Math.random()*(9-0+1)+0);
            }
        }
        System.out.println("NOMBRES \t| ACD  | APE  | AA   | PROMEDIOS ");
        for (int i = 0; i < numEst; i++) {
            System.out.printf("%s    \t",nomEst[i]);
            for (int j = 0; j < 4; j++) {
                System.out.printf("| %.2f ",calificaciones[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < numEst; i++) {
            sumaP = sumaP + calificaciones[i][3];
        }
        promedioC = sumaP/numEst;
        System.out.printf("\nEl Promedio del Curso, del paralelo C es %.2f \n",promedioC);
        System.out.println("");
        System.out.println("\n=============== Estudiantes por Encima del promedio del curso =============== \n");
        System.out.println("NOMBRES \t| PROMEDIOS |");
        for (int i = 0; i < numEst; i++) {
            if (calificaciones[i][3] > promedioC) {
                System.out.printf("%s    \t",nomEst[i]);
                System.out.printf("|   %.2f    |",calificaciones[i][3]);
                System.out.println(""); 
            }
        }
        System.out.println("\n=============== Estudiantes por Debajo del promedio del curso =============== \n");
        System.out.println("NOMBRES \t| PROMEDIOS |");
        for (int i = 0; i < numEst; i++) {
            if (calificaciones[i][3] < promedioC) {
                System.out.printf("%s    \t",nomEst[i]);
                System.out.printf("|   %.2f    |",calificaciones[i][3]);
                System.out.println("");
            }
        }
        peorProm = promedioC;
        for (int i = 0; i < numEst; i++) {
            if (calificaciones[i][3] > mejorProm) {
                nomMejorEst = nomEst[i];
                mejorProm = calificaciones[i][3];
            }
            else if (calificaciones[i][3] < peorProm) {
                nomPeorEst = nomEst[i];
                peorProm = calificaciones[i][3];
            }
        }
        System.out.printf("\nEl estudiante con el Promedio mas Alto es %s promedio: %.2f",nomMejorEst,mejorProm);
        System.out.printf("\nEl estudiante con el Promedio mas Bajo es %s promedio: %.2f\n",nomPeorEst,peorProm);
    }
}
//Desarrollado por Manuel Gomez

/* EJEMPLO:

NOMBRES 	| ACD  | APE  | AA   | PROMEDIOS 
Marco    	| 7.02 | 0.67 | 2.58 | 3.47 
Bryan    	| 4.68 | 9.24 | 2.62 | 5.66 
Eimer    	| 1.21 | 3.60 | 5.93 | 3.46 
Nayeli    	| 7.42 | 6.36 | 3.26 | 5.80 
Manuel C.    	| 1.88 | 3.31 | 3.52 | 2.87 
Alisson    	| 6.88 | 3.92 | 2.36 | 4.49 
Jean C.    	| 5.24 | 0.09 | 8.53 | 4.42 
Juan D.    	| 1.98 | 9.01 | 4.59 | 5.22 
Ricardo    	| 6.48 | 9.16 | 8.32 | 7.97 
Jhon G.    	| 6.23 | 1.83 | 7.74 | 5.14 
Manuel G.    	| 9.41 | 6.47 | 4.43 | 6.89 
Juan    	| 1.56 | 3.18 | 0.08 | 1.68 
Diego    	| 0.47 | 3.44 | 7.35 | 3.58 
Junior    	| 5.15 | 3.72 | 2.95 | 3.99 
Juan P.    	| 7.17 | 6.31 | 0.63 | 4.91 
Dario    	| 3.66 | 3.64 | 5.94 | 4.34 
Mario    	| 6.22 | 4.45 | 7.26 | 5.91 
Rafaella    	| 3.33 | 4.13 | 7.43 | 4.84 
Jhon Q.    	| 1.67 | 6.62 | 3.30 | 3.89 
Paula    	| 9.73 | 6.07 | 7.89 | 7.89 
Leydi    	| 5.95 | 5.22 | 7.41 | 6.13 
Axel    	| 7.27 | 6.23 | 7.09 | 6.85 
Carlos    	| 3.51 | 8.32 | 6.64 | 6.13 
Flor    	| 2.04 | 5.83 | 2.78 | 3.59 
Adrian    	| 9.97 | 2.15 | 6.49 | 6.19 
Pablo    	| 0.03 | 7.30 | 1.04 | 2.88 
Pedro    	| 7.47 | 2.95 | 9.49 | 6.50 
Jean Z.    	| 6.67 | 1.21 | 9.65 | 5.65 

El Promedio del Curso, del paralelo C es 5.01 

=============== Estudiantes por Encima del promedio del curso =============== 

NOMBRES 	| PROMEDIOS |
Bryan    	|   5.66    |
Nayeli    	|   5.80    |
Juan D.    	|   5.22    |
Ricardo    	|   7.97    |
Jhon G.    	|   5.14    |
Manuel G.    	|   6.89    |
Mario    	|   5.91    |
Paula    	|   7.89    |
Leydi    	|   6.13    |
Axel    	|   6.85    |
Carlos    	|   6.13    |
Adrian    	|   6.19    |
Pedro    	|   6.50    |
Jean Z.    	|   5.65    |

=============== Estudiantes por Debajo del promedio del curso =============== 

NOMBRES 	| PROMEDIOS |
Marco    	|   3.47    |
Eimer    	|   3.46    |
Manuel C.    	|   2.87    |
Alisson    	|   4.49    |
Jean C.    	|   4.42    |
Juan    	|   1.68    |
Diego    	|   3.58    |
Junior    	|   3.99    |
Juan P.    	|   4.91    |
Dario    	|   4.34    |
Rafaella    	|   4.84    |
Jhon Q.    	|   3.89    |
Flor    	|   3.59    |
Pablo    	|   2.88    |

El estudiante con el Promedio mas Alto es Ricardo promedio: 7.97
El estudiante con el Promedio mas Bajo es Juan promedio: 1.68

*/