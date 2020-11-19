package set;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetApp {

    public static void main(String[] args) {

        // Crea un HashSet con capacidad inicial para 16 elementos
        // y un factor de carga de 0.75
        // El factor de carga es a partir de que porcentaje de relleno
        // el hashset ampl�a su tama�o
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Cadena 1");
        hashSet.add("Cadena 2");
        // Los valores repetidos simplemente se descartan
        hashSet.add("Cadena 2"); // Valor repetido
        hashSet.add("Cadena 3");

        for (String s: hashSet) {
            System.out.println(s);
        }

        System.out.println("\n\n\n");


        // EJEMPLO DE APLICACI�N: eliminaci�n de duplicados en otra colecci�n
        // Crea un HashSet a partir de otra colecci�n
        // eliminando los duplicados que contenga
        Collection<String> palabrasDelQuijote = palabrasQuijote();
        Set<String> quijoteHashSet = new HashSet<>(palabrasDelQuijote);

        // Se puede comprobar si contiene alg�n elemento
        if (quijoteHashSet.contains("hidalgo"))
            System.out.println("Contiene la palabra hidalgo");
        else
            System.out.println("No contiene la palabra hidalgo");

        // Comparaci�n de n�mero de elementos
        System.out.println("Total de palabras en el 1� p�rrafo: " + palabrasDelQuijote.size());
        System.out.println("Palabras diferentes en el 1� p�rrafo: " + quijoteHashSet.size());

        // Imprimir todos los elementos del hashset
        quijoteHashSet.forEach(System.out::println);


        /*
            HashSet se le parece a ArrayList
            en bastantes funcionalidades, y ofrece mejor rendimiento. Por tanto:
            - Si no queremos manejar repetidos
            - No importa el orden (de valor o inserci�n)
            Podemos usar HashSet
         */


    }

    public static Collection<String> palabrasQuijote() {
        String quijote = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que viv�a un hidalgo de los de lanza en astillero, adarga antigua, roc�n flaco y galgo corredor. Una olla de algo m�s vaca que carnero, salpic�n las m�s noches, duelos y quebrantos los s�bados, lantejas los viernes, alg�n palomino de a�adidura los domingos, consum�an las tres partes de su hacienda. El resto della conclu�an sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los d�as de entresemana se honraba con su vellor� de lo m�s fino. Ten�a en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que as� ensillaba el roc�n como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta a�os; era de complexi�n recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza. Quieren decir que ten�a el sobrenombre de Quijada, o Quesada, que en esto hay alguna diferencia en los autores que deste caso escriben; aunque por conjeturas veros�miles se deja entender que se llamaba Quijana. Pero esto importa poco a nuestro cuento: basta que en la narraci�n d�l no se salga un punto de la verdad.";
        quijote = quijote.toLowerCase().replace(".", "").replace(",", "");
        return Arrays.asList(quijote.split(" "));
    }
}