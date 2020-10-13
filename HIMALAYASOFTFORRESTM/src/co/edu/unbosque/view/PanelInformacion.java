package co.edu.unbosque.view;

import javax.swing.JPanel;

public class PanelInformacion extends JPanel {

	private static final long serialVersionUID = 1L;
	private PanelAgregarCanciones panelAgregarCancion;
	private PanelInformacionEmisora panelAjustarEmisora;

	public PanelInformacion() {
		panelAgregarCancion = new PanelAgregarCanciones();
		panelAjustarEmisora = new PanelInformacionEmisora();

	}

	public PanelAgregarCanciones getPanelAgregarCancion() {
		return panelAgregarCancion;
	}

	public void setPanelAgregarCancion(PanelAgregarCanciones panelAgregarCancion) {
		this.panelAgregarCancion = panelAgregarCancion;
	}

	public PanelInformacionEmisora getPanelAjustarEmisora() {
		return panelAjustarEmisora;
	}

	public void setPanelAjustarEmisora(PanelInformacionEmisora panelAjustarEmisora) {
		this.panelAjustarEmisora = panelAjustarEmisora;
	}

}
