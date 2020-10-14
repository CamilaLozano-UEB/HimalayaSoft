package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.CaracteristicasEmisora;

public class Emisora {

	private Archivo archivo;
	private CaracteristicasEmisora caracteristicasEmisora;
	private ArrayList<PistaMusical> pistasMusicales;
	private ParrillaMusical parillaDelDia;
	private String nombreEmisora;
	private String modoTransmision;
	private String tipoDeMusica;
	private String titulosPanelDatosEmisora;
	private String titulosPanelParrilla;
	private String titulosPanelReproduccion;
	private String titulosPanelCancion;
	private String titulosPanelAgregarCancion;
	private String titulosPanelAjustarEmisora;
	private String titulosView;

	public Emisora() {
		this.archivo = new Archivo();
		this.caracteristicasEmisora = new CaracteristicasEmisora();
		this.pistasMusicales = new ArrayList<PistaMusical>();
		this.parillaDelDia = new ParrillaMusical();

	}

	/**
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez
	 * @param nombreEmisora
	 * @param modoTransmision
	 * @param tipoMusica     
	 * 
	 *  Toma los valores de
	 */
	public void asignarInformacionEmisora(String nombreEmisora, String modoTransmision, String tipoMusica) {

		this.nombreEmisora = nombreEmisora;
		this.modoTransmision = modoTransmision;
		this.tipoDeMusica = tipoMusica;
	}

	public void gestionarCaracteristicas() {

		// Falta definir estructura
		this.caracteristicasEmisora.leer();

	}

	/**
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *         Valentina Torres Parrado
	 * @param generoMusical
	 * @param nombreCancion
	 * @param nombreArtista
	 * @param nombreArchivoMusica 
	 * 
	 * Crea un objeto de la clase pista musical para
	 *                            añadirlo al arreglo y lo escribe en el archivo.
	 */
	public boolean agregarPistaMusical(String nombreCancion, String nombreArtista, String generoMusical,
			String nombreArchivoMusica) {

		PistaMusical obj = new PistaMusical();
		obj.setGeneroMusical(generoMusical);
		obj.setNombreCancion(nombreCancion);
		obj.setNombreArtista(nombreArtista);
		obj.setNombreArchivoMusica(nombreArchivoMusica);

		this.pistasMusicales.add(obj);
		if (this.escribirArchivoPistaMusical(nombreCancion, nombreArtista, generoMusical, nombreArchivoMusica))
			return true;
		else
			return false;

	}

	/**
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *         Valentina Torres Parrado
	 * 
	 *         Toma los valores de los atributos actuales y los actualiza en el
	 *         archivo de propiedades.
	 * @return
	 */
	public boolean escribirArchivoEmisora() {

		if (this.caracteristicasEmisora
				.escribir(this.nombreEmisora + "~" + this.modoTransmision + "~" + this.tipoDeMusica))
			return true;
		else
			return false;

	}

	/**
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *         Valentina Torres Parrado
	 * 
	 *         Toma los datos de la canción ingresada y los agrega al archivo
	 * @param nombreEmisora
	 * @param modoTransmision
	 * @param tipoMusica
	 * @return
	 */
	public boolean escribirArchivoPistaMusical(String nombreCancion, String nombreArtista, String generoMusical,
			String nombreArchivoMusica) {

		if (this.archivo
				.escribir(nombreCancion + "~" + nombreArtista + "~" + generoMusical + "~" + nombreArchivoMusica))
			return true;
		else
			return false;
	}

	public boolean escribirArchivoParillaDelDia() {
		return false;

	}

}
