package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo extends Persistence {

	private final String RUTA_CANCIONES = "./Data/Pistas.txt";
	private final String RUTA_PARRILLA = "./Data/Parrilla.txt";

	/**
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *         Valentina Torres Parrado
	 * 
	 *         Toma los datos de la canción ingresada y lo escribe en el archivo
	 */
	@Override
	public boolean escribir(String dato) {
		// TODO Auto-generated method stub

		File f = new File(this.RUTA_CANCIONES);
		try {
			FileWriter fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.print(dato);
			fw.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	/**
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *         Valentina Torres Parrado
	 * 
	 *         Recibe los datos de la parrilla de reproducción en forma de arreglo
	 *         para luego organizarla y guardarla en el archivo
	 * @param datos
	 * @return
	 */
	public boolean escribir(String[] datos) {

		String linea = datos[0] + "~" + datos[1] + "~" + datos[2];
		File f = new File(this.RUTA_PARRILLA);

		try {
			FileWriter fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.print(linea);
			fw.close();
		} catch (IOException e) {
			return false;
		}

		return true;
	}

	/**
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *         Valentina Torres Parrado
	 * 
	 *         Lee el archivo de las canciones y retorna un String con la
	 *         información separada por caracteres específicos
	 */
	@Override
	public String leer(String dato) {
		// TODO Auto-generated method stub
		String linea = "";
		String data = "";
		File f = new File(dato);

		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();

			while (linea != null) {
				data += linea + "\n";
				linea = br.readLine();
			}
			br.close();

		} catch (IOException e) {
			return null;
		}
		return data;
	}

	/**
	 * @author Nicolás Peña Mogollón - Mar�a Camila Lozano Gutierrez - Juana
	 *         Valentina Torres Parrado
	 * 
	 *         Lee el archivo de la parrilla de reproducci�n y retorna un arreglo de
	 *         tipo String con los valores de cada pista musical que tiene
	 * @return
	 */
	public String[] leerArchivo(String dato) {

		String[] data = new String[this.contarLineas(dato)];
		String linea = "";
		int i = 0;
		File f = new File(dato);
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			linea = br.readLine();
			while (linea != null && i < this.contarLineas(dato)) {
				data[i] = linea;
				linea = br.readLine();
			}
			br.close();

		} catch (IOException e) {
			return null;
		}
		return data;
	}

	/**
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *         Valentina Torres Parrado
	 * 
	 *         Cuenta el número de líneas que tiene el archivo retornando ese valor.
	 * @return
	 */
	public int contarLineas(String dato) {
		String linea = "";
		int cont = 0;

		File f = new File(dato);
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			linea = br.readLine();
			while (linea != null) {
				linea = br.readLine();
				cont++;
			}
			br.close();

		} catch (IOException e) {
			return 0;
		}
		return cont;

	}

	public String getRUTA_CANCIONES() {
		return RUTA_CANCIONES;
	}

	public String getRUTA_PARRILLA() {
		return RUTA_PARRILLA;
	}

}
