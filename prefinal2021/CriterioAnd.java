package recu2021;

public class CriterioAnd extends Criterio {
Criterio c1, c2;
	
	public CriterioAnd (Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(noticia n) {
		
		return (c1.cumple(n) && c2.cumple(n));
	}

}
