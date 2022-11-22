package primerparcialpractica;

public class filtrocontenido extends filtro {

	private String contenidobuscado;
	
	public filtrocontenido (String contenidobuscado) {
	this.contenidobuscado = contenidobuscado;
	}
	
	@Override
	public boolean cumple(noticias c) {
		return c.getContenido().equals(contenidobuscado);
	}

}
