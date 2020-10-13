package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PanelInformacionEmisora extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel etiquetaNombreEmisora;
	private JLabel etiquetaModoTransmision;
	private JLabel etiquetaTipoMusica;

	private JRadioButton radioTransmision1;
	private JRadioButton radioTransmision2;
	private JRadioButton radioTransmision3;
	
	private JTextField textoNombreEmisora;
	private JTextField textoTipoMusica;
	
	private JButton botonGuardar;
	private JButton botonCancelar;


	public PanelInformacionEmisora() {

		GridLayout grid=new GridLayout(2,4);
		setLayout(grid);
		setBorder( new TitledBorder( "Informacion Emisora"));
		
	}
	
	public void asignarValores(String[] titulos) {

		etiquetaNombreEmisora = new JLabel(titulos[0]);
		etiquetaModoTransmision = new JLabel(titulos[1]);
		etiquetaTipoMusica = new JLabel(titulos[2]);
		
		radioTransmision1 =  new JRadioButton(titulos[3],true);
		radioTransmision2 =  new JRadioButton(titulos[4],false);
		radioTransmision3 =  new JRadioButton(titulos[5],false);

		textoNombreEmisora = new JTextField();
		textoTipoMusica = new JTextField();

		botonGuardar = new JButton(titulos[6]);
		botonCancelar = new JButton(titulos[7]);
		
	}
	
	public void agregarComponentes() {
		
		add(etiquetaNombreEmisora);
		add(etiquetaModoTransmision);;
		add(etiquetaTipoMusica);
		add(botonGuardar);
		add(textoNombreEmisora);
		JPanel radios= new JPanel();	
		radios.setLayout(new GridLayout(0,1));
		ButtonGroup bg=new ButtonGroup();
		bg.add(radioTransmision1);
		bg.add(radioTransmision2);
		bg.add(radioTransmision3);
		radios.add(radioTransmision1);
		radios.add(radioTransmision2);
		radios.add(radioTransmision3);
		add(radios);
		add(textoTipoMusica);
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


	public JRadioButton getModoTransmision1() {
		return radioTransmision1;
	}

	public void setModoTransmision1(JRadioButton modoTransmision1) {
		this.radioTransmision1 = modoTransmision1;
	}

	public JRadioButton getModoTransmision2() {
		return radioTransmision2;
	}

	public void setModoTransmision2(JRadioButton modoTransmision2) {
		this.radioTransmision2 = modoTransmision2;
	}

	public JRadioButton getModoTransmision3() {
		return radioTransmision3;
	}

	public void setModoTransmision3(JRadioButton modoTransmision3) {
		this.radioTransmision3 = modoTransmision3;
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

	
	
	public static void main(String[] args) {

		PanelInformacionEmisora panel = new PanelInformacionEmisora();

		String[] titulos = new String[8];
		titulos[0]="Nombre de Emisora";
		titulos[1]="Modo de Transmision";
		titulos[2]="Tipo de Musica";
		titulos[3]="FM";
		titulos[4]="AM";
		titulos[5]="Streaming";
		titulos[6]="Guardar";
		titulos[7]="Cancelar";
		
		panel.asignarValores(titulos);
		panel.agregarComponentes();
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setVisible(true);
	}


}
