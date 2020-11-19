package set;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {

    public static void main(String[] args) {

        // Los constructores de LinkedHashSet se comportan como los de HashSet

        // Instancia un nuevo LinkedHashSet con las mismas caracter�sticas
        // que el constructor de HashSet
        Set<Persona> linkedHashSet = new LinkedHashSet<>();

        // Insertamos diferentes elementos
        linkedHashSet.add(new Persona("Jos�", "Garc�a Garc�a", LocalDate.of(1990,1,1)));
        linkedHashSet.add(new Persona("Ana", "L�pez Mart�nez", LocalDate.of(2000, 8, 24)));
        linkedHashSet.add(new Persona("Javier", "Castro M�ndez", LocalDate.of(1970, 6,30)));
        linkedHashSet.add(new Persona("Mar�a", "La�nez Mu�oz", LocalDate.of(1980, 3,3)));

        // Independientemente del orden que tenga implementada una determinada
        // clase, LinkedHashSet mantiene solo el orden de inserci�n
        System.out.println("Elementos de la colecci�n");
        for (Persona p : linkedHashSet) {
            System.out.println(p);
        }

        // Podemos eliminar un determinado elemento
        Persona p = new Persona("Javier", "Castro M�ndez", LocalDate.of(1970, 6,30));
        linkedHashSet.remove(p);
        // Y a�adir uno nuevo
        linkedHashSet.add(new Persona("Alicia", "Ant�nez Mar�n", LocalDate.of(2010, 10,10)));
        // Al iterar de nuevo la colecci�n, se sigue manteniendo el orden de inserci�n
        System.out.println("\n\nElementos de la colecci�n despu�s de unas modificaciones");
        linkedHashSet.forEach(System.out::println);

        // Conversi�n de un Set en un array
        Persona[] personas = new Persona[linkedHashSet.size()];
        linkedHashSet.toArray(personas);
        System.out.println("\n\nLinkedHashSet transformado en un array: " + Arrays.toString(personas));
    }
}