package recuperatoriopractica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class subseccion extends elementoAbstracto {
	private ArrayList<elementoAbstracto> noticias;
	private String Categoria;
	private ArrayList<elementoAbstracto> elementos;

	@Override
	ArrayList<String> getPalabrasclaves() {
		ArrayList<String> palabrasclave = new ArrayList<String>();
		for (elementoAbstracto i : this.noticias) {
			ArrayList<String> aux = i.getPalabrasclaves();
			for (String s : aux)
				if (!palabrasclave.contains(s))
					palabrasclave.add(s);
		}
		return palabrasclave;
	}

	public void agregarElemento (elementoAbstracto nuevo) {
		this.agregarElemento(nuevo);
		elementos.add(this);
		Collections.sort(elementos);
		
		
	}

	@Override
	public int compareTo(elementoAbstracto o) {
		return this.getCategoria().compareTo(o.getCategoria());
		
	}



	@Override
	String getCategoria() {
		
		return null;
	}

}
