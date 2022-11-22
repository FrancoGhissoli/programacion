package recu2021;

import java.util.ArrayList;
import java.util.Collections;

public class seccion extends elementoAbstracto {
	protected String categoria;
	protected ArrayList<elementoAbstracto> elementos;

	public seccion (String categoria) {
		this.categoria = categoria;
		this.elementos = new ArrayList();
	}
	
	
	@Override
	ArrayList<String> getPalabrasclaves() {
		ArrayList<String> palabrasclave = new ArrayList<String>();
		for (elementoAbstracto i : this.elementos) {
			ArrayList<String> aux = i.getPalabrasclaves();
			for (String s : aux)
				if (!palabrasclave.contains(s))
					palabrasclave.add(s);
		}
		return palabrasclave;
	}
	
	@Override
	String getCategoria() {
		return this.categoria;
	}
	public void agregarElemento (elementoAbstracto nuevo) {
		if(nuevo!=null) {			
		elementos.add(this);
		Collections.sort(elementos);
		}
	}

	@Override
	elementoAbstracto copiaRestringida(Criterio c) {
		ArrayList<elementoAbstracto> copias = new ArrayList();
		for(elementoAbstracto elem : elementos) {
			elementoAbstracto copiaHijo = elem.copiaRestringida(c);
			if(copiaHijo !=null) {
				copias.add(copiaHijo);
			}
		}
		if (!copias.isEmpty()) {
			seccion copiaSeccion = new seccion(this.categoria);
			for(elementoAbstracto elem : copias) {
				copiaSeccion.agregarElemento(elem);
			}
			return copiaSeccion;
			
		}else return null;
	}
}
