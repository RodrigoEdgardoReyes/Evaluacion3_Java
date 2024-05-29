package evaluacion3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Producto> arrayList = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            // Pedir al usuario que ingrese los datos del producto
            System.out.print("Ingrese un ID: ");
            int id = entrada.nextInt();
            entrada.nextLine();



            System.out.print("Ingrese el nombre del producto: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese la marca del producto: ");
            String marca = entrada.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = entrada.nextDouble();
            entrada.nextLine();

            // Instancia de Producto y la agrego a la lista
            Producto producto = new Producto(id, nombre, marca, precio);
            arrayList.add(producto);

            // Pregunto al usuario si desea continuar registrando productos
            System.out.print("¿Desea registrar otro producto? (s/n): ");
            String respuesta = entrada.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }

            }
        // Mostrar la información de todos los productos registrados
        System.out.println("\nProductos registrados:");

        Iterator<Producto> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Producto prod = iterator.next();
            System.out.println("ID: " + prod.getId());
            System.out.println("Código: " + prod.getCodigo());
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Marca: " + prod.getMarca());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println();

        }
    }
}