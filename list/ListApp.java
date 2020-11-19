package list;

import java.util.Arrays;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {

        // Una de las formas m�s sencillas de obtener una lista
        List<String> lista = Arrays.asList("Uno", "Dos", "Tres", "cinco", "Seis");

        // Uso posicional de la lista
        // Los �ndices comienzan en 0

        // Obtener el elemento en la posici�n 2 (tercer elemento)
        String tercerElemento = lista.get(2);

        // Iterar sobre los elementos
        lista.forEach((x) -> System.out.print(x + " "));



    }



}
