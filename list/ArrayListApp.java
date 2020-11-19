package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListApp {

    public static void main(String[] args) {

        // Podemos construir un ArrayList a partir de otra colecci�n
        List<String> lista = new ArrayList<>(Arrays.asList("Uno", "Dos", "Tres", "cinco", "Seis"));

        // USO POSICIONAL

        // Uso posicional de la lista
        // Los �ndices comienzan en 0

        // Obtener el elemento en la posici�n 2 (tercer elemento)
        String tercerElemento = lista.get(2);

        // A�adir un elemento en una posici�n determinada
        lista.add(3, "Cuatro");

        // Sustituir un elemento de una determinada posici�n
        lista.set(4, "Cinco");

        // Eliminar un elemento de una determinada posici�n
        // Devuelve el elemento eliminado
        String eliminado = lista.remove(5);

        // Posibilidad de contener repetidos
        lista.add("Seis");
        lista.add("Seis");

        // Iterar sobre los elementos mediante un forEach
        lista.forEach((x) -> System.out.print(x + " "));

        // FUNCIONES DE B�SQUEDA

        // B�squeda de la primera o la �ltima ocurrencia de un elemento
        int posicion1 = lista.indexOf("Dos");
        int posicion2 = lista.lastIndexOf("Seis");

        System.out.println("\n\nLa primera ocurrencia de Dos est� en la posici�n " + posicion1);
        System.out.println("La �ltima ocurrencia de Seis est� en la posici�n " + posicion2);

        // ITERACI�N EXTENDIDA

        // Se realiza a trav�s del uso de ListIterator
        // Este nos permite iterar en cualquier direcci�n, as� como
        // a�adir, modificar y eliminar

        // Ejemplo de iteraci�n hacia atr�s
        for (ListIterator<String> listIterator = lista.listIterator(lista.size());
             listIterator.hasPrevious();) {
            System.out.print(listIterator.previous() + " ");
        }

        // OPERACIONES SOBRE UN RANGO DE ELEMENTOS

        // La lista que se obtiene no es una nueva lista
        // sino una "vista" de la ya existente.
        // Las operaciones que modifiquen la sublista,
        // modificar�n la lista subyacente.

        List<String> subLista = lista.subList(3,5);
        System.out.println("\n\nElementos de la sublista");
        for (String s : subLista) {
            System.out.print(s + " ");
        }
        
        System.out.println("\n\nElementos de la lista");
        for (String s2 : lista) {
			System.out.println(s2+" ");
		}

        // Si eliminamos elementos de la sublista
        // se eliminan de la lista.
        subLista.clear();

        System.out.println("\n\nElementos de la lista modificados a trav�s de la sublista");
        for (String s : lista) {
            System.out.print(s + " ");
        }

    }

}
