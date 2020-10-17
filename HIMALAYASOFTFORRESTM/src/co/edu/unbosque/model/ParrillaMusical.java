package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;
import jaco.mp3.player.MP3Player;

public class ParrillaMusical {

	private ArrayList<PistaMusical> pistasMusicales;
	private MP3Player reproductorParrilla;

	public ParrillaMusical() {
		this.pistasMusicales = new ArrayList<PistaMusical>();
		this.reproductorParrilla = new MP3Player();
		this.reproductorParrilla.setRepeat(true);

	}

	public void cargarParrilla(ArrayList<PistaMusical> pistas) {
		this.pistasMusicales = pistas;
	}

	public void agregarPistaMusical(PistaMusical pistaMusical) {
		this.pistasMusicales.add(pistaMusical);
	}

	public void generarPlayList() {
		for (int i = 0; i < this.pistasMusicales.size(); i++)
			reproductorParrilla.addToPlayList(
					new File("./Canciones/" + this.pistasMusicales.get(i).getNombreArchivoMusica().trim()));
	}

	public void borrarPlayList() {
		this.reproductorParrilla.getPlayList().clear();
	}

	public void reproducir() {
		this.reproductorParrilla.play();
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

	public void borrarParrilla() {
		this.pistasMusicales.clear();
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

}
