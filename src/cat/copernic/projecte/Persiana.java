package cat.copernic.projecte;

public class Persiana {
	String nombre;
	int estado;
	int tiempo;
	
	
	public Persiana(String nombre, int estado) {
		super();
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public Persiana() {
		super();
		this.estado = 5;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public int getTiempo() {
		return tiempo;
	}


	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}


	@Override
	public String toString() {
		return "Persiana [nombre=" + nombre + ", estado=" + estado
				+ ", tiempo=" + tiempo + "]";
	}
	
	
	
	public void CalcularEstado(int tiempo){
		estado=estado+tiempo;
		this.tiempo=0;
	}

}
