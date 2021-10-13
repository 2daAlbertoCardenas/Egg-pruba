package Ejercicio_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<String> Pais = new HashSet();
        String verif;
        System.out.println("<<<<< CARGAR PAISES >>>>>");
        do {
            System.out.print("Pais:");
            Pais.add(leer.next());
            System.out.println("¿Desea guardar otro perro?(S/N)");
            verif = leer.next();
        } while (verif.equals("S"));

        System.out.println("\n<<<<< DATOS PAISES >>>>>");
        System.out.println(Pais);

        System.out.println("\n<<<<< PAISES ORDENADO ALFABETICAMENTE >>>>>");
        ArrayList<String> Pais_Ordenar = new ArrayList(Pais);
        Collections.sort(Pais_Ordenar);
        System.out.println(Pais_Ordenar);

        System.out.println("\n<<<<< BORRAR PAISES >>>>>");
        String borrar = leer.next();

        Iterator<String> it = Pais.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(borrar)) {
                it.remove();
            }
        }

        if (Pais.contains(borrar)) {
            System.out.println("El Pais ingresado no se encuentra");
        } else {
            System.out.println("Pais Borrado");
        }

        System.out.println(Pais);

    }
}




