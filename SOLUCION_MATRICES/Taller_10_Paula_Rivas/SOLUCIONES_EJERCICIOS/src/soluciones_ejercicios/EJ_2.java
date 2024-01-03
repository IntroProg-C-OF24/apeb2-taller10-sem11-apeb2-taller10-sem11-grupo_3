/*
Ejercicio 2
Crea un programa que gestione el inventario de una tienda. Utiliza una matriz 
bidimensional para almacenar los productos disponibles en la tienda, con 
información como nombre, precio y cantidad. El programa debe permitir agregar
nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 */
package soluciones_ejercicios;
 import java.util.Scanner;
public class EJ_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] inventario = new String[10][3];
        int cantidadProductos = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido al sistema de inventario de la tienda.");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                if (cantidadProductos < 10) {
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = scanner.nextInt();

                    inventario[cantidadProductos][0] = nombre;
                    inventario[cantidadProductos][1] = String.valueOf(precio);
                    inventario[cantidadProductos][2] = String.valueOf(cantidad);

                    cantidadProductos++;
                    System.out.println("Producto agregado correctamente.");
                } else {
                    System.out.println("Inventario lleno, no se pueden agregar más productos.");
                }
            } else if (opcion == 2) {
                scanner.nextLine();
                System.out.print("Ingrese el nombre del producto a actualizar: ");
                String nombreBuscado = scanner.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < cantidadProductos; i++) {
                    if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombreBuscado)) {
                        System.out.print("Ingrese la nueva cantidad del producto: ");
                        int nuevaCantidad = scanner.nextInt();
                        inventario[i][2] = String.valueOf(nuevaCantidad);
                        System.out.println("Existencias actualizadas correctamente.");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Producto no encontrado en el inventario.");
                }
            } else if (opcion == 3) {
                scanner.nextLine();
                System.out.print("Ingrese el nombre del producto a buscar: ");
                String nombreBuscado = scanner.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < cantidadProductos; i++) {
                    if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombreBuscado)) {
                        System.out.println("Nombre: " + inventario[i][0] +
                                " | Precio: " + inventario[i][1] +
                                " | Cantidad: " + inventario[i][2]);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Producto no encontrado en el inventario.");
                }
            } else if (opcion == 4) {
                scanner.nextLine();
                System.out.print("Ingrese el nombre del producto a eliminar: ");
                String nombreBuscado = scanner.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < cantidadProductos; i++) {
                    if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombreBuscado)) {
                        for (int j = i; j < cantidadProductos - 1; j++) {
                            inventario[j][0] = inventario[j + 1][0];
                            inventario[j][1] = inventario[j + 1][1];
                            inventario[j][2] = inventario[j + 1][2];
                        }
                        inventario[cantidadProductos - 1][0] = null;
                        inventario[cantidadProductos - 1][1] = null;
                        inventario[cantidadProductos - 1][2] = null;
                        System.out.println("Producto eliminado correctamente.");
                        cantidadProductos--;
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Producto no encontrado en el inventario.");
                }
            } else if (opcion == 5) {
                System.out.println("Inventario:");
                for (int i = 0; i < cantidadProductos; i++) {
                    System.out.println("Nombre: " + inventario[i][0] +
                            " | Precio: " + inventario[i][1] +
                            " | Cantidad: " + inventario[i][2]);
                }
            } else if (opcion == 6) {
                salir = true;
            } else {
                System.out.println("Opción no válida.");
            }
        }
        System.out.println("¡Gracias por usar el sistema!");
    }
}


