package clase_cuadrado;

import clase_rectangulo.Rectangulo;

public class Cuadrado extends Rectangulo{

	public Cuadrado(Double base, Double altura) {
		super(base, altura);
		
	}
	
	
	public Double calcularPerimetro(){
		 return (2*this.base)+(2*this.altura);
	   
	}
	public Double calcularArea(){
		return (this.altura*this.altura);
			 
	}
	
	


}
