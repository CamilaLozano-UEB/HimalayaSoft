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
import javax.swing.table.DefaultTableModel;

public class PanelParrilla extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton botonAgregar;
	private JButton botonBorrar;
	private String COMMAND_AGREGAR_PARRILLA = "AgregarParrilla";
	private String COMMAND_BORRAR_PARRILLA = "BorrarParrilla";
	private JTable tablaParrilla;
	private JComboBox<String> comboNombreCancion;
	private JScrollPane sp;
	private JPanel contenedor;
	private DefaultTableModel modeloTablaParrilla;

	public PanelParrilla() {

		setBackground(Color.white);
		setLayout(new BorderLayout());
		
	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado Se obtiene un String bidimensional
	 *         para generar la tabla de la parrilla
	 * 
	 * @param datos
	 * 
	 */

	public void crearTabla(String[][] datos) {
		for (int i = 0; i < datos.length; i++) {
			modeloTablaParrilla.addRow(datos[i]);
		}
	}

	
	public void actualizarTabla(String cancion, String autor, String genero) {
		String[] datos = { cancion, autor, genero };
		modeloTablaParrilla.addRow(datos);
	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado
	 * 
	 *         Se asigna los valores correspondientes a cada componente apartir de
	 *         un arreglo.
	 * @param titulos
	 */
	public void asignarValores(String[] titulos) {
		contenedor = new JPanel();
		contenedor.setLayout(new GridLayout(1, 2));
		setBorder(new TitledBorder(titulos[0]));
		botonAgregar = new JButton(titulos[1]);
		botonAgregar.setActionCommand(COMMAND_AGREGAR_PARRILLA);
		botonBorrar = new JButton(titulos[2]);
		botonBorrar.setActionCommand(COMMAND_BORRAR_PARRILLA);
		comboNombreCancion = new JComboBox<String>();
		comboNombreCancion.addItem(titulos[3]);
		
		modeloTablaParrilla = new DefaultTableModel();
		tablaParrilla = new JTable(modeloTablaParrilla);
		sp = new JScrollPane(tablaParrilla);
		modeloTablaParrilla.addColumn(titulos[4]);
		modeloTablaParrilla.addColumn(titulos[5]);
		modeloTablaParrilla.addColumn(titulos[6]);
	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado
	 * 
	 *         Se agrega cada componente del panel y lo ubica desde BorderLayout
	 *
	 */
	public void agregarComponentes() {
		contenedor.add(comboNombreCancion);
		contenedor.add(botonAgregar);
		add(sp);
		add(botonBorrar,BorderLayout.PAGE_END);
		add(contenedor, BorderLayout.PAGE_START);
	}

	public void agregarCancionesComboBox(String[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			this.comboNombreCancion.addItem(canciones[i]);
		}

	}

	public String getCOMMAND_AGREGAR_PARRILLA() {
		return COMMAND_AGREGAR_PARRILLA;
	}

	public void setCOMMAND_AGREGAR_PARRILLA(String cOMMAND_AGREGAR_PARRILLA) {
		COMMAND_AGREGAR_PARRILLA = cOMMAND_AGREGAR_PARRILLA;
	}


	public JButton getBotonBorrar() {
		return botonBorrar;
	}

	public void setBotonBorrar(JButton botonBorrar) {
		this.botonBorrar = botonBorrar;
	}

	public String getCOMMAND_BORRAR_PARRILLA() {
		return COMMAND_BORRAR_PARRILLA;
	}

	public void setCOMMAND_BORRAR_PARRILLA(String cOMMAND_BORRAR_PARRILLA) {
		COMMAND_BORRAR_PARRILLA = cOMMAND_BORRAR_PARRILLA;
	}

	public DefaultTableModel getModeloTablaParrilla() {
		return modeloTablaParrilla;
	}

	public void setModeloTablaParrilla(DefaultTableModel modeloTablaParrilla) {
		this.modeloTablaParrilla = modeloTablaParrilla;
	}

	public JPanel getContenedor() {
		return contenedor;
	}

	public void setContenedor(JPanel contenedor) {
		this.contenedor = contenedor;
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
