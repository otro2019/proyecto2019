package recorriendo_listas;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class Listas {

	@Test
	public void recorriendoListas() {

        LinkedList<Integer> miLista = new LinkedList<>();
        miLista.add(10);
        miLista.add(2);
        miLista.add(5);
        miLista.add(7);
        miLista.add(9);
        miLista.add(2);
        miLista.add(100);

        LinkedList<Integer> otraLista = new LinkedList<>();
        for (Integer unNumero : miLista) {

            otraLista.add(unNumero * 2);
        }

        //Sin usar el metodo get() comprobá que el primer numero de la lista es 20
        assertEquals( (Integer)20 , otraLista.peekFirst());
        

       LinkedList<Integer> otraLista2 = new LinkedList<>();
        for (int i = 0; i < miLista.size(); i++) {

            if (miLista.get(i) % 2 == 0) {

               otraLista2.add(miLista.get(i));            }
        }
        //Sin usar el metodo get() comprobá que el ultimo numero de la lista es 100
        assertEquals((Integer)100,otraLista2.peekLast());

         //¿Que diferencia existe entre este bloque while y el for anterior?
         //La diferencia es que
        LinkedList<Integer> otraLista3 = new LinkedList<>();
        Integer j = 0;
        Integer tamanioLista = miLista.size();
        while (j < tamanioLista) {

            if (miLista.get(j) > 9) {
                otraLista3.add(miLista.get(j));
            }
        }
    }
}