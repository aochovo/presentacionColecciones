package algoritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AlgoritmosColeccionesApp {

    public static void main(String[] args) {

        /**
         * ALGORITMOS DE ORDENACI�N
         */

        // Definimos una lista de n�meros
        List<Integer> listaNumeros = new ArrayList<>(List.of(7,3,6,4,5,5,9));

        // La ordenamos (orden natural, ascendente)
        Collections.sort(listaNumeros);

        // Resultado
        System.out.println("ORDEN ASCENDENTE");
        listaNumeros.forEach(n -> System.out.print(n + " "));

        // La ordenamos descendentemente
        // reverseOrder devuelve el orden inverso al orden natural
        // implementado por Comparable.
        //Collections.sort(listaNumeros, Collections.reverseOrder());

        Collections.reverse(listaNumeros);

        // Resultado
        System.out.println("\nORDEN DESCENDENTE");
        listaNumeros.forEach(n -> System.out.print(n + " "));

        // DESORDENACI�N
        Collections.shuffle(listaNumeros);
        // Resultado
        System.out.println("\nELEMENTOS DESORDENADOS");
        listaNumeros.forEach(n -> System.out.print(n + " "));



        /**
         * ALGORITMOS DE B�SQUEDA
         */

        // Para usar la b�squeda binaria, la lista debe estar ordenada
        Collections.sort(listaNumeros);

        // Buscamos un elemento que sabemos que est� contenido en la colecci�n
        int index = Collections.binarySearch(listaNumeros, 7);

        // Si lo encontramos devueve un int que es la posicion de dicho elemento
        //si nolo encuentra devuelve -1
        if (index >= 0)
            System.out.println("\n\nPodemos encontrar el elemento 7 en la posici�n " + index);
        else
            System.out.println("\n\nNo se ha podido encontrar el elemento 7");

        // Ahora buscamos un elemento que sabemos que no est� contenido en la colecci�n
        index = Collections.binarySearch(listaNumeros, 25);

        if (index >= 0)
            System.out.println("\nPodemos encontrar el elemento 25 en la posici�n " + index);
        // Si no lo encontramos...
        else {
            System.out.println("\nNo se ha podido encontrar el elemento 25");
            // Si quisi�ramos insertar el elemento en el lugar adecuado, seg�n el orden actual
            listaNumeros.add(-index-1, 25);
        }

        // Resultado
        System.out.println("\nELEMENTOS TRAS INSERTAR UN ELEMENTO EN SU LUGAR ADECUADO");
        listaNumeros.forEach(n -> System.out.print(n + " "));

        // Tambi�n se puede buscar con un orden determinado, usando la segunda
        // implementaci�n de binarySearch

        // Ordenamos descendentemente
        Collections.sort(listaNumeros, Collections.reverseOrder());

        index = Collections.binarySearch(listaNumeros, 9, Collections.reverseOrder());

        System.out.println("\n\nELEMENTOS ORDENADOS INVERSAMENTE");
        listaNumeros.forEach(n -> System.out.print(n + " "));

        if (index >= 0)
            System.out.println("\nPodemos encontrar el elemento 9 en la posici�n " + index);
        else
            System.out.println("\n\nNo se ha podido encontrar el elemento 9");


        /**
         * ALGUNAS OPERACIONES
         */

        // M�XIMO Y M�NIMO

        // Funciona sobre Collection. Podemos probar con un Set.
        Set<Integer> conjuntoDeNumeros = new HashSet<>(listaNumeros);

        int minimo = Collections.min(conjuntoDeNumeros);

        System.out.println("\n\nEl valor minimo del conjunto de n�meros es " + minimo);

        // FRECUENCIA

        int elemento = 5;
        int frecuencia = Collections.frequency(conjuntoDeNumeros, elemento);

        System.out.println("\nEl n�mero de ocurrencias de " + elemento + " en la colecci�n es " + frecuencia);


        // DISJOINT

        List<Integer> pares = List.of(1,3,5,7,9);
        List<Integer> impares = List.of(0,2,4,6,8);

        if (Collections.disjoint(pares, impares)) {
            System.out.println("\nAmbas colecciones no tienen ning�n elemento en com�n");
        }

    }



}