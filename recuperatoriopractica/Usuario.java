package recu2021;

import java.util.ArrayList;

public class Usuario {
	
	private ArrayList<noticia> noticias;
	private Criterio gusto;
	private String nombre, apellido, email;

	public Usuario(String nombre, String apellido, String email, Criterio gusto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.gusto = gusto;
		this.noticias = new ArrayList();
	}
	
	public void recibirNoticia(noticia n) {
		if(this.gusto.cumple(n)) {
			noticias.add(n);
		}
	}
	
	public void setGusto(Criterio c) {
		this.gusto = c;
	}
}
