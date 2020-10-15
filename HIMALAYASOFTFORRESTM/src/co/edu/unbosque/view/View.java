package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelInformacion panelInformacion;
	private PanelEmisora panelEmisora;
	private JTabbedPane pesta�as;

	public View(Controller control) {
		panelInformacion = new PanelInformacion();
		panelEmisora = new PanelEmisora();
		pesta�as = new JTabbedPane();
		pesta�as.add(panelEmisora, "Inicio");
		pesta�as.add(panelInformacion, "Gestion de informaci�n");
		getContentPane().add(pesta�as);
	}

	public PanelEmisora getPanelEmisora() {
		return panelEmisora;
	}

	public void setPanelEmisora(PanelEmisora panelEmisora) {
		this.panelEmisora = panelEmisora;
	}

	public PanelInformacion getPanelInformacion() {
		return panelInformacion;
	}

	public void setPanelInformacion(PanelInformacion panelInformacion) {
		this.panelInformacion = panelInformacion;
	}

}
