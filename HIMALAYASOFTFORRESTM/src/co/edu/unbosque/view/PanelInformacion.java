package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInformacion extends JPanel {

	private static final long serialVersionUID = 1L;
	private final String RUTA_LOGO = "./Imagenes/Himalaya.jpg";
	private JPanel panelContEmisora;
	private JLabel etiquetaImagen;
	private PanelAgregarCancion panelAgregarCancion;
	private PanelInformacionEmisora panelInformacionEmisora;

	public PanelInformacion() {
		this.setLayout(new GridLayout(2, 1));
		panelContEmisora = new JPanel();
		panelContEmisora.setLayout(new BorderLayout());
		panelAgregarCancion = new PanelAgregarCancion();
		panelInformacionEmisora = new PanelInformacionEmisora();
		etiquetaImagen = new JLabel();
		etiquetaImagen.setIcon(new ImageIcon(RUTA_LOGO));
		panelContEmisora.add(etiquetaImagen, BorderLayout.WEST);
		panelContEmisora.add(panelInformacionEmisora, BorderLayout.CENTER);
		this.add(panelContEmisora);
		this.add(panelAgregarCancion);

	}

	public JPanel getPanelContEmisora() {
		return panelContEmisora;
	}

	public void setPanelContEmisora(JPanel panelContEmisora) {
		this.panelContEmisora = panelContEmisora;
	}

	public JLabel getEtiquetaImagen() {
		return etiquetaImagen;
	}

	public void setEtiquetaImagen(JLabel etiquetaImagen) {
		this.etiquetaImagen = etiquetaImagen;
	}

	public PanelAgregarCancion getPanelAgregarCancion() {
		return panelAgregarCancion;
	}

	public void setPanelAgregarCancion(PanelAgregarCancion panelAgregarCancion) {
		this.panelAgregarCancion = panelAgregarCancion;
	}

	public PanelInformacionEmisora getPanelInformacionEmisora() {
		return panelInformacionEmisora;
	}

	public void setPanelInformacionEmisora(PanelInformacionEmisora panelInformacionEmisora) {
		this.panelInformacionEmisora = panelInformacionEmisora;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRUTA_ICONO() {
		return RUTA_LOGO;
	}
	
}
