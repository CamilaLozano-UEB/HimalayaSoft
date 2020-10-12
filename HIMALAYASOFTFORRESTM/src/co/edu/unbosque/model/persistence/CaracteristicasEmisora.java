package co.edu.unbosque.model.persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CaracteristicasEmisora extends Persistence {

	private final String RUTA_CARACTERISTICAS = "./Data/Caracteristicas.properties";
	private Properties prop;

	public CaracteristicasEmisora() {
		// TODO Auto-generated constructor stub
		prop = new Properties();
	}

	/**
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *         Valentina Torres Parrado
	 * 
	 *         Recibe los datos de la emisora y los guarda en el archivo de
	 *         propiedades.
	 */
	@Override
	public boolean escribir(String dato) {
		// TODO Auto-generated method stub

		String[] listaDatos = dato.split("~");
		try {
			prop.setProperty("nombreEmisora", listaDatos[0]);
			prop.setProperty("modoTransmision", listaDatos[1]);
			prop.setProperty("tipoMusica", listaDatos[2]);
			prop.store(new FileOutputStream(RUTA_CARACTERISTICAS), null);
		} catch (IOException ex) {
			return false;
		}
		return true;
	}

	@Override
	public String leer() {
		// TODO Auto-generated method stub
		// Se definen en la construcción de la vista
		return null;
	}

}
