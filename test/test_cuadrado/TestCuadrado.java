package test_cuadrado;

import static org.junit.Assert.*;

import org.junit.Test;

import clase_cuadrado.Cuadrado;
import clase_rectangulo.Rectangulo;

public class TestCuadrado {

	@Test
	public void sePuedenCrearCuadrados() {
		Cuadrado unCuadrado = new Cuadrado(2.0 , 2.0);
		assertNotNull(unCuadrado);
		Cuadrado otroCuadrado = new Cuadrado(4.0 , 4.0);
		assertNotNull(otroCuadrado); 
	}
	@Test
	public void elPerimetroDeUnCuadradoDebeSerLaSumaDeSusLados() {
		
		Cuadrado unCuadrado = new Cuadrado(4.0 , 4.0);
		
		Double esperado = 16.0;
		
        Double actual = unCuadrado.calcularPerimetro();
        
        /*
        El tercer parametro es un delta. Quiere decir que solamente
        nos van a importar los primeros dos decimales para la comparacion
      */
       assertEquals(esperado, actual, 0.01);
		
	}
	
	@Test
	
	public void elAreaDeUnCuadradoDebeSerLaSumaDeLaBaseYAreaPor2() {
		
		Cuadrado unCuadrado = new Cuadrado(4.0 , 4.0);
		
		Double esperado = 16.0;
		
        Double actual = unCuadrado.calcularArea();
        
       assertEquals(esperado, actual, 0.01);
        
       
 
		
		
	}
	
	

}
