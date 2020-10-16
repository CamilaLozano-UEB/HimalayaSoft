package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PanelInformacionEmisora extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel etiquetaNombreEmisora;
	private JLabel etiquetaModoTransmision;
	private JLabel etiquetaTipoMusica;

	private JComboBox<String> comboModoTransmision;

	private JTextField campoTextoNombreEmisora;
	private JTextField campoTextoTipoMusica;

	private JRadioButton radio_ES;
	private JRadioButton radio_EN;

	private JButton botonGuardar;
	private JButton botonCancelar;

	public final String GUARDAR = "Guardar";
	public final String CANCELAR = "Cancelar";

	public PanelInformacionEmisora() {

		setLayout(new GridLayout(7, 2));
	}

	public void asignarValores(String[] titulos) {

		setBorder(new TitledBorder(titulos[0]));

		etiquetaNombreEmisora = new JLabel(titulos[1]);
		etiquetaModoTransmision = new JLabel(titulos[2]);
		etiquetaTipoMusica = new JLabel(titulos[3]);

		comboModoTransmision = new JComboBox<String>();
		comboModoTransmision.addItem(titulos[4]);
		comboModoTransmision.addItem(titulos[5]);
		comboModoTransmision.addItem(titulos[6]);
		comboModoTransmision.addItem(titulos[7]);

		campoTextoNombreEmisora = new JTextField();
		campoTextoTipoMusica = new JTextField();

		campoTextoNombreEmisora = new JTextField();
		campoTextoTipoMusica = new JTextField();

		radio_ES = new JRadioButton("Español");
		radio_EN = new JRadioButton("English");

		botonGuardar = new JButton(titulos[8]);
		botonGuardar.setActionCommand(GUARDAR);

		botonCancelar = new JButton(titulos[9]);
		botonCancelar.setActionCommand(CANCELAR);

	}

	public void agregarComponentes() {

		add(etiquetaNombreEmisora);
		add(campoTextoNombreEmisora);

		add(etiquetaModoTransmision);
		add(comboModoTransmision);

		add(etiquetaTipoMusica);
		add(campoTextoTipoMusica);

		ButtonGroup bg = new ButtonGroup();
		bg.add(radio_ES);
		bg.add(radio_EN);
		add(radio_ES);
		add(radio_EN);

		add(botonGuardar);
		add(botonCancelar);

	}

	public void cargarCampos(String nombre, String modo, String tipo, String idioma) {
		this.campoTextoNombreEmisora.setText(nombre);
		this.comboModoTransmision.setSelectedItem(modo);
		this.campoTextoTipoMusica.setText(tipo);
		if (idioma==null) {
			this.radio_ES.setSelected(true);
		} else if (idioma.equals("EN")) {
			this.radio_EN.setSelected(true);
		} else if (idioma.equals("ES")){
			this.radio_ES.setSelected(true);
		}
			
	}

	public void borrarCampos() {
		this.campoTextoNombreEmisora.setText("");
		this.campoTextoTipoMusica.setText("");
		this.comboModoTransmision.setSelectedIndex(0);
	}

	public JLabel getEtiquetaNombreEmisora() {
		return etiquetaNombreEmisora;
	}

	public void setEtiquetaNombreEmisora(JLabel etiquetaNombreEmisora) {
		this.etiquetaNombreEmisora = etiquetaNombreEmisora;
	}

	public JLabel getEtiquetaModoTransmision() {
		return etiquetaModoTransmision;
	}

	public void setEtiquetaModoTransmision(JLabel etiquetaModoTransmision) {
		this.etiquetaModoTransmision = etiquetaModoTransmision;
	}

	public JLabel getEtiquetaTipoMusica() {
		return etiquetaTipoMusica;
	}

	public void setEtiquetaTipoMusica(JLabel etiquetaTipoMusica) {
		this.etiquetaTipoMusica = etiquetaTipoMusica;
	}

	public JComboBox<String> getComboModoTransmision() {
		return comboModoTransmision;
	}

	public void setComboModoTransmision(JComboBox<String> comboModoTransmision) {
		this.comboModoTransmision = comboModoTransmision;
	}

	public JTextField getCampoTextoNombreEmisora() {
		return campoTextoNombreEmisora;
	}

	public void setCampoTextoNombreEmisora(JTextField campoTextoNombreEmisora) {
		this.campoTextoNombreEmisora = campoTextoNombreEmisora;
	}

	public JTextField getCampoTextoTipoMusica() {
		return campoTextoTipoMusica;
	}

	public void setCampoTextoTipoMusica(JTextField campoTextoTipoMusica) {
		this.campoTextoTipoMusica = campoTextoTipoMusica;
	}

	public JRadioButton getRadio_ES() {
		return radio_ES;
	}

	public void setRadio_ES(JRadioButton radio_ES) {
		this.radio_ES = radio_ES;
	}

	public JRadioButton getRadio_EN() {
		return radio_EN;
	}

	public void setRadio_EN(JRadioButton radio_EN) {
		this.radio_EN = radio_EN;
	}

	public JButton getBotonGuardar() {
		return botonGuardar;
	}

	public void setBotonGuardar(JButton botonGuardar) {
		this.botonGuardar = botonGuardar;
	}

	public JButton getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(JButton botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getGUARDAR() {
		return GUARDAR;
	}

	public String getCANCELAR() {
		return CANCELAR;
	}

}
