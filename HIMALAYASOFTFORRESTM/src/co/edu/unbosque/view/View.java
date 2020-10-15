package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelInformacion panelInformacion;
	private PanelEmisora panelEmisora;
	private JTabbedPane pestañas;

	public View(Controller control) {
		panelInformacion = new PanelInformacion();
		panelEmisora = new PanelEmisora();
		pestañas = new JTabbedPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void agregarComponentes(String[] titulos) {
		pestañas.add(panelEmisora, titulos[0]);
		pestañas.add(panelInformacion, titulos[1]);
		getContentPane().add(pestañas);

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
