package recu2021;

public class CriterioContenido extends Criterio {
	
	private String contenido;
	
	public CriterioContenido (String c) {
		this.contenido = c;
	}
	
	@Override
	public boolean cumple(noticia n) {
		return (n.getContenido() == this.contenido);
	}

}
