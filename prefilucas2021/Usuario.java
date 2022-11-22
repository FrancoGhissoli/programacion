package prefilucas2021;

 public class Usuario {
 private String Nombre;
 private int Anio_registro;
  private String email;
public Usuario(String nombre, int anio_registro, String email) {
	super();
	Nombre = nombre;
	Anio_registro = anio_registro;
	this.email = email;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getAnio_registro() {
	return Anio_registro;
}
public void setAnio_registro(int anio_registro) {
	Anio_registro = anio_registro;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
