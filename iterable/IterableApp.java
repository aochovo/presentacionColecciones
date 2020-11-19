package iterable;

import java.util.Arrays;

public class IterableApp {

    public static void main(String[] args) {

        // Obtenemos el iterable por la v�a que corresponda
        Iterable<String> unIterable = obtenerIterable();

        // Lo podemos recorrer usando un bucle for-each
        for (String s: unIterable) {
            System.out.println(s);
        }
        System.out.println("----------");

        // Tambi�n con el m�todo forEach
        unIterable.forEach(System.out::println);


    }

    private static Iterable<String> obtenerIterable() {
        return Arrays.asList("String1", "String2", "String3");
    }

}

