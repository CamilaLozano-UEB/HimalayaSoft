package co.edu.unbosque.view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelCancion extends JPanel {

	private JPanel panelCancionInfo;
	private JLabel etiquetaNombreCancion;
	private JLabel etiquetaautor;
	private JLabel etiquetageneroMusical;
	private JLabel etiquetaCancionSelect;
	private JLabel etiquetaAutorSelect;
	private JLabel etiquetaGeneroMusicalSelect;
	private JLabel etiquetaImagenPortada;

	private static final long serialVersionUID = 1L;

	public PanelCancion() {
		setBorder(new TitledBorder("Cancion Reproducion"));
		setLayout(new GridLayout(2, 1));

	}

	/**
	 * @author María Camila Lozano
	 * 
	 *         Recibe los valores de entrada de cada componente
	 * @param etiquetas
	 */

	public void asignarValoresReproduccion(String[] etiquetas) {

		panelCancionInfo = new JPanel();
		panelCancionInfo.setLayout(new GridLayout(3, 2));
		etiquetaNombreCancion = new JLabel(etiquetas[0]);
		etiquetaautor = new JLabel(etiquetas[1]);
		etiquetageneroMusical = new JLabel(etiquetas[2]);
		etiquetaCancionSelect = new JLabel();
		etiquetaAutorSelect = new JLabel();
		etiquetaGeneroMusicalSelect = new JLabel();
		etiquetaImagenPortada = new JLabel("cualquier cosa");

	}

	/**
	 * @author María Camila Lozano
	 * 
	 *         Asigna los valores para las etiquetas que mostraran los valores de
	 *         resultados
	 * @param etiquetas
	 */

	public void refrescarDatos(String cancion, String autor, String gMusical) {
		etiquetaCancionSelect.setText(cancion);
		etiquetaAutorSelect.setText(autor);
		etiquetaGeneroMusicalSelect.setText(gMusical);
		this.revalidate();
		this.repaint();
	}

	/**
	 * @author María Camila Lozano
	 * 
	 *         Agrega cada componente al panel
	 * @param etiquetas
	 */

	public void agregarComponentes() {

		panelCancionInfo.add(etiquetaNombreCancion);
		panelCancionInfo.add(etiquetaCancionSelect);
		panelCancionInfo.add(etiquetaautor);
		panelCancionInfo.add(etiquetaAutorSelect);
		panelCancionInfo.add(etiquetageneroMusical);
		panelCancionInfo.add(etiquetaGeneroMusicalSelect);
		this.add(panelCancionInfo);
		this.add(etiquetaImagenPortada);

	}

	public JPanel getPanelCancionInfo() {
		return panelCancionInfo;
	}

	public void setPanelCancionInfo(JPanel panelCancionInfo) {
		this.panelCancionInfo = panelCancionInfo;
	}

	public JLabel getEtiquetaNombreCancion() {
		return etiquetaNombreCancion;
	}

	public void setEtiquetaNombreCancion(JLabel etiquetaNombreCancion) {
		this.etiquetaNombreCancion = etiquetaNombreCancion;
	}

	public JLabel getEtiquetaautor() {
		return etiquetaautor;
	}

	public void setEtiquetaautor(JLabel etiquetaautor) {
		this.etiquetaautor = etiquetaautor;
	}

	public JLabel getEtiquetageneroMusical() {
		return etiquetageneroMusical;
	}

	public void setEtiquetageneroMusical(JLabel etiquetageneroMusical) {
		this.etiquetageneroMusical = etiquetageneroMusical;
	}

	public JLabel getEtiquetaCancionSelect() {
		return etiquetaCancionSelect;
	}

	public void setEtiquetaCancionSelect(JLabel etiquetaCancionSelect) {
		this.etiquetaCancionSelect = etiquetaCancionSelect;
	}

	public JLabel getEtiquetaAutorSelect() {
		return etiquetaAutorSelect;
	}

	public void setEtiquetaAutorSelect(JLabel etiquetaAutorSelect) {
		this.etiquetaAutorSelect = etiquetaAutorSelect;
	}

	public JLabel getEtiquetaGeneroMusicalSelect() {
		return etiquetaGeneroMusicalSelect;
	}

	public void setEtiquetaGeneroMusicalSelect(JLabel etiquetaGeneroMusicalSelect) {
		this.etiquetaGeneroMusicalSelect = etiquetaGeneroMusicalSelect;
	}

	public JLabel getEtiquetaImagenPortada() {
		return etiquetaImagenPortada;
	}

	public void setEtiquetaImagenPortada(JLabel etiquetaImagenPortada) {
		this.etiquetaImagenPortada = etiquetaImagenPortada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
