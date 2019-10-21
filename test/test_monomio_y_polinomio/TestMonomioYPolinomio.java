package test_monomio_y_polinomio;

import static org.junit.Assert.*;

import org.junit.Test;

import clase_monomio_y_polinomio.FuncionConstante;
import clase_monomio_y_polinomio.FuncionCuadratica;
import clase_monomio_y_polinomio.FuncionLineal;
import clase_monomio_y_polinomio.Monomio;
import clase_monomio_y_polinomio.Polinomio;

public class TestMonomioYPolinomio {

	@Test
	public void testQueVerifiqueUnaFuncionConstante() {
		
		//Función constante. Es un polinomio donde su grado es 0
		
		FuncionConstante fconstante = new FuncionConstante(0 , 2.0);
		
		assertEquals((Integer)0 , fconstante.getExponente());
		assertEquals((Double)2.0 , fconstante.getCoeficiente());
//		System.out.println(fconstante.getExponente());
//		System.out.println(fconstante.getCoeficiente());
		
	}
	
	@Test
	public void testQueVerifiqueUnaFuncionLineal() {
		
		//Función lineal. Es un polinomio donde su grado es 1
		
		Monomio m1 = new Monomio(1 , 4.0);
		FuncionLineal flineal = new FuncionLineal(m1);
		
		assertEquals((Integer)1 , m1.getExponente());
		assertEquals((Double)4.0 , m1.getCoeficiente());
//		System.out.println(m1.getExponente());
//		System.out.println(m1.getCoeficiente());
//		
	}
	
	@Test
	public void testQueVerifiqueQueEsUnaFuncionCuadratica() {
		
		//Función cuadrática. Es un polinomio donde su grado es 2
		
		Monomio m2 = new Monomio(2 , 5.0);
		FuncionCuadratica fcuadratica = new FuncionCuadratica(m2);
		
		assertEquals((Integer)2 , m2.getExponente());
		assertEquals((Double)5.0 , m2.getCoeficiente());
//		System.out.println(m2.getExponente());
//		System.out.println(m2.getCoeficiente());
		
	}

}
