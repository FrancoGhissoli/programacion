package primerparcialpractica;

import java.util.ArrayList;

public class subgrupo extends elementoAbstracto {
	private int posicionBuscada;
	private String mensaje;
	private ArrayList<elementoAbstracto> noticias;

	@Override
	/*obtengo la categoria en la posicion buscada sino retorno el mensaje*/
	String getCategoria() {
		for (int i = 0; i < noticias.size(); i++) {
			if (i == posicionBuscada - 1) {
				return noticias.get(posicionBuscada).getCategoria();
			}
		}
		return mensaje;
	}
	@Override
	/*agrego palabars sin repetidos*/
	ArrayList<String> getPalabrasclave() {
		ArrayList<String> conjuntoPalabras = new ArrayList<String>();
		for (elementoAbstracto i : noticias) {
			ArrayList<String> aux = i.getPalabrasclave();
			for (String s : aux) {
				if (!conjuntoPalabras.contains(s)) {
					conjuntoPalabras.add(s);
				}
			}
		}
		return conjuntoPalabras;
	}

	public void setPosicionBuscada(int posicionBuscada) {
		this.posicionBuscada = posicionBuscada;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	ArrayList<noticias> buscar(filtro c) {
		ArrayList <noticias> salida = new ArrayList <noticias>();
		for(int i = 0 ; i < noticias.size(); i++) {
			salida.addAll(noticias.get(i).buscar(c));
		}
		return salida;
	}

}
