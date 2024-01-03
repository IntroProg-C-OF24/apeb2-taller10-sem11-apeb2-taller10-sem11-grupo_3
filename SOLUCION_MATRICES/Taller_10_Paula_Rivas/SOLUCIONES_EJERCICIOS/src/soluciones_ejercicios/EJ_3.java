/*
Ejercicio 3
Crea un programa que gestione el inventario de una tienda, así como la emisión 
de facturas. Utiliza una matriz bidimensional para almacenar los productos }
disponibles en la tienda, con información como nombre, precio y cantidad. El 
programa debe permitir facturar un producto dado su código, y unidades deseadas.
Adicional se debe agregar a la factura al 12% del IVA, y si la compra superar 
los $100, se debe aplicar un descuento.

Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre 
la alerta respectiva. Crea
 */
package soluciones_ejercicios;
import java.util.Scanner;
public class EJ_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] inventario = {
                {"Producto 1", "10", "15"},
                {"Producto 2", "20", "20"},
                {"Producto 3", "30", "10"},
        };

        double subtotal = 0;
        double iva = 0;
        double total = 0;

        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido al sistema de gestion de inventario y facturacion.");
            System.out.println("1. Ver inventario");
            System.out.println("2. Generar factura");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opcion: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Inventario:");
                for (String[] producto : inventario) {
                    System.out.println("Nombre: " + producto[0] +
                            " | Precio: " + producto[1] +
                            " | Cantidad: " + producto[2]);
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese el código del producto: ");
                scanner.nextLine();
                String codigo = scanner.nextLine();

                boolean encontrado = false;
                for (String[] producto : inventario) {
                    if (producto[0].equalsIgnoreCase(codigo)) {
                        encontrado = true;
                        System.out.print("Ingrese la cantidad a comprar: ");
                        int cantidad = scanner.nextInt();
                        double precioUnitario = Double.parseDouble(producto[1]);

                        int cantidadDisponible = Integer.parseInt(producto[2]);
                        if (cantidad <= cantidadDisponible) {
                            double subtotalProducto = precioUnitario * cantidad;
                            subtotal += subtotalProducto;

             
                            if (subtotal > 100) {
                                subtotal *= 0.9; 
                            }

                            iva = subtotal * 0.12; 
                            total = subtotal + iva; 

                            int nuevaCantidad = cantidadDisponible - cantidad;
                            producto[2] = String.valueOf(nuevaCantidad);

                            System.out.println("Factura generada correctamente.");
                            System.out.println("Subtotal: $" + subtotal);
                            System.out.println("IVA (12%): $" + iva);
                            System.out.println("Total: $" + total);
                        } else {
                            System.out.println("No hay suficientes unidades disponibles.");
                        }
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado en el inventario.");
                }
            } else if (opcion == 3) {
                salir = true;
            } else {
                System.out.println("Opcion no valida.");
            }
        }
        System.out.println("¡Gracias por usar el sistema!");
    }
}

/*
Bienvenido al sistema de gestion de inventario y facturacion.
1. Ver inventario
2. Generar factura
3. Salir
Ingrese su opcion: 1
Inventario:
Nombre: Producto 1 | Precio: 10 | Cantidad: 15
Nombre: Producto 2 | Precio: 20 | Cantidad: 20
Nombre: Producto 3 | Precio: 30 | Cantidad: 10
Bienvenido al sistema de gestion de inventario y facturacion.
1. Ver inventario
2. Generar factura
3. Salir
Ingrese su opcion: 2
Ingrese el codigo del producto: Producto 1
Ingrese la cantidad a comprar: 10
Factura generada correctamente.
Subtotal: $100.0
IVA (12%): $12.0
Total: $112.0
*/