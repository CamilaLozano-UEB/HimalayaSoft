package co.edu.unbosque.view;

import javax.swing.JPanel;

public class PanelInformacion extends JPanel {

	private static final long serialVersionUID = 1L;
	private PanelAgregarCancion panelAgregarCancion;
	private PanelAjustarEmisora panelAjustarEmisora;

	public PanelInformacion() {
		panelAgregarCancion = new PanelAgregarCancion();
		panelAjustarEmisora = new PanelAjustarEmisora();

	}

	public PanelAgregarCancion getPanelAgregarCancion() {
		return panelAgregarCancion;
	}

	public void setPanelAgregarCancion(PanelAgregarCancion panelAgregarCancion) {
		this.panelAgregarCancion = panelAgregarCancion;
	}

	public PanelAjustarEmisora getPanelAjustarEmisora() {
		return panelAjustarEmisora;
	}

	public void setPanelAjustarEmisora(PanelAjustarEmisora panelAjustarEmisora) {
		this.panelAjustarEmisora = panelAjustarEmisora;
	}

}
