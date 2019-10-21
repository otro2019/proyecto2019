package test_password;

import static org.junit.Assert.*;

import org.junit.Test;

import clase_password.Password;

public class TestPassword {

	@Test
	public void testQueSePuedaCrearUnaContraseña() {
		
		Password p1 = new Password();
		
		assertEquals((String)"julieta" , p1.cambiarContraseña("julieta"));
		
	}
	
	@Test
	public void testQueVerifiqueQueUnaContraseñaSeaFuerte() {
		
		Password p1 = new Password();
		
		p1.cambiarContraseña("juLIE962110");
		
		//MAS DE 2 MAYUSCULAS 3
		//MAS DE 1 MINUSCULA 2
		//MAS DE 5 NUMEROS 6
		
		assertTrue(p1.esFuerte());
		
	}

}
