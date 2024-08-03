
package poo.tarea.Colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Pruebaas de collections...
 */

public class app {

    public static void main(String[] args) {
        
        List<String> nombres = new ArrayList<String>();

        nombres.add("Leonardo");
        nombres.add("Adrian");
        nombres.add("Riquelme");
        nombres.add("Pedro");

        int count = nombres.size();
        System.out.println("Cantidad de nombres: "+count);

        for(int i=0; i<count; i++){
            System.err.println("Nombre: "+nombres.get(i));
        }

        System.out.println("Removemos en el indice 1");
        nombres.remove(1);

        
        for(int i=0; i<nombres.size(); i++){
            System.err.println("Nombre: "+nombres.get(i));
        }

    }
}


