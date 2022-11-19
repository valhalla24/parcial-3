
public class Microsoft extends Conexion, implements OperacionesConexion  {
	
	/*atributos de la clase microsoft privados
	 */
	private boolean isCloud;
	private String lenguajeConsultaOrrm;
	
	
	private int peticiones_concurrentes = 1500;
	
	
	public boolean isCloud() {
		return isCloud;
	}
	public void setCloud(boolean isCloud) {
		this.isCloud = isCloud;
	}
	public String getLenguajeConsultaOrrm() {
		return lenguajeConsultaOrrm;
	}
	public void setLenguajeConsultaOrrm(String lenguajeConsultaOrrm) {
		this.lenguajeConsultaOrrm = lenguajeConsultaOrrm;
	}
	
	
	public Microsoft() {
	}
	
	public Microsoft(boolean isCloud, String lenguajeConsultaOrrm) {
		this.isCloud = isCloud;
		this.lenguajeConsultaOrrm = lenguajeConsultaOrrm;
	}
	
	
	public String conexion() {
		return 
	}
	
	
	
	
	
	

}
