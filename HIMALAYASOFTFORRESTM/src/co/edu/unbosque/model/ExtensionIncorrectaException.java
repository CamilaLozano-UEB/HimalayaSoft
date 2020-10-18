package co.edu.unbosque.model;

public class ExtensionIncorrectaException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * @author Maria Camila Lozano
	 * 
	 *         Creación de excepcion, cuando agrega un archivo que no tiene la
	 *         extension correcta, salta esta excepcion
	 * 
	 * @param mensaje
	 */

	public ExtensionIncorrectaException(String mensaje) {
		super(mensaje);
	}

}
