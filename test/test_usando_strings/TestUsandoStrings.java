package test_usando_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUsandoStrings {

	@Test
    public void usandoString() {

          //1.A 
        //Usando el metodo reverse de proba que el string palindromo se lee igual al derecho que al reves
       String palindromo = "anita lava la tina";
       String palindromoSinEspacio= palindromo.replace(" ","");
       StringBuilder builder = new StringBuilder(palindromoSinEspacio);
       String palindromoAlReves = builder.reverse().toString();
 
     
       assertEquals(palindromoSinEspacio, palindromoAlReves);

         //1.B  
        String frase = "Do, or do not. There is no try";
        String contiene = "There";
        String noContiene = "Yoda";

        //Existe un metodo que sirve para que lo siguiente de verde. ¿Cuál es?
        
        Boolean resultado1 = frase.contains(contiene);
        Boolean resultado2 = frase.contains(noContiene);
        
        assertTrue(resultado1);
        assertFalse(resultado2);

          //1.C 
        //E String indiana tiene 18 posiciones, con que metodo podes comprobarlo?
        String indiana = "Henry Jones Junior";
        assertEquals(18, indiana.length());

        //Comproba que 6 es la posicion de la primer i
        String palabra = "Otorrinolaringólogo";
        Integer posicion=0;
        char i='i';
		assertEquals(6, palabra.indexOf(i)+1);

        // Y que 12 es de la segunda
		
		// Carácter en la posición después del valor de índice dado 
		//IndexOf (char c, int startindex)
       assertEquals(12,palabra.indexOf(i , 11)+1);
       
     
    }
	
}


