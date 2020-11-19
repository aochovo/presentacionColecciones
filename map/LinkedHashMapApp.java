package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {

    public static void main(String[] args) {

        // Vamos a implementar un carro de compra
        // Nos permitirá almacenar productos y la cantidad de los mismos
        // que queremos adquirir.
        // Elegimos LinkedHashMap para mostrar al usuario los
        // productos en el orden que los insertó.

        // Definimos los productos como el ejercicio anterior
        Map<String, Producto> productos = new HashMap<>();

        // Insertamos varios producto
        productos.put("PC000123", new Producto("PC000123", "Ordenador portátil", 800.0f));
        productos.put("PC000234", new Producto("PC000234", "Ordenador compacto", 400.0f));
        productos.put("COMPGAM012", new Producto("COMPGAM012", "Auriculares gamer", 75.56f));
        productos.put("MON274K034", new Producto("MON274K034", "Monitor 27 4K", 325.67f));


        // Construimos nuestro carrito
        Map<Producto, Integer> carrito = new LinkedHashMap<>();

        // Añadimos un portátil						
        addProductoToCarrito(carrito, productos.get("PC000123"),1);

        // Añadimos dos ordenadores
        addProductoToCarrito(carrito, productos.get("PC000234"), 2);

        // Añadimos un portátil más
        addProductoToCarrito(carrito, productos.get("PC000123"),1);

        // Estado actual del carrito
        imprimirCarrito(carrito);
        System.out.println("\n\n");

        // Si decrementamos el numero de ordenadores 2 veces, se debe eliminar
        decrementarUnidadesDeProductoEnCarrito(carrito, productos.get("PC000234"));
        decrementarUnidadesDeProductoEnCarrito(carrito, productos.get("PC000234"));

        // Estado actual del carrito
        imprimirCarrito(carrito);
        System.out.println("\n\n");

        // Vaciamos el carrito eliminando el producto que queda
        removeProductoFromCarrito(carrito, productos.get("PC000123"));

        // Estado actual del carrito
        imprimirCarrito(carrito);
        System.out.println("\n\n");
    }

    /*
     Método que permite añadir una referencia al carrito
     */
    public static void addProductoToCarrito(Map<Producto, Integer> carrito, Producto producto, int unidades) {
        int cantidad = carrito.getOrDefault(producto, 0);
        carrito.put(producto, cantidad+unidades);
    }
    
    /*
      Método que elimina un producto del carrito
     */
    public static void removeProductoFromCarrito(Map<Producto, Integer> carrito, Producto producto) {
        carrito.remove(producto);
    }

    /*
     Método que decrementa en 1 el número de unidades del producto en el carrito.
     Si el número de unidades resultante es cero, se elimina.
     */
    public static void decrementarUnidadesDeProductoEnCarrito(Map<Producto, Integer> carrito, Producto producto) {
        if (carrito.containsKey(producto)) {
            int cantidad = carrito.get(producto);
            if (cantidad == 1)
                carrito.remove(producto);
            else
                carrito.put(producto, cantidad-1);
        }
    }

    /*
     Método que procesa el carrito para obtener el importe de la compra.
     */
    public static float calcularTotalCompra(Map<Producto, Integer> carrito) {
        float total = 0.0f;

        // Para cada producto en el carrito
        for(Producto p : carrito.keySet()) {
            total += p.getPrecio() * carrito.get(p);
        }

        return total;
    }

    public static void imprimirCarrito(Map<Producto, Integer> carrito) {
        if (carrito.size() >= 1) {
            carrito.forEach((k, v) -> {
                System.out.printf("Producto: %s (%s) -> Nº unidades: %s. Subtotal: %.2f\n",
                        k.getPrecio(), k.getReferencia(), v.toString(), k.getPrecio() * v);
            });
            System.out.printf("Total: %.2f\n", calcularTotalCompra(carrito));
        } else
            System.out.println("El carrito no tiene productos actualmente");
    }

}
