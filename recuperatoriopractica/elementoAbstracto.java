package recuperatoriopractica;

import java.util.ArrayList;
import java.util.Collection;

public abstract class elementoAbstracto implements Comparable<elementoAbstracto> {
	
	abstract ArrayList <String> getPalabrasclaves();

	abstract String getCategoria();
	


	public int compareTo(elementoAbstracto o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
