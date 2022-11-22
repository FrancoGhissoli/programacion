package primerparcialpractica;

public class filtroAND extends filtro {
	private filtro f1;
	private filtro f2;
	
	
	@Override
	public boolean cumple(noticias c) {
		return f1.cumple(c)&&f2.cumple(c);
	}

}
