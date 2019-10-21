package clase_rectangulo;

public class Rectangulo {
	
	protected Double base;
	protected Double altura;
	
	public Rectangulo(Double base , Double altura) {
		this.base=base;
		this.altura=altura;	
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double calcularArea(){
	    
		 return (this.base*this.altura);
	}
	
	public Double calcularPerimetro(){
	   return (this.base*2+this.altura*2);
	}

}
