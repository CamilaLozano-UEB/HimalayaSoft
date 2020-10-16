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

	private JTextField textoNombreEmisora;
	private JTextField textoTipoMusica;
	
	private JRadioButton radio_ES;
	private JRadioButton radio_EN;

	private JButton botonGuardar;
	private JButton botonCancelar;

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

		textoNombreEmisora = new JTextField();
		textoTipoMusica = new JTextField();
	
		radio_ES = new JRadioButton("Español",true);
		radio_EN = new JRadioButton("English",false);
		
		botonGuardar = new JButton(titulos[7]);
		botonCancelar = new JButton(titulos[8]);

	}

	public void agregarComponentes() {

		add(etiquetaNombreEmisora);
		add(textoNombreEmisora);

		add(etiquetaModoTransmision);
		add(comboModoTransmision);

		add(etiquetaTipoMusica);
		add(textoTipoMusica);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio_ES);
		bg.add(radio_EN);
		add(radio_ES);
		add(radio_EN);

		add(botonGuardar);
		add(botonCancelar);

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

	public JTextField getTextoNombreEmisora() {
		return textoNombreEmisora;
	}

	public void setTextoNombreEmisora(JTextField textoNombreEmisora) {
		this.textoNombreEmisora = textoNombreEmisora;
	}

	public JTextField getTextoTipoMusica() {
		return textoTipoMusica;
	}

	public void setTextoTipoMusica(JTextField textoTipoMusica) {
		this.textoTipoMusica = textoTipoMusica;
	}

	public JButton getBotonGuardar() {
		return botonGuardar;
	}

	public void setBotonGuardar(JButton botonGuardar) {
		this.botonGuardar = botonGuardar;
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

	public JButton getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(JButton botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
