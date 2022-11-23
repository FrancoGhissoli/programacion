package recu2021;

import java.util.ArrayList;

public class noticia extends elementoAbstracto {
	private String titulo;
	private String autor;
	private String contenido;
	private String categoria;
	private ArrayList<String> palabrasclave;

	public noticia(String contenido, String titulo, String autor, String categoria) {
		this.titulo = titulo;
		this.autor = autor;
		this.contenido = contenido;
		this.categoria = categoria;
		this.palabrasclave = new ArrayList();
	}

	

	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public void setContenido(String contenido) {
		this.contenido = contenido;
	}



	@Override
	ArrayList<String> getPalabrasclaves() {
		return new ArrayList<String>(palabrasclave);
	}

	public String getContenido() {
		return contenido;
	}

	public String getCategoria() {
		return this.categoria;
	}



	@Override
	elementoAbstracto copiaRestringida(Criterio c) {
		if(c.cumple(this)) {
			return new noticia(this.contenido, this.titulo, this.autor, this.categoria);
		}else return null;
	}
	
}