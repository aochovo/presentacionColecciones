package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

    public static void main(String[] args) {


        // HashMap tiene unos constructores muy parecidos a HashSet
        Map<String, Producto> hashMap = new HashMap<>();

        // Insertamos varios productos
        Producto pc = new Producto("PC000123", "Ordenador port�til", 800.0f);
        hashMap.put("PC000123", pc);
        hashMap.put("PC000234", new Producto("PC000234", "Ordenador compacto", 400.0f));
        hashMap.put("COMPGAM012", new Producto("COMPGAM012", "Auriculares gamer", 75.56f));
        hashMap.put("MON274K034", new Producto("MON274K034", "Monitor 27 4K", 325.67f));


        // Si insertamos una referencia que ya existe, simplemente reemplaza el valor
        // hashMap.put("MON274K034", new Producto("MON274K034", "Monitor 27 4K", 450.0f));

        // Se puede insertar un valor s� o solo s� la clave no est� insertada,
        // y si lo est�, nos devuelve el valor antiguo. En otro caso devuelve nulo
        Producto monitor = hashMap.putIfAbsent("MON274K034", new Producto("MON274K034", "Monitor 27 4K", 450.0f));

        // Se puede comprobar si se contiene alguna clave, o alg�n valor.
        if (hashMap.containsKey("PC000123"))
            System.out.println("El Map contiene la clave");

        if (hashMap.containsValue(pc))
            System.out.println("El Map contiene el valor");

        // Tambi�n podemos hacer uso de getOrDefault
        // si queremos obtener el valor asociado
        // a una referencia y, si no existe, un valor por defecto
        System.out.println(hashMap.getOrDefault("MON274K034", monitor));
        System.out.println("--------");
        // La forma tradicional de recorrerla es mediante un bucle for-each sobre las claves
        for (String key : hashMap.keySet())
            System.out.println(hashMap.get(key));

        System.out.println("\n\n");
        // Tambi�n podemos recorrer el HashMap con un estilo "m�s lambda"
        hashMap.forEach((k,v) -> System.out.println(v));




    }

}
