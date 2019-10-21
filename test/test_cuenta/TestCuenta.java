package test_cuenta;

import static org.junit.Assert.*;

import org.junit.Test;

import clase_cuenta.Cuenta;

public class TestCuenta {

	@Test
	public void testQueVerifiqueQueLaCantidadADepositarNoAfecteAlSaldo() {
		
		Cuenta c1 = new Cuenta ("juls" , 50.0);
		
		c1.depositar(-20.0);
		
		Double vE = 70.0;
		
		assertEquals(vE , c1.getSaldo());
		
	}
	
	@Test
	public void testQueVerifiqueCantidadMayorNegativaNoAfecteASaldo() {
		
		Cuenta c2= new Cuenta ("juls" , 50.0);
		
		c2.retirar(60.0);
		
		Double vE = 10.0;
		
		assertEquals(vE , c2.getSaldo());
		
	}
	
	

}
