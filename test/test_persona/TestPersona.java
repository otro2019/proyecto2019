package test_persona;

import static org.junit.Assert.*;

import org.junit.Test;

import clase_persona.Persona;

public class TestPersona {

	@Test
	public void testQueVerifiqueSiEstaEnSuPesoIdeal() {
		
		Persona julieta = new Persona("julieta" , "21/10/1996" , 22 , 39813976 , "mujer" , 52.0 , 1.62);
		
		assertEquals((Double)(-1.0) ,julieta.calcularIMC());
		
	}
	
	@Test
	public void testQueVerifiqueTieneSobrePeso() {
		
		Persona p1 = new Persona("joe" , "2/10/1989" , 30 , 34813976 , "hombre" , 90.0 , 1.50);
		
		assertEquals((Double)1.0 , p1.calcularIMC());
			
	}
	
	@Test
	public void testQueVerifiqueSiEstaPorDebajoDeSuPeso() {
		
		Persona p2 = new Persona("ddlovato" , "20/08/1992" , 27 , 36813976 , "mujer" , 60.0 , 1.60);
		
		assertEquals((Double)(0.0) ,p2.calcularIMC());
		
}
	
	@Test
	public void testQueVerifiqueSiEsMayorDeEdad() {
		
		Persona julieta = new Persona("julieta" , "21/10/1996" , 22 , 39813976 , "mujer" , 52.0 , 1.62);
		
		assertTrue(julieta.esMayorDeEdad());
		
	}
	
}
