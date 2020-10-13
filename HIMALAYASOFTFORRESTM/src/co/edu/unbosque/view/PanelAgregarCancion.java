
package co.edu.unbosque.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelAgregarCancion extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel etiquetaNombreCancion;
	private JLabel etiquetaNombreAutor;
	private JLabel etiquetaGeneroMusica;
	private JLabel etiquetaArchivo;
	private JTextField campoTextoNombreCancion;
	private JTextField campoTextoNombreAutor;
	private JTextField campoTextoGeneroMusica;
	private JTextArea campoTextoArchivo;
	private JTable tablaCanciones;
	private JScrollPane scroll;
	private JButton botonAgregar;
	private JButton botonCancelar;
	private JPanel panelRegistro;

	public PanelAgregarCancion() {
		this.setLayout(new GridLayout(1, 2));
	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Recibe como entrada los valores que corresponden a cada componente
	 *         (lo que dice)
	 * @param titulos
	 */
	public void asignarValores(String[] titulos) {

		panelRegistro = new JPanel();
		panelRegistro.setLayout(new GridLayout(5, 2));

		etiquetaNombreCancion = new JLabel(titulos[0]);
		etiquetaNombreAutor = new JLabel(titulos[1]);
		etiquetaGeneroMusica = new JLabel(titulos[2]);
		etiquetaArchivo = new JLabel(titulos[3]);

		campoTextoNombreCancion = new JTextField();
		campoTextoNombreAutor = new JTextField();
		campoTextoGeneroMusica = new JTextField();
		campoTextoArchivo = new JTextArea();

		botonAgregar = new JButton(titulos[4]);
		botonCancelar = new JButton(titulos[5]);
	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Añade los componentes al panel que corresponde, para luego añadirlos
	 *         al principal
	 */
	public void agregarComponentes() {

		panelRegistro.add(etiquetaNombreCancion);
		panelRegistro.add(campoTextoNombreCancion);
		panelRegistro.add(etiquetaNombreAutor);
		panelRegistro.add(campoTextoNombreAutor);
		panelRegistro.add(etiquetaGeneroMusica);
		panelRegistro.add(campoTextoGeneroMusica);
		panelRegistro.add(etiquetaArchivo);
		panelRegistro.add(campoTextoArchivo);
		panelRegistro.add(botonAgregar);
		panelRegistro.add(botonCancelar);
		this.add(scroll);
		this.add(panelRegistro);

	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Recibe los datos de la tabla en forma de arreglo bidimensional para
	 *         agregarlos a la tabla
	 * @param datos
	 */
	public void crearTabla(String[][] datos) {
		String[] dias = { "Canción", "Autor", " Genero" };
		tablaCanciones = new JTable(datos, dias);
		scroll = new JScrollPane(tablaCanciones);
	}

	public JLabel getEtiquetaNombreCancion() {
		return etiquetaNombreCancion;
	}

	public void setEtiquetaNombreCancion(JLabel etiquetaNombreCancion) {
		this.etiquetaNombreCancion = etiquetaNombreCancion;
	}

	public JLabel getEtiquetaNombreAutor() {
		return etiquetaNombreAutor;
	}

	public void setEtiquetaNombreAutor(JLabel etiquetaNombreAutor) {
		this.etiquetaNombreAutor = etiquetaNombreAutor;
	}

	public JLabel getEtiquetaGeneroMusica() {
		return etiquetaGeneroMusica;
	}

	public void setEtiquetaGeneroMusica(JLabel etiquetaGeneroMusica) {
		this.etiquetaGeneroMusica = etiquetaGeneroMusica;
	}

	public JLabel getEtiquetaArchivo() {
		return etiquetaArchivo;
	}

	public void setEtiquetaArchivo(JLabel etiquetaArchivo) {
		this.etiquetaArchivo = etiquetaArchivo;
	}

	public JTextField getCampoTextoNombreCancion() {
		return campoTextoNombreCancion;
	}

	public void setCampoTextoNombreCancion(JTextField campoTextoNombreCancion) {
		this.campoTextoNombreCancion = campoTextoNombreCancion;
	}

	public JTextField getCampoTextoNombreAutor() {
		return campoTextoNombreAutor;
	}

	public void setCampoTextoNombreAutor(JTextField campoTextoNombreAutor) {
		this.campoTextoNombreAutor = campoTextoNombreAutor;
	}

	public JTextField getCampoTextoGeneroMusica() {
		return campoTextoGeneroMusica;
	}

	public void setCampoTextoGeneroMusica(JTextField campoTextoGeneroMusica) {
		this.campoTextoGeneroMusica = campoTextoGeneroMusica;
	}

	public JTextArea getCampoTextoArchivo() {
		return campoTextoArchivo;
	}

	public void setCampoTextoArchivo(JTextArea campoTextoArchivo) {
		this.campoTextoArchivo = campoTextoArchivo;
	}

	public JTable getTablaCanciones() {
		return tablaCanciones;
	}

	public void setTablaCanciones(JTable tablaCanciones) {
		this.tablaCanciones = tablaCanciones;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public JButton getBotonAgregar() {
		return botonAgregar;
	}

	public void setBotonAgregar(JButton botonAgregar) {
		this.botonAgregar = botonAgregar;
	}

	public JButton getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(JButton botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

	public JPanel getPanelRegistro() {
		return panelRegistro;
	}

	public void setPanelRegistro(JPanel panelRegistro) {
		this.panelRegistro = panelRegistro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
