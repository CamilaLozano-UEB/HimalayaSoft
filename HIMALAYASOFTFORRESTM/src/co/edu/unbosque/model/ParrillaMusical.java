package co.edu.unbosque.model;

import java.util.ArrayList;

public class ParrillaMusical {

	private ArrayList<PistaMusical> pistasMusicales;

	public ParrillaMusical() {
		pistasMusicales = new ArrayList<PistaMusical>();
	}

	public void cargarParrilla(ArrayList<PistaMusical> pistas) {
		this.pistasMusicales = pistas;
	}

	public void agregarPistaMusical(PistaMusical pistaMusical) {
		this.pistasMusicales.add(pistaMusical);
	}

	public String[] generarListaRutas() {
		String[] rutas = new String[this.pistasMusicales.size()];
		for (int i = 0; i < this.pistasMusicales.size(); i++) {
			rutas[i] = this.pistasMusicales.get(i).getNombreArchivoMusica();
		}
		return rutas;
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

}
