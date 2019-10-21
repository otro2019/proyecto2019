package clase_cuenta_ganado;

public class CuentaGanado {
	
	private Integer contador;
	private Integer limite;
	Boolean pasoLimite;
	
	public CuentaGanado( Integer tope) {
		this.limite=tope;
		this.contador=0;
		this.pasoLimite=false;
		
	}
	
	public void setContador(Integer contador) {
		this.contador=contador;
		
	}
	
	public Integer getContador() {
		return this.contador;
	}
	
	public void setLimite(Integer limite) {
		this.limite=limite;
	}
	
	public Integer getLimite() {
		return this.limite;
	}
	
	public Boolean getPasoLimite() {
		return this.pasoLimite;
	}

	public void setPasoLimite(Boolean pasoLimite) {
		this.pasoLimite = pasoLimite;
	}

	
	public void incrementar() {
		
		contador++;
		
		if(contador<this.limite) {
			
			pasoLimite = false;
		}else {
			
			pasoLimite=true;
		}
		
	}
	
	
	public Integer reset() {
		if(this.contador>this.limite || this.contador<this.limite) {
			
			this.contador=0;
			
		}
		return this.contador;
	}

}
