package set;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;



public class TreeSetApp {

    public static void main(String[] args) {

        // Constructor sin par�metros de TreeSet
        // Genera una instancia con un �rbol vac�o
        // Los elementos a guardar deben implementar Comparable<E>
        Set<Persona> treeSet = new TreeSet<>();

        // Insertamos diferentes elementos
        treeSet.add(new Persona("Jos�", "Garc�a Garc�a", LocalDate.of(1990,1,1)));
        treeSet.add(new Persona("Ana", "L�pez Mart�nez", LocalDate.of(2000, 8, 24)));
        treeSet.add(new Persona("Mar�a", "La�nez Mu�oz", LocalDate.of(1980, 3,3)));

        // Instanciamos un elemento para comprobar si est� contenido o no
        Persona p = new Persona("Jos�", "Garc�a Garc�a", LocalDate.of(1990,1,1));

        // Comprobamos si est� contenido
        if (treeSet.contains(p))
            System.out.println("El elemento est� contenido");
        else
            System.out.println("El elemento NO est� contenido");


        // Si iteramos sobre los objetos del TreeSet, los obtenemos
        // en orden alfab�tico
        System.out.println("\nPersonas por orden alfab�tico");
        for (Persona persona : treeSet) {
            System.out.println(persona);
        }

        // OTRAS POSIBILIDADES DE RECORRIDO
        // Tenemos la posibilidad de recorrer el TreeSet ascendentemente (como antes)
        // o descendentemente, mediante descendingIterator

        TreeSet<Persona> treeSetRef = (TreeSet<Persona>) treeSet;
        Iterator<Persona> descendente = treeSetRef.descendingIterator();

        System.out.println("\n\nPersonas por orden alfab�tico inverso");

        while(descendente.hasNext()) {
            System.out.println(descendente.next());
        }


        // Tambi�n tenemos algunos m�todos para obtener elementos de los "extremos",
        // para extraerlos, o para obtener partes del TreeSet

        System.out.println("\n\nPrimer elemento: " + treeSetRef.first());
        System.out.println("�ltimo elemento: " + treeSetRef.last());
        System.out.println("Elemento inmediatamente menor a otro: " + treeSetRef.lower(treeSetRef.last()));


        // Ejemplo de eliminaci�n de un elemento
        treeSet.remove(p);

        // Recorremos de nuevo, para comprobar
        System.out.println("\n\nEstado del TreeSet tras eliminar un elemento.");
        treeSet.forEach(System.out::println); // El orden se mantiene

    }


}