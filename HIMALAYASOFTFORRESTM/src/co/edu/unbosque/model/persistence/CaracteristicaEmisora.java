package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CaracteristicaEmisora extends Persistence {

	private final String RUTA_CARACTERISTICAS = "./Data/Caracteristicas.properties";
	private Properties prop;

	public CaracteristicaEmisora() {
		// TODO Auto-generated constructor stub
		prop = new Properties();
	}

	/**
	 * @author Nicol�s Pe�a Mogoll�n - Mar�a Camila Lozano Gutierrez - Juana
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

	
	/**
	 * @author Carlos Ballen
	 * @param String dato a leer     
	 * 
	 *  Lee el valor pedido de dato del archivo properties.
	 */
	@Override
	public String leer(String dato) {
		// TODO Auto-generated method stub
		// Se definen en la construcci�n de la vista
		String linea="";
		
		try {
			prop.load(new FileInputStream(RUTA_CARACTERISTICAS));
			linea=prop.getProperty(dato);
		}
		catch(IOException e) {
			return null;
		}
		return linea;
	
	}

}
