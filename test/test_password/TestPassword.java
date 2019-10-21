package test_password;

import static org.junit.Assert.*;

import org.junit.Test;

import clase_password.Password;

public class TestPassword {

	@Test
	public void testQueSePuedaCrearUnaContrase�a() {
		
		Password p1 = new Password();
		
		assertEquals((String)"julieta" , p1.cambiarContrase�a("julieta"));
		
	}
	
	@Test
	public void testQueVerifiqueQueUnaContrase�aSeaFuerte() {
		
		Password p1 = new Password();
		
		p1.cambiarContrase�a("juLIE962110");
		
		//MAS DE 2 MAYUSCULAS 3
		//MAS DE 1 MINUSCULA 2
		//MAS DE 5 NUMEROS 6
		
		assertTrue(p1.esFuerte());
		
	}

}
