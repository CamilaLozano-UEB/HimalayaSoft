package co.edu.unbosque.view;

import javax.swing.JPanel;

public class PanelInformacion extends JPanel {

	private static final long serialVersionUID = 1L;
	private PanelAgregarCancion panelAgregarCancion;
	private PanelInformacionEmisora panelInformacionEmisora;

	public PanelInformacion() {
		panelAgregarCancion = new PanelAgregarCancion();
		panelInformacionEmisora = new PanelInformacionEmisora();

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

}
