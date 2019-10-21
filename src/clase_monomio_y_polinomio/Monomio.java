package clase_monomio_y_polinomio;

public class Monomio {
	
	/**
	 * Clase que quedela un mononio.
	 * Un monomio es una expresión algebraica en la que se utilizan exponentes naturales de variables literales
	 * que constan de un solo término (si hubiera una suma o una resta sería un binomio),
	 * un número llamado coeficiente
	 * Ejemplo de un monomio
	 *
	 * 4X^2
	 * donde 4 lo llamamos coeficiente y al 2 el exponente
	 */
	
	/**
     * El exponente tiene que ser un numero natural (positivo)
     */
    protected Integer exponente;
    protected Double coeficiente;

    public Monomio(Integer exponente, Double coeficiente) {
        this.exponente = exponente;
        this.coeficiente = coeficiente;
    }

    public Integer getExponente() {
		return exponente;
	}

	public void setExponente(Integer exponente) {
		this.exponente = exponente;
	}

	public Double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(Double coeficiente) {
		this.coeficiente = coeficiente;
	}

	public Double evaluar(Double x){

        return  coeficiente * Math.pow(x, this.coeficiente);
    }


}
