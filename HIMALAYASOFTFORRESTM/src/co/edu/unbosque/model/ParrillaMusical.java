package co.edu.unbosque.model;

import java.util.ArrayList;

import javazoom.jlgui.basicplayer.BasicPlayer;

public class ParrillaMusical {

	private ArrayList<PistaMusical> pistasMusicales;
	private BasicPlayer player;

	public ParrillaMusical() {

	}

	public void agregarPistaMusical(PistaMusical pistaMusical) {

		this.pistasMusicales.add(pistaMusical);
	}

	public void reproducirParrilla() {
		// Pienso, luego existo
	}

	public void pausarParrilla() {
		// Pienso, luego existo
	}

	public ArrayList<PistaMusical> getPistasMusicales() {
		return pistasMusicales;
	}

	public void setPistasMusicales(ArrayList<PistaMusical> pistasMusicales) {
		this.pistasMusicales = pistasMusicales;
	}

	public BasicPlayer getPlayer() {
		return player;
	}

	public void setPlayer(BasicPlayer player) {
		this.player = player;
	}

}
