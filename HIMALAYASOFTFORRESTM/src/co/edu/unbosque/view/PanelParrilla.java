package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

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
	private JComboBox comboNombreCancion;
	private JScrollPane sp;

	public PanelParrilla() {

		setBackground(Color.white);
		setBorder(new TitledBorder("Parrilla Musical"));
		setLayout(new BorderLayout());
		// asignarValores();
		// crearTabla(String[][] datos);
		// agregarComponentes();

	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado Se obtiene un String bidimencional
	 *         para generar la tabla de la parrilla
	 * @param datos
	 * 
	 */
	public void crearTabla(String[][] datos) {
		String[] dias = { "Cancion", "Autor", "Genero" };
		tablaParrilla = new JTable(datos, dias);
		sp = new JScrollPane(tablaParrilla);

	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado Se asigna los valores correspondientes
	 *         a cada componente
	 * 
	 */
	public void asignarValores() {

		botonAgregar = new JButton("Agregar");
		comboNombreCancion = new JComboBox();
		comboNombreCancion.addItem("NombreCanciones");

	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado Se agrega cada componente del panel y
	 *         se orienta en sur, centro y este.
	 * 
	 */
	public void agregarComponentes() {
		add(sp, BorderLayout.SOUTH);
		add(comboNombreCancion, BorderLayout.CENTER);
		add(botonAgregar, BorderLayout.EAST);
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

	public JComboBox getComboNombreCancion() {
		return comboNombreCancion;
	}

	public void setComboNombreCancion(JComboBox comboNombreCancion) {
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
