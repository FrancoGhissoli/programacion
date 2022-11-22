package primerparcialpractica;



public abstract class filtrotitulo extends filtro {
	private String titulobuscado;

	public filtrotitulo(String titulobuscado) {
		this.titulobuscado = titulobuscado;
	}

	@Override
	public boolean cumple(noticias c) {

		return c.getTitulo().equals(titulobuscado);
	}

}
