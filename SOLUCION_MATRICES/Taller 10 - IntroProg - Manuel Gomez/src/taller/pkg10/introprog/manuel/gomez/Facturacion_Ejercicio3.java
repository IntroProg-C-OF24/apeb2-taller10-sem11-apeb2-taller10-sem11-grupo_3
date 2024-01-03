package taller.pkg10.introprog.manuel.gomez;
import java.util.Scanner;
public class Facturacion_Ejercicio3 {
    public static void main(String[] args) {
        int informacion = 2, nProductos, nProdtsFact, codigoIngresado;
        double subtotal, precioPrdctFact = 0, cantidadFact = 0, contadorF = 0, subTotalP = 0, iva, descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el Numero de productos");
        nProductos = teclado.nextInt();
        String nombreP[] = new String[nProductos];
        double inventario[][] = new double[nProductos][informacion];
        int codigoP[] = new int[nProductos];
        for (int i = 0; i < nProductos; i++) {
            System.out.println("Ingresar Nombre del Producto");
            nombreP[i] = teclado.next();
            for (int j = 0; j < informacion; j++) {
                switch (j) {
                    case 0 -> {
                        System.out.println("Ingresar el Precio del Producto");
                        inventario[i][j] = teclado.nextDouble();
                    }
                    case 1 -> {
                        System.out.println("Ingresar la Cantidad del Producto");
                        inventario[i][j] = teclado.nextDouble();
                    }
                }
            }
            codigoP[i] = i+101;
        }
        System.out.println("=========================== INVENTARIO ===========================");
        System.out.printf("| Producto \t| Precio | Cantidad | Codigo | \n");
        System.out.println("");
        for (int i = 0; i < nProductos; i++) {
            System.out.printf("| %s    \t",nombreP[i]);
            System.out.printf("| %.2f   ",inventario[i][0]);
            System.out.printf("|    %.0f     ",inventario[i][1]);
            System.out.printf("| [%d]  | \n",codigoP[i]);
        }
        System.out.printf("================================================================== \n");
        System.out.println("Cuantos productos desea facturar ?");
        nProdtsFact = teclado.nextInt();
        double productosFact[][] = new double [nProdtsFact][3];
        String nombrePFact[] = new String [nProdtsFact];
        double totalsumaP[][] = new double [3][3];
        while (contadorF < nProdtsFact) {
            System.out.println("Ingresar codigo para Facturar");
            codigoIngresado = teclado.nextInt();
            for (int i = 0; i < nProductos; i++) {
                if (codigoIngresado == codigoP[i]) {
                    nombrePFact[i] = nombreP[i];
                    for (int j = 0; j < 3; j++) {
                        if (j == 0) {
                            precioPrdctFact = inventario[i][j];
                            productosFact[i][j] = precioPrdctFact;
                        }
                        else if (j == 1) {
                            System.out.println("Ingrese las unidades deseadas de este producto para facturar");
                            cantidadFact = teclado.nextDouble();
                            productosFact[i][j] = cantidadFact;
                        }
                        else if (j == 2) {
                            subtotal = precioPrdctFact*cantidadFact;
                            productosFact[i][j] = subtotal;
                        }
                    }
                    contadorF++;
                }
            }
        }
        for (int i = 0; i < nProductos; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2){
                    subTotalP = subTotalP + productosFact[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2 && i == 0) {
                    iva = (subTotalP*12)/100;
                    subTotalP = subTotalP + iva;
                    totalsumaP[i][j] = iva;
                }
                if (j == 2 && i == 1) {
                    if (subTotalP > 100) {
                        descuento = (subTotalP*10/100); //Descuento del 10%
                        subTotalP = subTotalP - descuento;
                        totalsumaP[i][j] = descuento;
                    }
                }
                if (j == 2 && i == 2)
                    totalsumaP[i][j] = subTotalP;
            }
        }
        System.out.println("=========================== FACTURA ===========================");
        System.out.printf("| Productos \t| Precio \t| Unidades \t| Subtotal | \n");
        for (int i = 0; i < nProdtsFact; i++) {
            System.out.printf("| %s    \t",nombrePFact[i]);
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.printf("| %.2f \t",productosFact[i][j]);
                else if (j == 1)
                    System.out.printf("| %.0f \t",productosFact[i][j]);
                else if (j == 2)
                    System.out.printf("| %.2f \t | \n",productosFact[i][j]);
            }
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0 && i == 0)
                    System.out.printf("| IVA                                            ");
                else if (j == 2 && i == 0)
                    System.out.printf("%.2f \t | \n", totalsumaP[i][j]);
                else if (j == 0 && i == 1)
                    System.out.println("| Descuento                                            ");
                else if (j == 2 && i == 1)
                    System.out.printf("%.2f \t | \n", totalsumaP[i][j]);
                else if (j == 0 && i == 2)
                    System.out.println("| TOTAL                                            ");
                else if (j == 2 && i == 2)
                    System.out.printf("%.2f \t | \n", totalsumaP[i][j]);
            }
        }
        System.out.printf("=============================================================== \n");
    }
}
//Desarrollado por Manuel Gomez

/*EJEMPLO:

=========================== INVENTARIO ===========================
| Producto 	| Precio | Cantidad | Codigo | 

| Aceite    	| 3.25   |    4     | [101]  | 
| Cafe     	| 3.50   |    6     | [102]  | 
| Galletas    	| 1.50   |    6     | [103]  | 
| Atun     	| 3.50   |   14     | [104]  | 
| Mermelada    	| 4.50   |    5     | [105]  | 
| Chocolate    	| 4.50   |   28     | [106]  | 
| Azucar    	| 1.25   |   35     | [107]  | 
| Sal      	| 0.80   |    4     | [108]  | 
| Arroz    	| 1.60   |    9     | [109]  | 
| Pan      	| 0.15   |    7     | [110]  | 
==================================================================

Cuantos productos desea facturar ?
3
Ingresar codigo para Facturar
101
Ingrese las unidades deseadas de este producto para facturar
4
Ingresar codigo para Facturar
103
Ingrese las unidades deseadas de este producto para facturar
6
Ingresar codigo para Facturar
107
Ingrese las unidades deseadas de este producto para facturar
4

=========================== FACTURA ===========================
| Productos 	| Precio 	| Unidades 	| Subtotal | 
| Aceite    	| 3.25 	        | 4 	        | 13.00    | 
| Galletas    	| 1.50 	        | 6 	        | 9.00 	   | 
| Azucar    	| 1.25 	        | 4 	        | 5.00 	   | 

| IVA                                              3.24    | 
| Descuento                                        0.00    | 
| TOTAL                                           30.24    | 
=============================================================== 

*/