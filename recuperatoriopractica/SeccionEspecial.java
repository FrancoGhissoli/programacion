package recu2021;

import java.util.ArrayList;
import java.util.Collections;

public class SeccionEspecial extends seccion {
	
	private ArrayList<String> admisibles;

	public SeccionEspecial(String categoria) {
		super(categoria);
		this.admisibles = new ArrayList();
	}
	
	public void addAdmisible(String s) {
		admisibles.add(s);
	}

	public void agregarElemento (elementoAbstracto nuevo) {
		if(nuevo!=null) {		
			if(admisibles.contains(nuevo.getCategoria())) {
					elementos.add(this);
					Collections.sort(elementos);
			}
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
			SeccionEspecial copiaSeccion = new SeccionEspecial(this.categoria);
			for(elementoAbstracto elem : copias) {
				copiaSeccion.agregarElemento(elem);
			}
			return copiaSeccion;
			
		}else return null;
	}
	
}
