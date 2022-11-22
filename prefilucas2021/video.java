package prefilucas2021;
import java.util.ArrayList;

public class video extends elemento implements Comparable<video>{
	private Usuario usuario;
	private int duracion;
	private int visualizaciones;
	private int megusta;
	private int nomegusta;
	private int anioPublicacion;
	private ArrayList <String> palabrasClave;
	
	
	public video(Usuario usuario, int duracion, int visualizaciones, int megusta, int nomegusta, int anioPublicacion,
			ArrayList<String> palabrasClave) {
	
		this.usuario = usuario;
		this.duracion = duracion;
		this.visualizaciones = visualizaciones;
		this.megusta = megusta;
		this.nomegusta = nomegusta;
		this.anioPublicacion = anioPublicacion;
		this.palabrasClave = palabrasClave;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public int getVisualizaciones() {
		return visualizaciones;
	}


	public void setVisualizaciones(int visualizaciones) {
		this.visualizaciones = visualizaciones;
	}


	public int getMegusta() {
		return megusta;
	}


	public void setMegusta(int megusta) {
		this.megusta = megusta;
	}


	public int getNomegusta() {
		return nomegusta;
	}


	public void setNomegusta(int nomegusta) {
		this.nomegusta = nomegusta;
	}


	public int getAnioPublicacion() {
		return anioPublicacion;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public ArrayList<String> getPalabrasClave() {
		return new ArrayList<>(palabrasClave);
	}
	
	public void addpalabraclave(String palabraClave) {
		if (!palabrasClave.contains(palabraClave)) {
			palabrasClave.add(palabraClave);
			}
		}


	@Override
	public int compareTo(video o) {
		if (o.getUsuario().getNombre().equals(this.getUsuario().getNombre())){
			return o.getUsuario().getEmail().compareTo(this.getUsuario().getEmail());
			
		}
		return o.getUsuario().getNombre().compareTo(this.getUsuario().getNombre());
	}
	@Override
	public int cantVideos() {
	return 1;
	}





}
