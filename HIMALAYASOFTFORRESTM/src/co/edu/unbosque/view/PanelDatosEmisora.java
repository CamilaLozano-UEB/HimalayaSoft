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
		
		GridLayout grid=new GridLayout(6,0);
		setLayout(grid);
		setBorder( new TitledBorder( "Datos Emisora"));
	}

	
	public void asignarValores(String[] titulos) {

		etiquetaTituloNombre = new JLabel(titulos[0]);
		etiquetaTituloModo = new JLabel(titulos[1]);
		etiquetaTituloTipoMusica = new JLabel(titulos[2]);
		etiquetaNombreEmisora = new JLabel(titulos[3]);
		etiquetaModoTransmision = new JLabel(titulos[4]);
		etiquetaTipoMusica = new JLabel(titulos[5]);
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


	public static void main(String[] args) {

		PanelDatosEmisora panel = new PanelDatosEmisora();

		String[] titulos = new String[6];
		titulos[0]="Nombre de Emisora:";
		titulos[1]="Modo de Transmision:";
		titulos[2]="Tipo de Musica:";
		titulos[3]="ForrestFM";
		titulos[4]="Streaming";
		titulos[5]="POP";

		
		panel.asignarValores(titulos);
		panel.agregarComponentes();
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setVisible(true);
	}
	
}
