package recu2021;

import java.util.ArrayList;
import java.util.Collection;

public abstract class elementoAbstracto implements Comparable<elementoAbstracto> {
	
	abstract ArrayList <String> getPalabrasclaves();

	abstract String getCategoria();
	
	abstract elementoAbstracto copiaRestringida(Criterio c);

	public int compareTo(elementoAbstracto o) {
		return this.getCategoria().compareTo(o.getCategoria());
	}
}
