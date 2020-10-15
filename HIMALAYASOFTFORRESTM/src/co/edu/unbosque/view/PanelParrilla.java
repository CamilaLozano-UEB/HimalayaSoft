package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.border.TitledBorder;

public class PanelParrilla extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton botonAgregar;
	private JTable tablaParrilla;
	private JComboBox<String> comboNombreCancion;
	private JScrollPane sp;
	private String[] titulosTabla;
	private JPanel contenedor;

	public PanelParrilla() {

		setBackground(Color.white);
		setLayout(new BorderLayout());
		this.titulosTabla = new String[3];
	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado Se obtiene un String bidimensional
	 *         para generar la tabla de la parrilla
	 * @param datos
	 * 
	 */
	public void crearTabla(String[][] datos) {

		String[] titulos = { titulosTabla[0], titulosTabla[1], titulosTabla[2] };
		tablaParrilla = new JTable(datos, titulos);
		sp = new JScrollPane(tablaParrilla);
		add(sp, BorderLayout.SOUTH);
		repaint();
		validate();
	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado Se asigna los valores correspondientes
	 *         a cada componente
	 * 
	 */
	public void asignarValores(String[] titulos) {
		contenedor = new JPanel();
		contenedor.setLayout(new GridLayout(1, 2));
		setBorder(new TitledBorder(titulos[0]));
		botonAgregar = new JButton(titulos[1]);
		comboNombreCancion = new JComboBox<String>();
		comboNombreCancion.addItem(titulos[2]);
		titulosTabla[0] = titulos[3];
		titulosTabla[1] = titulos[4];
		titulosTabla[2] = titulos[5];
	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado Se agrega cada componente del panel y
	 *         se orienta en sur, centro y este.
	 * 
	 */
	public void agregarComponentes() {
		contenedor.add(comboNombreCancion);
		contenedor.add(botonAgregar);

		add(contenedor, BorderLayout.PAGE_START);
	}

	public JButton getBotonAgregar() {
		return botonAgregar;
	}

	public void setBotonAgregar(JButton botonAgregar) {
		this.botonAgregar = botonAgregar;
	}

	public JTable getTablaParrilla() {
		return tablaParrilla;
	}

	public void setTablaParrilla(JTable tablaParrilla) {
		this.tablaParrilla = tablaParrilla;
	}

	public JComboBox<String> getComboNombreCancion() {
		return comboNombreCancion;
	}

	public void setComboNombreCancion(JComboBox<String> comboNombreCancion) {
		this.comboNombreCancion = comboNombreCancion;
	}

	public JScrollPane getSp() {
		return sp;
	}

	public void setSp(JScrollPane sp) {
		this.sp = sp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
