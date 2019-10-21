package test_subasta;

import static org.junit.Assert.*;

import org.junit.Test;

import clase_subasta.Subasta;

public class TestSubasta {

	@Test
	public void testQueVerifiqueUnaSubastaMayor() {
		
		Subasta miSubasta = new Subasta(20.0 , "borrador");
		miSubasta.ofertar(50.0);
		
		Double vE = 50.0;
		Double vO = miSubasta.getValor();
		
		assertEquals(vE ,vO);
	}
	
	
    public void testQueVerifiqueSubastaOfertaCerrada() {
		Subasta miSubasta = new Subasta(20.0 , "borrador");
		
		miSubasta.ofertar(50.0);
		miSubasta.ofertar(10.0);
		miSubasta.ofertar(30.0);
		miSubasta.ofertar(22.0);
		miSubasta.ofertar(102.0);
		Double vE = 102.0;
	
		Double vO = miSubasta.getValor();
	
		miSubasta.cerrarSubasta();
		
		assertTrue(miSubasta.getCerrado());
		
	}
	
	public void testQueVerifqueOfertaMenor() {
		
		 Subasta miSubasta = new Subasta(20.0 , "borrador");
			
			miSubasta.ofertar(10.0);
			
			Double vE = 20.0;
		
			Double vO = miSubasta.getValor();
			miSubasta.cerrarSubasta();
		
			assertEquals(vE , vO);
		
	}

}
