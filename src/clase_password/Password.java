package clase_password;

public class Password {
	
	private Integer longitud = 8;
	private String clave;
	
	public Password() {
		
	}
	
	public Password(Integer longitud) {
		this.longitud=longitud;
	}

	public Integer getLongitud() {
		return longitud;
	}

	public String getClave() {
		return clave;
	}

	public String cambiarContraseña(String clave) {
		return this.clave = clave;
	}
	
	public Boolean esFuerte() {
		
		Boolean fuerte = false;
		Integer minuscula=0;
		Integer mayuscula =0;
		Integer numeros=0;
		char pass;
		
		for (int i = 0; i <clave.length(); i++) {
			
			pass=clave.charAt(i);
			 String passValue = String.valueOf(pass);
			
			if(passValue.matches("[A-Z]")) {
				mayuscula++;			
			}
			
			if(passValue.matches("[a-z]")) {
				minuscula++;			
			}
			
			if(passValue.matches("[0-9]")) { 
				numeros++;	
		}
		
		if(mayuscula>2 && minuscula>1 && numeros>5) {
			fuerte=true;
		}
		
		
	}
	
	

	return fuerte;
}
	
}

