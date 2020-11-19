package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListApp {

    public static void main(String[] args) {

        // LinkedList es menos adecuado que ArrayList en la mayor�a de los casos

        // Suele ser adecuado si necesitamos insertar elementos en medio de la
        // colecci�n durante la iteraci�n

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Uno", "Dos", "Tres"));

        for(ListIterator<String> listIterator = linkedList.listIterator(); listIterator.hasNext();) {
            listIterator.next();
            listIterator.add("Otro");
        }

        linkedList.forEach(e -> System.out.println(e + " "));

    }
}
