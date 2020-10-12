package co.edu.unbosque.view;

import javax.swing.JPanel;

public class PanelEmisora extends JPanel {

	private static final long serialVersionUID = 1L;
	private PanelCancion panelCancion;
	private PanelDatosEmisora panelDatosEmisora;
	private PanelParrilla panelParrilla;
	private PanelReproduccion panelReproduccion;

	public PanelEmisora() {

		panelCancion = new PanelCancion();
		panelDatosEmisora = new PanelDatosEmisora();
		panelParrilla = new PanelParrilla();
		panelReproduccion = new PanelReproduccion();
	}

	public PanelCancion getPanelCancion() {
		return panelCancion;
	}

	public void setPanelCancion(PanelCancion panelCancion) {
		this.panelCancion = panelCancion;
	}

	public PanelDatosEmisora getPanelDatosEmisora() {
		return panelDatosEmisora;
	}

	public void setPanelDatosEmisora(PanelDatosEmisora panelDatosEmisora) {
		this.panelDatosEmisora = panelDatosEmisora;
	}

	public PanelParrilla getPanelParrilla() {
		return panelParrilla;
	}

	public void setPanelParrilla(PanelParrilla panelParrilla) {
		this.panelParrilla = panelParrilla;
	}

	public PanelReproduccion getPanelReproduccion() {
		return panelReproduccion;
	}

	public void setPanelReproduccion(PanelReproduccion panelReproduccion) {
		this.panelReproduccion = panelReproduccion;
	}

}
