package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEmisora extends JPanel {

	private static final long serialVersionUID = 1L;
	private final String RUTA_ICONO = "./Imagenes/HimalayaPanelEmi.png";
	private PanelCancion panelCancion;
	private PanelDatosEmisora panelDatosEmisora;
	private PanelParrilla panelParrilla;
	private PanelReproduccion panelReproduccion;
	private JLabel etiquetaImagen;

	public PanelEmisora() {
		setLayout(new BorderLayout());

		panelCancion = new PanelCancion();
		panelDatosEmisora = new PanelDatosEmisora();
		panelParrilla = new PanelParrilla();
		panelReproduccion = new PanelReproduccion();

		etiquetaImagen = new JLabel();
		etiquetaImagen.setIcon(new ImageIcon(RUTA_ICONO));
		this.agregarComponentes();

	}

	public void agregarComponentes() {
		add(etiquetaImagen, BorderLayout.PAGE_START);
		add(panelParrilla, BorderLayout.CENTER);
		add(panelDatosEmisora, BorderLayout.WEST);
		add(panelReproduccion, BorderLayout.PAGE_END);
		add(panelCancion, BorderLayout.EAST);
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

	public String getRUTA_ICONO() {
		return RUTA_ICONO;
	}
	
}
