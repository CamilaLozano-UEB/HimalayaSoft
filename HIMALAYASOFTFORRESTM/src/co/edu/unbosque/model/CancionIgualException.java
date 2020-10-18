package co.edu.unbosque.model;

public class CancionIgualException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * @author Maria Camila Lozano
	 * 
	 * Creación de excepcion, cuando el nombre de la cancion es igual a otro que se esta guardando salta esta excepcion
	 * 
	 * @param mensaje
	 */

	public CancionIgualException(String mensaje) {
		super(mensaje);
	}

}
