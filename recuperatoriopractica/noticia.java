package recuperatoriopractica;

import java.util.ArrayList;

public class noticia extends elementoAbstracto {
	private String contenido;
	private String categoria;
	private ArrayList<String> palabrasclave;

	public noticia(String contenido, String categoria, ArrayList<String> palabrasclave) {
		this.contenido = contenido;
		this.categoria = categoria;
		this.palabrasclave = new ArrayList<>(palabrasclave);
	}

	@Override
	public int compareTo(elementoAbstracto o) {
		return this.getCategoria().compareTo(o.getCategoria());
	}

	@Override
	ArrayList<String> getPalabrasclaves() {
		return new ArrayList<String>(palabrasclave);
	}

	public String getContenido() {
		return contenido;
	}

	public String getCategoria() {
		return categoria;
	}
	
}
