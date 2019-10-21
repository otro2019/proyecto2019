package test_string;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestString {

	@Test
	public void testIgualdadDeObjetos() {
		
		String cadena1 = new String("Cadena");
		String cadena2 = new String("Cadena");
		
		
		assertTrue(cadena1.equals(cadena2));
		
		//con == , no funciona xq los string se comparan con equals
		
	}

}
