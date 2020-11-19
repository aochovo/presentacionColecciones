package map;

import java.util.TreeMap;

public class TreeMapApp {

    public static void main(String[] args) {

        // Instanciamos nuestro TreeMap
        TreeMap<String, Contacto> contactos = new TreeMap<>();

        // A�adimos algunos contactos
        Contacto[] arrayContactos = new Contacto[] {
          new Contacto("Garc�a Garc�a", "Jos�", "600123123", "jose.garcia@openwebinars.net"),
          new Contacto("L�pez Mart�nez", "Ana", "600456456", "ana.lopez@openwebinars.net"),
          new Contacto("Castro M�ndez", "Javier", "600789789", "javier.castro@openwebinars.net"),
          new Contacto("La�nez Mu�oz", "Mar�a", "698765432", "maria.lainez@openwebinars.net")
        };

        for (Contacto contacto : arrayContactos) {
            contactos.put(contacto.getApellidosNombre(), contacto);
        }

        // Si los obtenemos, nos aparecen en el orden de las claves, es decir, Apellido, Nombre
        contactos.forEach((k,v) -> System.out.println(v));

        // Si a�adimos un nuevo contacto, se inserta en orden
        Contacto nuevoContacto = new Contacto("Fern�ndez Hern�ndez", "Juan", "612345678", "juan.fernandez@openwebinars.net");
        contactos.put(nuevoContacto.getApellidosNombre(), nuevoContacto);

        // Si los volvemos a obtener todos, nos vuelven a aparecer en el orden natural de la clave
        System.out.println("\n\n");
        contactos.forEach((k,v) -> System.out.println(v));






    }


}