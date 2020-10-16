package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jl.decoder.JavaLayerUtils;
public class ParrillaMusical {

	private ArrayList<PistaMusical> pistasMusicales;
	private BasicPlayer player;
	JavaLayerUtils a;
	

	public ParrillaMusical() {
		pistasMusicales = new ArrayList<PistaMusical>();
		player = new BasicPlayer();
	}

	public void cargarParrilla(ArrayList<PistaMusical> pistas) {
		this.pistasMusicales = pistas;
	}

	public void agregarPistaMusical(PistaMusical pistaMusical) {
		this.pistasMusicales.add(pistaMusical);
	}

	
	
	
	public void reproducirParrilla() throws BasicPlayerException {
		for (int i = 0; i < pistasMusicales.size(); i++) {
			File file= new File(pistasMusicales.get(i).getNombreArchivoMusica());
			player.open(file);
			player.play();
			System.out.println("sadffaf");
			System.out.println(player.getGainValue());
			do {

			}while(player.getStatus()==player.PLAYING);
		}
	
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
