package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInformacion extends JPanel {

	private static final long serialVersionUID = 1L;
	private final String RUTA_ICONO = "./Imagenes/Himalaya.jpg";
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
		// etiquetaImagen.setIcon(new ImageIcon(getClass().getResource(RUTA_ICONO)));
		panelContEmisora.add(etiquetaImagen, BorderLayout.WEST);
		panelContEmisora.add(panelInformacionEmisora, BorderLayout.CENTER);
		this.add(panelContEmisora);
		this.add(panelAgregarCancion);

	}

	public PanelAgregarCancion getPanelAgregarCancion() {
		return panelAgregarCancion;
	}

	public void setPanelAgregarCancion(PanelAgregarCancion panelAgregarCancion) {
		this.panelAgregarCancion = panelAgregarCancion;
	}

	public PanelInformacionEmisora getPanelAjustarEmisora() {
		return panelInformacionEmisora;
	}

	public void setPanelAjustarEmisora(PanelInformacionEmisora panelAjustarEmisora) {
		this.panelInformacionEmisora = panelAjustarEmisora;
	}

	public static void main(String[] args) {

		PanelInformacion panel = new PanelInformacion();

		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setVisible(true);
	}
}
