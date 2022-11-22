package primerparcialpractica;

public class filtrocategoria extends filtro {

	private String categoriabuscada;
	
	public filtrocategoria (String categoriabuscada) {
		this.categoriabuscada=categoriabuscada;
	}
	
	
	@Override
	public boolean cumple(noticias c) {
		return c.getCategoria().equals(categoriabuscada);
	}

}
