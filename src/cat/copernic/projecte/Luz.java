package cat.copernic.projecte;

public class Luz {

	private String nombre;
	private boolean estado;
	public Luz(String nombre, boolean estado) {
		super();
		this.nombre = nombre;
		this.estado = estado;
	}
	public Luz() {
		this.estado = false;	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Luz [nombre=" + nombre + ", estado=" + estado + "]";
	}
	
	
	
	
}
