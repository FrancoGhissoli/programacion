package recu2021;

public class CriterioCategoria extends Criterio {
	
	private String categoria;
	
	public CriterioCategoria (String c) {
		this.categoria = c;
	}
	
	@Override
	public boolean cumple(noticia n) {
		return (n.getCategoria() == this.categoria);
	}


}
