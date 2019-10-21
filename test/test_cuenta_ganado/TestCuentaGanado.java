package test_cuenta_ganado;

import static org.junit.Assert.*;

import org.junit.Test;

import clase_cuenta_ganado.CuentaGanado;

public class TestCuentaGanado {

	@Test
	public void testQueVerifiqueGanadoMayorALimite() {
	CuentaGanado c1 = new CuentaGanado(5);
	c1.incrementar();
	c1.incrementar();
	c1.incrementar();
	c1.incrementar();
	c1.incrementar();
	c1.incrementar();
	
	
	assertTrue(c1.getPasoLimite());
	}
	
	public void testQueVerifiqueGanadoMenorALimite() {
		CuentaGanado c1 = new CuentaGanado(5);
		
		c1.incrementar();
		c1.incrementar();
		c1.incrementar();
		
		assertFalse(c1.getPasoLimite());
		
		}
	
	public void testQueVerifiqueReset() {
		CuentaGanado c1 = new CuentaGanado(50);
		
		c1.incrementar();
		c1.incrementar();
		c1.incrementar();
		
		Integer vE = c1.reset();
		Integer vO = c1.getContador();
		
		assertEquals(vE , vO);
		

    }
	
}
