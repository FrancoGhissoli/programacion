package primerparcialpractica;

import java.util.ArrayList;
import java.util.Collection;

public class SeccionEspecial extends subgrupo {
private int cantidad;
private String categoriafija;
	
	public String getcategoriafija(String categoriafija) {
		return categoriafija;
	}
	public ArrayList<String> getPalabrasclave(){
		ArrayList <String> aux = super.getPalabrasclave();
		
		ArrayList<String> resultado= new ArrayList <String>();
		for (int i = 0 ;(i<aux.size() && (i<cantidad)); i++) {
			resultado.add(aux.get(i));
		}
		return resultado;
	}
}
