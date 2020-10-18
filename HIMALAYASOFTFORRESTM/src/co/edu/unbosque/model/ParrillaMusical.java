package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;
import jaco.mp3.player.MP3Player;

public class ParrillaMusical {

	private ArrayList<PistaMusical> pistasMusicales;
	private MP3Player reproductorParrilla;
	private int contadorParrilla;

	public ParrillaMusical() {
		this.pistasMusicales = new ArrayList<PistaMusical>();
		this.reproductorParrilla = new MP3Player();
		this.reproductorParrilla.setRepeat(true);

	}

	/**
	 * @author Nicolas Peña Mogollón - Juana Valentina Torres
	 * 
	 *         Carga la información al arreglo de pistas musicales
	 * 
	 * @param pistas
	 */
	public void cargarParrilla(ArrayList<PistaMusical> pistas) {
		this.pistasMusicales = pistas;
	}

	/**
	 * @author Nicolas Peña Mogollón - Juana Valentina Torres
	 * 
	 *         agrega un objeto pistaMusical al arraylist pistasMusicales
	 * 
	 * @param pistaMusical
	 * 
	 */

	public void agregarPistaMusical(PistaMusical pistaMusical) {
		this.pistasMusicales.add(pistaMusical);
	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Borra todos los elementos del arreglo
	 */

	public void borrarParrilla() {
		this.pistasMusicales.clear();
	}

	/**
	 * @author Nicolas Peña Mogollón
	 * 
	 *         Añade los archivos .mp3 del arreglo a una playlist
	 * 
	 */

	public void generarPlayList() {
		for (int i = 0; i < this.pistasMusicales.size(); i++)
			reproductorParrilla.addToPlayList(
					new File("./Canciones/" + this.pistasMusicales.get(i).getNombreArchivoMusica().trim()));
	}

	/**
	 * @author Nicolas Peña Mogollón
	 * 
	 *         Añade un nuevo archivo .mp3 a la playlist
	 * 
	 * 
	 */

	public void agregarCancionPlayList() {
		this.reproductorParrilla.addToPlayList(new File("./Canciones/"
				+ this.pistasMusicales.get(this.pistasMusicales.size() - 1).getNombreArchivoMusica().trim()));
	}

	/**
	 * @author Nicolas Peña Mogollón
	 * 
	 *         Métodos de la libreria externa Jaco, sirven para limpiar la playlist,
	 *         reproducir, pausar, detener, avanzar a la siguiente canción y
	 *         retroceder a la canción anterior
	 * 
	 */

	public void borrarPlayList() {
		this.reproductorParrilla.getPlayList().clear();
	}

	public void reproducir() {
		try {
			this.reproductorParrilla.play();
		} catch (ArrayIndexOutOfBoundsException e) {
		}
	}

	public void pausar() {
		this.reproductorParrilla.pause();
	}

	public void parar() {
		this.reproductorParrilla.stop();
	}

	public void reproducirSiguiente() {
		this.reproductorParrilla.skipForward();
	}

	public void reproducirAnterior() {
		this.reproductorParrilla.skipBackward();
	}

	public ArrayList<PistaMusical> getPistasMusicales() {
		return pistasMusicales;
	}

	public void setPistasMusicales(ArrayList<PistaMusical> pistasMusicales) {
		this.pistasMusicales = pistasMusicales;
	}

	public MP3Player getReproductorParrilla() {
		return reproductorParrilla;
	}

	public void setReproductorParrilla(MP3Player reproductorParrilla) {
		this.reproductorParrilla = reproductorParrilla;
	}

	public int getContadorParrilla() {
		return contadorParrilla;
	}

	public void setContadorParrilla(int contadorParrilla) {
		this.contadorParrilla = contadorParrilla;
	}

}
