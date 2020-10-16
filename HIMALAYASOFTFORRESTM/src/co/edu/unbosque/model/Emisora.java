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
	private String idioma;
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
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez
	 * 
	 *         Toma los valores de emisora, modoTransmision y tipoMusica
	 * @param nombreEmisora
	 * @param modoTransmision
	 * @param tipoMusica
	 */
	public void asignarInformacionEmisora(String nombreEmisora, String modoTransmision, String tipoMusica,
			String idioma) {

		this.nombreEmisora = nombreEmisora;
		this.modoTransmision = modoTransmision;
		this.tipoDeMusica = tipoMusica;
		this.idioma = idioma;
	}

	/**
	 * @author Carlos Ballen
	 * 
	 *         Lee los valores del archivo properties y los asigna a las variables.
	 * 
	 */
	public void gestionarCaracteristicas() {

		try {
			this.nombreEmisora = this.caracteristicasEmisora.leer("nombreEmisora",
					this.caracteristicasEmisora.getArchivoConfiguracion());
			this.modoTransmision = this.caracteristicasEmisora.leer("modoTransmision",
					this.caracteristicasEmisora.getArchivoConfiguracion());
			this.tipoDeMusica = this.caracteristicasEmisora.leer("tipoMusica",
					this.caracteristicasEmisora.getArchivoConfiguracion());
			this.idioma = this.caracteristicasEmisora.leer("idioma",
					this.caracteristicasEmisora.getArchivoConfiguracion());
			this.titulosPanelDatosEmisora = this.caracteristicasEmisora.leer("titulosPanelDatosEmisora").split("~");
			this.titulosPanelParrilla = this.caracteristicasEmisora.leer("titulosPanelParrilla").split("~");
			this.titulosPanelCancion = this.caracteristicasEmisora.leer("titulosPanelCancion").split("~");
			this.titulosPanelAgregarCancion = this.caracteristicasEmisora.leer("titulosPanelAgregarCancion").split("~");
			this.titulosPanelInformacionEmisora = this.caracteristicasEmisora.leer("titulosPanelInformacionEmisora")
					.split("~");
			this.titulosView = this.caracteristicasEmisora.leer("titulosView").split("~");
		} catch (Exception e) {
			// TODO: handle exception
			escribirArchivoEmisora("");
			gestionarCaracteristicas();
		}

	}

	/**
	 * @author Nicolás Peña Mogollón - María Camila Lozano Gutierrez - Juana
	 *         Valentina Torres Parrado
	 * 
	 *         Crea un objeto de la clase pista musical para a�adirlo al arreglo y
	 *         lo escribe en el archivo.
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
		obj.setNombreAutor(nombreArtista);
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

		if (this.caracteristicasEmisora.escribir(
				this.nombreEmisora + "~" + this.modoTransmision + "~" + this.tipoDeMusica + "~" + this.idioma))
			return true;
		else
			return false;

	}

	/**
	 * @author Carlos Ballen
	 * 
	 * @param String s para inicializar archivo Configuracion.
	 * 
	 */
	public boolean escribirArchivoEmisora(String s) {

		if (this.caracteristicasEmisora.escribir(s + "~" + s + "~" + s + "~" + "ES"))
			return true;
		else
			return false;

	}

	public void cargarAtributosArchivoPistas() {

		String[] pistas = this.archivo.leer(this.archivo.getRUTA_CANCIONES()).split("\n");
		for (int i = 0; i < pistas.length; i++) {
			String[] atributo = pistas[i].split("~");
			PistaMusical obj = new PistaMusical();
			obj.setNombreCancion(atributo[0]);
			obj.setNombreAutor(atributo[1]);
			obj.setGeneroMusical(atributo[2]);
			obj.setNombreArchivoMusica(atributo[3]);
			this.pistasMusicales.add(obj);
		}
	}

	/**
	 * @author Nicolás Peña Mogollón - Carlos Ballen
	 * 
	 *         Toma los datos de los arreglos para cargar la información a un String
	 *         bidimensional que tendrá los datos a mostrar en vista
	 * 
	 * @return
	 */
	public String[][] asignarDatosTabla() {

		String[][] tabla = new String[this.pistasMusicales.size()][3];

		for (int i = 0; i < this.pistasMusicales.size(); i++) {
			tabla[i][0] = this.pistasMusicales.get(i).getNombreCancion();
			tabla[i][1] = this.pistasMusicales.get(i).getNombreAutor();
			tabla[i][2] = this.pistasMusicales.get(i).getGeneroMusical();
		}
		return tabla;
	}

	public void verificarExtensionArchivo(String rutaArchivo) throws ExtensionIncorrectaException {
		String mimeType = rutaArchivo.substring(rutaArchivo.lastIndexOf(".") + 1, rutaArchivo.length());
		System.out.println(mimeType);
		if (!mimeType.contains("mp3")) {
			throw new ExtensionIncorrectaException("");
		}

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

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
