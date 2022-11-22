package primerparcialpractica;

public class filtroNOT extends filtro {
	private filtro f1;
	@Override
	public boolean cumple(noticias c) {
		return !f1.cumple(c);
	}

}
