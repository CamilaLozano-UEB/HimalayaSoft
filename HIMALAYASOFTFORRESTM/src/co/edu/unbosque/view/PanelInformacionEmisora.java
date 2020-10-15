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

	private JButton botonGuardar;
	private JButton botonCancelar;

	public PanelInformacionEmisora() {

		
		setLayout(new GridLayout(6, 2));
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
