package primerparcialpractica;

import java.util.ArrayList;

public class noticias extends elementoAbstracto {

	private String contenido;
	private String titulo;
	private String autor;
	private String categoria;
	private ArrayList<String> palabrasClave;

	public noticias(String contenido, String titulo, String autor, String categoria, ArrayList<String> palabrasClave) {
		super();
		this.contenido = contenido;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.palabrasClave = new ArrayList<>(palabrasClave);
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
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

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	String getCategoria() {
		return categoria;
	}

	@Override
	ArrayList<String> getPalabrasclave() {
		return new ArrayList<String>(palabrasClave);

	}

	/* buscar en el elementos simple */
	@Override
	ArrayList<noticias> buscar(filtro c) {
		ArrayList<noticias> salida = new ArrayList<noticias>();
		if (c.cumple(this))
			;
		salida.add(this);
		return salida;
	}

}
