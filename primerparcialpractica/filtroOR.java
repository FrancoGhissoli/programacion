package primerparcialpractica;

public class filtroOR extends filtro {
	private filtro f1;
	private filtro f2;
	@Override
	public boolean cumple(noticias c) {
		// TODO Auto-generated method stub
		return f1.cumple(c) || f2.cumple(c);
	}

}
