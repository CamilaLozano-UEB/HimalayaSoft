package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class PanelAgregarCancion extends JPanel implements DropTargetListener {

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
	private DropTarget dropTarget;
	private DefaultTableModel modeloTabla;

	private final String AGREGAR = "Agregar";
	private final String CANCELAR = "CANCELAR";

	public PanelAgregarCancion() {
		this.setLayout(new GridLayout(1, 2));
		this.asignarValores();
		this.agregarComponentes();
	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Recibe como entrada los valores que corresponden a cada componente
	 *         (lo que dice)
	 * @param titulos
	 */
	public void asignarValores() {

		panelRegistro = new JPanel();
		panelRegistro.setLayout(new GridLayout(5, 2));
		panelRegistro.setBackground(new Color(144, 215, 247));

		etiquetaNombreCancion = new JLabel();
		etiquetaNombreCancion.setForeground(Color.black);
		etiquetaNombreAutor = new JLabel();
		etiquetaNombreAutor.setForeground(Color.black);
		etiquetaGeneroMusica = new JLabel();
		etiquetaGeneroMusica.setForeground(Color.black);
		etiquetaArchivo = new JLabel();
		etiquetaArchivo.setForeground(Color.black);

		campoTextoNombreCancion = new JTextField();
		campoTextoNombreAutor = new JTextField();
		campoTextoGeneroMusica = new JTextField();
		campoTextoArchivo = new JTextArea();
		campoTextoArchivo.setForeground(Color.black);

		botonAgregar = new JButton();
		botonAgregar.setActionCommand(AGREGAR);
		botonAgregar.setEnabled(false);

		botonCancelar = new JButton();
		botonCancelar.setActionCommand(CANCELAR);
		botonCancelar.setEnabled(false);

		campoTextoArchivo.setEditable(false);
		campoTextoArchivo.setBackground(new Color(194, 210, 214));

		modeloTabla = new DefaultTableModel();
		tablaCanciones = new JTable(modeloTabla);
		tablaCanciones.setEnabled(false);
		tablaCanciones.setDragEnabled(false);
		scroll = new JScrollPane(tablaCanciones);
		modeloTabla.addColumn("");
		modeloTabla.addColumn("");
		modeloTabla.addColumn("");

		/**
		 * @author Nicolás Peña Mogollón
		 * 
		 *         El DropTarget se asocia con un componente cuando ese componente desea
		 *         aceptar un drop durante las operaciones de drag and drop, en este
		 *         caso es el JTextArea campoTextoArchivo, al cual se le debe asignar un
		 *         listener DropTargetListener)
		 * @param campoTextoArchivo
		 */

		dropTarget = new DropTarget(campoTextoArchivo, this);
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
		this.add(panelRegistro);
		this.add(scroll);

	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Recibe los datos de la tabla en forma de arreglo bidimensional para
	 *         agregarlos a la tabla
	 * @param datos
	 */
	public void crearTabla(String[][] datos) {
		for (int i = 0; i < datos.length; i++) {
			modeloTabla.addRow(datos[i]);
		}
	}

	public void actualizarTabla(String cancion, String autor, String genero) {
		String[] datos = { cancion, autor, genero };
		modeloTabla.addRow(datos);
	}

	public void borrarCampos() {
		this.campoTextoNombreCancion.setText("");
		this.campoTextoNombreAutor.setText("");
		this.campoTextoGeneroMusica.setText("");
		this.campoTextoArchivo.setText("");
	}

	public void actualizarPanelAgregarCancion(String[] titulos) {
		setBorder(new TitledBorder(titulos[0]));

		etiquetaNombreCancion.setText(titulos[1]);
		etiquetaNombreAutor.setText(titulos[2]);
		etiquetaGeneroMusica.setText(titulos[3]);
		etiquetaArchivo.setText(titulos[4]);
		botonAgregar.setText(titulos[5]);
		botonCancelar.setText(titulos[6]);

		modeloTabla.fireTableStructureChanged();
		tablaCanciones.getColumn(tablaCanciones.getColumnName(0)).setHeaderValue(titulos[7]);
		tablaCanciones.getColumn(tablaCanciones.getColumnName(1)).setHeaderValue(titulos[8]);
		tablaCanciones.getColumn(tablaCanciones.getColumnName(2)).setHeaderValue(titulos[9]);

	}

	/**
	 * @author Nicolás Peña Mogollón
	 * 
	 *         Métodos por defecto de la interfaz, no se usan ya que no es necesario
	 *         saber cuando el puntero est� arrastrando el elemento, cuándo sale de
	 *         la parte operativa, cuándo está sobre esta o cu�ndo se hacen
	 *         modificaciones
	 * @param dtde
	 */

	public void dragEnter(DropTargetDragEvent dtde) {
	}

	public void dragExit(DropTargetEvent dte) {
	}

	public void dragOver(DropTargetDragEvent dtde) {
	}

	public void dropActionChanged(DropTargetDragEvent dtde) {
	}

	/**
	 * @author Nicolás Peña Mogollón
	 *
	 *         Método de DropTargetListener, que usa DropTargetDropEvent para
	 *         generar el evento al terminar la operaci�n de arrastre
	 * @param dtde
	 */

	public void drop(DropTargetDropEvent dtde) {
		try {

			/**
			 * @author Nicolás Peña Mogollón
			 *
			 *         El método getTransferable de la clase DropTargetDropEvent retorna un
			 *         objeto Transferable asociado con el Drop. Cuando el usuario
			 *         interviene con el drop. Este se almacena en tr. Un objeto de la clase
			 *         Transferable para que se puedan proporcionar los datos en la
			 *         operación de transferencia.
			 */

			Transferable tr = dtde.getTransferable();

			/**
			 * @author Nicolás Peña Mogollón
			 *
			 *         Devuelve una matriz de objetos DataFlavor (Clase que encapsula un
			 *         tipo de contenido (datos), normalmente MIME) que indica los tipos en
			 *         los que se pueden proporcionar los datos. (docs.oracle)
			 */

			DataFlavor[] flavors = tr.getTransferDataFlavors();
			for (int i = 0; i < flavors.length; i++) {

				/**
				 * @author Nicolás Peña Mogollón
				 *
				 *         Se verifica si el tipo de datos representa una lista de objetos de
				 *         archivo
				 */

				if (flavors[i].isFlavorJavaFileListType()) {

					/**
					 * @author Nicolás Peña Mogollón
					 *
					 *         Se acepta el Drop y DnDConstants.ACTION_COPY_OR_MOVE determina que se
					 *         copian los datos
					 */

					dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);

					/**
					 * @author Nicolás Peña Mogollón
					 *
					 *         El método getTransferData retorna un objeto que representa los datos
					 *         a transferir que toma de flavors en la posición i, para luego
					 *         añadirlos a una lista
					 */

					@SuppressWarnings("rawtypes")
					java.util.List list = (java.util.List) tr.getTransferData(flavors[i]);

					/**
					 * @author Nicolás Peña Mogollón
					 *
					 *         Se añade la ruta o el nombre del archivo al �rea de texto
					 */
					for (int j = 0; j < list.size(); j++) {

						/**
						 * @author Nicolás Peña Mogollón
						 *
						 *         El método apend a�ade nueva informaci�n a el JTextArea
						 */
						campoTextoArchivo.append(list.get(j) + "\n");
					}

					/**
					 * @author Nicolás Peña Mogollón
					 *
					 *         Se da por terminado el drop
					 */
					dtde.dropComplete(true);

					i = flavors.length;
				}

			}
			dtde.rejectDrop();

		} catch (Exception e) {

			dtde.rejectDrop();
		}
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

	public DropTarget getDropTarget() {
		return dropTarget;
	}

	public void setDropTarget(DropTarget dropTarget) {
		this.dropTarget = dropTarget;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAGREGAR() {
		return AGREGAR;
	}

	public String getCANCELAR() {
		return CANCELAR;
	}

	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}

	public void setModeloTabla(DefaultTableModel modeloTabla) {
		this.modeloTabla = modeloTabla;
	}

}
