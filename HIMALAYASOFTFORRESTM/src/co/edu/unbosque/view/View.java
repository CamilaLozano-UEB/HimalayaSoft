package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelInformacion panelInformacion;
	private PanelEmisora panelEmisora;
	private JTabbedPane pestanas;
	private final String icono = "./Imagenes/Play.png";

	public View(Controller control) {
		panelInformacion = new PanelInformacion();
		panelEmisora = new PanelEmisora();
		pestanas = new JTabbedPane();
		pestanas = new JTabbedPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.agregarComponentes();
		this.setIconImage(crearIcono(icono).getImage());
		this.actionListener(control);
	}
	
	public ImageIcon crearIcono(String ruta) {
		ImageIcon imagen = new ImageIcon(ruta);
		return imagen;
	}

	public void agregarComponentes() {
		pestanas.add(panelEmisora);
		pestanas.add(panelInformacion);
		getContentPane().add(pestanas);

	}

	public void actionListener(Controller control) {
		this.panelInformacion.getPanelAgregarCancion().getBotonAgregar().addActionListener(control);
		this.panelInformacion.getPanelAgregarCancion().getBotonCancelar().addActionListener(control);
		this.panelInformacion.getPanelInformacionEmisora().getBotonCancelar().addActionListener(control);
		this.panelInformacion.getPanelInformacionEmisora().getBotonGuardar().addActionListener(control);
		this.panelEmisora.getPanelParrilla().getBotonAgregar().addActionListener(control);
		this.panelEmisora.getPanelParrilla().getBotonBorrar().addActionListener(control);
		this.panelEmisora.getPanelReproduccion().getBotonPlay().addActionListener(control);
		this.panelEmisora.getPanelReproduccion().getBotonPausa().addActionListener(control);
		this.panelEmisora.getPanelReproduccion().getBotonStop().addActionListener(control);
		this.panelEmisora.getPanelReproduccion().getBotonRetrocede().addActionListener(control);
		this.panelEmisora.getPanelReproduccion().getBotonAvanza().addActionListener(control);

	}

	public void actualizarView(String[] titulos) {
		this.pestanas.setTitleAt(0, titulos[0]);
		this.pestanas.setTitleAt(1, titulos[1]);
	}

	public void mostrarMensajeError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Warning", JOptionPane.WARNING_MESSAGE);
	}

	public void mostrarMensajeAviso(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Information", JOptionPane.INFORMATION_MESSAGE);
	}

	public PanelInformacion getPanelInformacion() {
		return panelInformacion;
	}

	public void setPanelInformacion(PanelInformacion panelInformacion) {
		this.panelInformacion = panelInformacion;
	}

	public PanelEmisora getPanelEmisora() {
		return panelEmisora;
	}

	public void setPanelEmisora(PanelEmisora panelEmisora) {
		this.panelEmisora = panelEmisora;
	}

	public JTabbedPane getPestanas() {
		return pestanas;
	}

	public void setPestanas(JTabbedPane pestanas) {
		this.pestanas = pestanas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
