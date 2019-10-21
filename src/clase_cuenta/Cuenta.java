package clase_cuenta;

public class Cuenta {
	
	private String titular ;
	private Double saldo;
	private Double cantidadd;
	
	public Cuenta(String titular , Double saldo) {
		this.titular = titular;
		this.saldo=saldo;	
	}
	
	public Cuenta(String titular , Double saldo , Double cantidad) {
		this.titular = titular;
		this.saldo=saldo;
		this.cantidadd=cantidad;	
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getCantidad() {
		return cantidadd;
	}

	public void setCantidad(Double cantidad) {
		this.cantidadd = cantidad;
	}
	
	/**
	La cantidad se suma al saldo, si la cantidad
	es negativa el saldo no debe ser afectado
	*/
	public void depositar(Double cantidad){
	    if(cantidad<0 || cantidad>0) {
	    	
	    	this.saldo+=Math.abs(cantidad);	
	    }
	}
	
	/**
	Restamos cantidad al saldo actual, si la cantidada a retirar
	es mayor que el saldo no se debe afectar el saldo
	*/

	public void retirar(Double cantidad){
		
		 if(cantidad<0 || cantidad>0) {
			 
			 this.saldo=Math.abs(this.saldo-cantidad);
			
			 
		 }
	    			
		
	}

}
