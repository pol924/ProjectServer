package cat.copernic.projecte;

public class Temperatura {
	private boolean estadoAire;	
	private boolean estadoCalefaccion;
	
	private int tempcalefaccion;
	private int tempAire;
	public Temperatura(boolean estadoAire, boolean estadoCalefaccion,
			int tempcalefaccion, int tempAire) {
		super();
		this.estadoAire = estadoAire;
		this.estadoCalefaccion = estadoCalefaccion;
		this.tempcalefaccion = tempcalefaccion;
		this.tempAire = tempAire;
	}
	public Temperatura() {
		this.estadoAire = false;
		this.estadoCalefaccion = false;
		this.tempcalefaccion = 20;
		this.tempAire = 20;
	}
	public boolean isEstadoAire() {
		return estadoAire;
	}
	public void setEstadoAire(boolean estadoAire) {
		this.estadoAire = estadoAire;
	}
	public boolean isEstadoCalefaccion() {
		return estadoCalefaccion;
	}
	public void setEstadoCalefaccion(boolean estadoCalefaccion) {
		this.estadoCalefaccion = estadoCalefaccion;
	}
	public int getTempcalefaccion() {
		return tempcalefaccion;
	}
	public void setTempcalefaccion(int tempcalefaccion) {
		this.tempcalefaccion = tempcalefaccion;
	}
	public int getTempAire() {
		return tempAire;
	}
	public void setTempAire(int tempAire) {
		this.tempAire = tempAire;
	}
	@Override
	public String toString() {
		return "Temperatura [estadoAire=" + estadoAire + ", estadoCalefaccion="
				+ estadoCalefaccion + ", tempcalefaccion=" + tempcalefaccion
				+ ", tempAire=" + tempAire + "]";
	}
	
	
}
