package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.CaracteristicaEmisora;

public class Emisora {

	private Archivo archivo;
	private CaracteristicaEmisora caracteristicasEmisora;
	private ArrayList<PistaMusical> pistasMusicales;
	private ParrillaMusical parillaDelDia;
	private String nombreEmisora;
	private String modoTransmision;
	private String tipoDeMusica;
	private String[] titulosPanelDatosEmisora;
	private String[] titulosPanelParrilla;
	private String[] titulosPanelCancion;
	private String[] titulosPanelAgregarCancion;
	private String[] titulosPanelInformacionEmisora;
	private String[] titulosView;

	public Emisora() {
		this.archivo = new Archivo();
		this.caracteristicasEmisora = new CaracteristicaEmisora();
		this.pistasMusicales = new ArrayList<PistaMusical>();
		this.parillaDelDia = new ParrillaMusical();

	}

	/**
	 * @authorNicolás Peña Mogollón - María Camila Lozano Gutierrez
	 * 
	 *                Toma los valores de emisora, modoTransmision y tipoMusica
	 * @param nombreEmisora
	 * @param modoTransmision
	 * @param tipoMusica
	 */
	public void asignarInformacionEmisora(String nombreEmisora, String modoTransmision, String tipoMusica) {

		this.nombreEmisora = nombreEmisora;
		this.modoTransmision = modoTransmision;
		this.tipoDeMusica = tipoMusica;
	}

	/**
	 * @author Carlos Ballen
	 * 
	 *         Lee los valores del archivo properties y los asigna a las variables.
	 * 
	 */
	public void gestionarCaracteristicas() {

		this.nombreEmisora = this.caracteristicasEmisora.leer("nombreEmisora");
		this.modoTransmision = this.caracteristicasEmisora.leer("modoTransmision");
		this.tipoDeMusica = this.caracteristicasEmisora.leer("tipoMusica");
		this.titulosPanelDatosEmisora = this.caracteristicasEmisora.leer("titulosPanelDatosEmisora").split("~");
		this.titulosPanelParrilla = this.caracteristicasEmisora.leer("titulosPanelParrilla").split("~");
		this.titulosPanelCancion = this.caracteristicasEmisora.leer("titulosPanelCancion").split("~");
		this.titulosPanelAgregarCancion = this.caracteristicasEmisora.leer("titulosPanelAgregarCancion").split("~");
		this.titulosPanelInformacionEmisora = this.caracteristicasEmisora.leer("titulosPanelInformacionEmisora")
				.split("~");
		this.titulosView = this.caracteristicasEmisora.leer("titulosView").split("~");

	}

	/**
	 * @authorNicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *                Valentina Torres Parrado
	 * 
	 *                Crea un objeto de la clase pista musical para a�adirlo al
	 *                arreglo y lo escribe en el archivo.
	 * @param generoMusical
	 * @param nombreCancion
	 * @param nombreArtista
	 * @param nombreArchivoMusica
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
	 * @authorNicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *                Valentina Torres Parrado
	 * 
	 *                Toma los valores de los atributos actuales y los actualiza en
	 *                el archivo de propiedades.
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
	 * @authorNicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *                Valentina Torres Parrado
	 * 
	 *                Toma los datos de la canción ingresada y los agrega al archivo
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

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

	public CaracteristicaEmisora getCaracteristicasEmisora() {
		return caracteristicasEmisora;
	}

	public void setCaracteristicasEmisora(CaracteristicaEmisora caracteristicasEmisora) {
		this.caracteristicasEmisora = caracteristicasEmisora;
	}

	public ArrayList<PistaMusical> getPistasMusicales() {
		return pistasMusicales;
	}

	public void setPistasMusicales(ArrayList<PistaMusical> pistasMusicales) {
		this.pistasMusicales = pistasMusicales;
	}

	public ParrillaMusical getParillaDelDia() {
		return parillaDelDia;
	}

	public void setParillaDelDia(ParrillaMusical parillaDelDia) {
		this.parillaDelDia = parillaDelDia;
	}

	public String getNombreEmisora() {
		return nombreEmisora;
	}

	public void setNombreEmisora(String nombreEmisora) {
		this.nombreEmisora = nombreEmisora;
	}

	public String getModoTransmision() {
		return modoTransmision;
	}

	public void setModoTransmision(String modoTransmision) {
		this.modoTransmision = modoTransmision;
	}

	public String getTipoDeMusica() {
		return tipoDeMusica;
	}

	public void setTipoDeMusica(String tipoDeMusica) {
		this.tipoDeMusica = tipoDeMusica;
	}

	public String[] getTitulosPanelDatosEmisora() {
		return titulosPanelDatosEmisora;
	}

	public void setTitulosPanelDatosEmisora(String[] titulosPanelDatosEmisora) {
		this.titulosPanelDatosEmisora = titulosPanelDatosEmisora;
	}

	public String[] getTitulosPanelParrilla() {
		return titulosPanelParrilla;
	}

	public void setTitulosPanelParrilla(String[] titulosPanelParrilla) {
		this.titulosPanelParrilla = titulosPanelParrilla;
	}

	public String[] getTitulosPanelCancion() {
		return titulosPanelCancion;
	}

	public void setTitulosPanelCancion(String[] titulosPanelCancion) {
		this.titulosPanelCancion = titulosPanelCancion;
	}

	public String[] getTitulosPanelAgregarCancion() {
		return titulosPanelAgregarCancion;
	}

	public void setTitulosPanelAgregarCancion(String[] titulosPanelAgregarCancion) {
		this.titulosPanelAgregarCancion = titulosPanelAgregarCancion;
	}

	public String[] getTitulosPanelInformacionEmisora() {
		return titulosPanelInformacionEmisora;
	}

	public void setTitulosPanelInformacionEmisora(String[] titulosPanelInformacionEmisora) {
		this.titulosPanelInformacionEmisora = titulosPanelInformacionEmisora;
	}

	public String[] getTitulosView() {
		return titulosView;
	}

	public void setTitulosView(String[] titulosView) {
		this.titulosView = titulosView;
	}

}
