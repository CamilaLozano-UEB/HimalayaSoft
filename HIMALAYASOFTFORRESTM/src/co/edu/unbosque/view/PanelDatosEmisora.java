package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelDatosEmisora extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel etiquetaTituloNombre;
	private JLabel etiquetaNombreEmisora;
	private JLabel etiquetaTituloModo;
	private JLabel etiquetaModoTransmision;
	private JLabel etiquetaTituloTipoMusica;
	private JLabel etiquetaTipoMusica;

	public PanelDatosEmisora() {
		GridLayout grid = new GridLayout(6, 0);
		setLayout(grid);
	}

	public void asignarValores(String[] titulos) {
		setBorder(new TitledBorder(titulos[0]));
		etiquetaTituloNombre = new JLabel(titulos[1]);
		etiquetaTituloModo = new JLabel(titulos[2]);
		etiquetaTituloTipoMusica = new JLabel(titulos[3]);
		etiquetaNombreEmisora = new JLabel();
		etiquetaModoTransmision = new JLabel();
		etiquetaTipoMusica = new JLabel();
	}


	public void actualizarAtributos(String nombreEmisora, String modoTransmision, String tipoMusica) {
		this.etiquetaNombreEmisora.setText(nombreEmisora);
		this.etiquetaModoTransmision.setText(modoTransmision);
		this.etiquetaTipoMusica.setText(tipoMusica);
	}

	public void agregarComponentes() {
		add(etiquetaTituloNombre);
		add(etiquetaNombreEmisora);
		add(getEtiquetaTituloModo());
		add(etiquetaModoTransmision);
		add(etiquetaTituloTipoMusica);
		add(etiquetaTipoMusica);
	}

	public JLabel getEtiquetaTituloNombre() {
		return etiquetaTituloNombre;
	}

	public void setEtiquetaTituloNombre(JLabel etiquetaTituloNombre) {
		this.etiquetaTituloNombre = etiquetaTituloNombre;
	}

	public JLabel getEtiquetaNombreEmisora() {
		return etiquetaNombreEmisora;
	}

	public void setEtiquetaNombreEmisora(JLabel etiquetaNombreEmisora) {
		this.etiquetaNombreEmisora = etiquetaNombreEmisora;
	}

	public JLabel getEtiquetaTituloModo() {
		return etiquetaTituloModo;
	}

	public void setEtiquetaTituloModo(JLabel etiquetaTituloModo) {
		this.etiquetaTituloModo = etiquetaTituloModo;
	}

	public JLabel getEtiquetaModoTransmision() {
		return etiquetaModoTransmision;
	}

	public void setEtiquetaModoTransmision(JLabel etiquetaModoTransmision) {
		this.etiquetaModoTransmision = etiquetaModoTransmision;
	}

	public JLabel getEtiquetaTituloTipoMusica() {
		return etiquetaTituloTipoMusica;
	}

	public void setEtiquetaTituloTipoMusica(JLabel etiquetaTituloTipoMusica) {
		this.etiquetaTituloTipoMusica = etiquetaTituloTipoMusica;
	}

	public JLabel getEtiquetaTipoMusica() {
		return etiquetaTipoMusica;
	}

	public void setEtiquetaTipoMusica(JLabel etiquetaTipoMusica) {
		this.etiquetaTipoMusica = etiquetaTipoMusica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
