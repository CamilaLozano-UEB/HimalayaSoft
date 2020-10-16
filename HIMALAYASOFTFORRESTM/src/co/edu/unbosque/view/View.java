package co.edu.unbosque.view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelInformacion panelInformacion;
	private PanelEmisora panelEmisora;
	private JTabbedPane pestanas;

	public View() {
		panelInformacion = new PanelInformacion();
		panelEmisora = new PanelEmisora();
		pestanas = new JTabbedPane();
		pestanas = new JTabbedPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	public void agregarComponentes(String[] titulos) {
		pestanas.add(panelEmisora, titulos[0]);
		pestanas.add(panelInformacion, titulos[1]);
		getContentPane().add(pestanas);

	}

	public void actionListener(Controller control) {
		this.panelInformacion.getPanelAgregarCancion().getBotonAgregar().addActionListener(control);
		this.panelInformacion.getPanelAgregarCancion().getBotonCancelar().addActionListener(control);
		this.panelInformacion.getPanelInformacionEmisora().getBotonCancelar().addActionListener(control);
		this.panelInformacion.getPanelInformacionEmisora().getBotonGuardar().addActionListener(control);
		this.panelEmisora.getPanelParrilla().getBotonAgregar().addActionListener(control);
		this.panelEmisora.getPanelReproduccion().getBotonPlay().addActionListener(control);
		this.panelEmisora.getPanelReproduccion().getBotonPausa().addActionListener(control);

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
