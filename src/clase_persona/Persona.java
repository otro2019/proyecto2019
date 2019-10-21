package clase_persona;

public class Persona {

	private String nombre;
	private String fechaDeNacimiento;
	private Integer edad;
	private Integer dni;
	private final String sexo;
	private Double peso;
	private Double altura;

	public Persona() {

		this.dni = 00000000;
		this.sexo = "hombre";

	}

	public Persona(String nombre, Integer edad, String sexo) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, String fechaNacimiento, Integer edad, Integer dni, String sexo, Double peso,
			Double altura) {

		this.nombre = nombre;
		this.fechaDeNacimiento = fechaNacimiento;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}
	
	public Double calcularIMC(){
		
		//Double imc = (this.peso)/(this.altura*this.altura);
		
		final Double pesoIdeal = -1.0;
		final Double debajoDeSuPeso = 0.0;
		final Double sobrePeso = 1.0;
		Double resultado=0.0;
		
		if((this.peso)/(this.altura*this.altura) <20.0) {
			
			 resultado = pesoIdeal;
			
		}
		
		if((this.peso)/(this.altura*this.altura)>=20.0 && (this.peso)/(this.altura*this.altura)<=25.0) {
			resultado = debajoDeSuPeso;
		}
		
		if((this.peso)/(this.altura*this.altura)>25.0) {
			resultado = sobrePeso;
		}
		
		return resultado;
		
	}
	
	public Boolean esMayorDeEdad() {
		Boolean esMayor=false;
		if(this.getEdad()>=18) {
			esMayor=true;
		}else {
			esMayor = false;
		}
		
		return esMayor;
	}

}
