package recu2021;

public class NoticiaPrivada extends noticia {

	public NoticiaPrivada(String contenido, String titulo, String autor, String categoria) {
		super(contenido, titulo, autor, categoria);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	elementoAbstracto copiaRestringida(Criterio c) {
		return null;
	}

}
