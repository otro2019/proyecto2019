package clase_monomio_y_polinomio;

import java.util.ArrayList;
import java.util.List;

public class Polinomio{
	
	    protected List<Monomio>monomios= new ArrayList();
	    public Polinomio(Monomio monomio) {
	    
		this.monomios = new ArrayList<Monomio>();

	}
	      
	    public List<Monomio> getMonomios() {
			return monomios;
		}


		public void setMonomios(List<Monomio> monomios) {
			this.monomios = monomios;
		}


		public Double resolver(Double x){

	        Double resultado = 0d;

	        for (Monomio unMonomio: monomios) {

	            resultado += unMonomio.evaluar(x);
	        }

	        return resultado;
	    }
	}


