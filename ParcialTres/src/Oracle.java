
public class Oracle extends Conexion, implements OperacionesConexion {
	
	/*atributos de la clase oracle privados
	 */
	private  boolean  plsql;
	private  int  cantidadDeUsuariosPermitidos;
	
	
	private int peticiones_concurrentes = 1000;
	

	
	/*metodos constructores pedidos en el ejercicio
	 */
	
	public Oracle(String nombre, int puerto, String host, String usuario, String password, String tipo, boolean plsql,
			int cantidadDeUsuariosPermitidos) {
		super(nombre, puerto, host, usuario, password, tipo);
		this.plsql = plsql;
		this.cantidadDeUsuariosPermitidos = cantidadDeUsuariosPermitidos;
	}

	
	
	public Oracle(String nombre, int puerto, String host, String usuario, String password, String tipo) {
		super(nombre, puerto, host, usuario, password, tipo);
	}

	/*getter y setter pedidos en el ejercicio
	 */

	public boolean isPlsql() {
		return plsql;
	}
	public void setPlsql(boolean plsql) {
		this.plsql = plsql;
	}
	public int getCantidadDeUsuariosPermitidos() {
		return cantidadDeUsuariosPermitidos;
	}
	public void setCantidadDeUsuariosPermitidos(int cantidadDeUsuariosPermitidos) {
		this.cantidadDeUsuariosPermitidos = cantidadDeUsuariosPermitidos;
	}
	

	

	
	
	
	

}
