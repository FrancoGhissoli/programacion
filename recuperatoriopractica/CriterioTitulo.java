package recu2021;

public class CriterioTitulo extends Criterio {
	private String titulo;
	
	public CriterioTitulo (String t) {
		this.titulo = t;
	}
	
	@Override
	public boolean cumple(noticia n) {
		return (n.getTitulo() == this.titulo);
	}

}
