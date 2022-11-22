package recu2021;

public class CriterioNot extends Criterio {
	private Criterio c1;
	
	public CriterioNot(Criterio c) {
		this.c1 = c;
	}

	@Override
	public boolean cumple(noticia n) {
		
		return !c1.cumple(n);
	}

}
