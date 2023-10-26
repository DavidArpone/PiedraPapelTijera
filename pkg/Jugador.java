package parcial;

public class Jugador {
	
	private String nombre;
	private Eleccion eleccion;
	
	public Jugador(String nombre){
		
		this.nombre = nombre;
		eleccion = new Eleccion();
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Eleccion getEleccion() {
		return eleccion;
	}

	public void setEleccion(Figura f) {
		
		eleccion.setF(f);
	
		
	}
	
	

}
