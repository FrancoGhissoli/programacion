package primerparcialpractica;

public class filtroautor extends filtro {

	private String autorbuscado;
	
	public filtroautor(String autorbuscado) {
		this.autorbuscado = autorbuscado;
	}
	@Override
	public boolean cumple(noticias c) {
		
		return c.getAutor().equals(autorbuscado);
	}

}
