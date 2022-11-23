package recu2021;

public class CriterioPalabrasClave extends Criterio {
	
	private String palabra;
	
	public CriterioPalabrasClave (String p) {
		this.palabra = p;
	}
	
	@Override
	public boolean cumple(noticia n) {
		return n.getPalabrasclaves().contains(palabra);
	}

}
