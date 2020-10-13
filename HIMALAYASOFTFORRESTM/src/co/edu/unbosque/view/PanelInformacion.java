package co.edu.unbosque.view;

import javax.swing.JPanel;

public class PanelInformacion extends JPanel {

	private static final long serialVersionUID = 1L;
	private PanelAgregarCancion panelAgregarCancion;
	private PanelInformacionEmisora panelAjustarEmisora;

	public PanelInformacion() {
		panelAgregarCancion = new PanelAgregarCancion();
		panelAjustarEmisora = new PanelInformacionEmisora();

	}

	public PanelAgregarCancion getPanelAgregarCancion() {
		return panelAgregarCancion;
	}

	public void setPanelAgregarCancion(PanelAgregarCancion panelAgregarCancion) {
		this.panelAgregarCancion = panelAgregarCancion;
	}

	public PanelInformacionEmisora getPanelAjustarEmisora() {
		return panelAjustarEmisora;
	}

	public void setPanelAjustarEmisora(PanelInformacionEmisora panelAjustarEmisora) {
		this.panelAjustarEmisora = panelAjustarEmisora;
	}

}
