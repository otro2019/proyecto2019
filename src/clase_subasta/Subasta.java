package clase_subasta;

public class Subasta {
	
	private Double valor ;
	private String descripcion;
	private Boolean cerrado;
	private final Integer TOPE = 5;
	private Integer contadorDeVecesOfertadas;
	
	public Subasta (Double valor , String descripcion) {
		
		this.valor=valor;
		this.descripcion=descripcion;
		this.cerrado=false;
		this.contadorDeVecesOfertadas=0;
		
	}
	
	public Double getValor() {
		return this.valor;
	}
	
	public void setValor(Double valor) {
		
		this.valor = valor;
	}
	
	public String getDescripcion() {
		
		return this.descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		
		this.descripcion=descripcion;
		
	}
	
	public Boolean getCerrado() {
		return this.cerrado;
	}
	
	public void setCerrado() {
		this.cerrado = cerrado;
	}
	
	public void ofertar(Double valorAOfertar) {

		contadorDeVecesOfertadas++;
		
		if(valorAOfertar>this.valor) {
			this.valor=valorAOfertar;
		}else {
			 valorAOfertar = this.valor;
		}
		

	}
	
	public Boolean cerrarSubasta() {

		if(this.cerrado== false && this.contadorDeVecesOfertadas == TOPE) {
			
			this.cerrado = true;
			
		}else {
			
			this.cerrado = false;
			
		}

		return this.cerrado;
		
	}
	
	
}
