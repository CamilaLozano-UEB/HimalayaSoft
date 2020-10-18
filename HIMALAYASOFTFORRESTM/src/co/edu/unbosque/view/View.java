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
		this.setTitle("Emisora HimalyaSoft");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.agregarComponentes();
		this.setIconImage(crearIcono(icono).getImage());
		this.actionListener(control);
	}

	/**
	 * @author Carlos Ballen
	 * 
	 *         Asigna el icono de "play" al frame de la vista
	 * @param ruta
	 * @return
	 */

	public ImageIcon crearIcono(String ruta) {
		ImageIcon imagen = new ImageIcon(ruta);
		return imagen;
	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Añade los componentes al panel que corresponde, para luego añadirlos
	 *         al principal
	 */

	public void agregarComponentes() {
		pestanas.add(panelEmisora);
		pestanas.add(panelInformacion);
		getContentPane().add(pestanas);

	}

	/**
	 * @author Nicolás Peña Mogollón - Juana Valentina Torres Parrado
	 * 
	 *         Asigna un evento a cada boton
	 * @param control
	 */

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

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Toma la información del archivo properties y le da los valores a los
	 *         componentes con el idioma elegido
	 * @param titulos
	 */

	public void actualizarView(String[] titulos) {
		this.pestanas.setTitleAt(0, titulos[0]);
		this.pestanas.setTitleAt(1, titulos[1]);
	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Habilita los botones cuando ya se ha agregado la información
	 *         necesario
	 */

	public void habilitarBotones() {
		this.panelEmisora.getPanelParrilla().getBotonAgregar().setEnabled(true);
		this.panelEmisora.getPanelParrilla().getBotonBorrar().setEnabled(true);
		this.panelInformacion.getPanelAgregarCancion().getBotonAgregar().setEnabled(true);
		this.panelInformacion.getPanelAgregarCancion().getBotonCancelar().setEnabled(true);

	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Muestra un mensaje de error en JOptionPane
	 * @param mensaje
	 */

	public void mostrarMensajeError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Warning", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Muestra un mensaje de aviso en JOptionPane
	 * @param mensaje
	 */

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
