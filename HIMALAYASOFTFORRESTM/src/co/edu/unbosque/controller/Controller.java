package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Emisora;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private View vista;
	private Emisora emisora;

	public Controller() {
		vista = new View();
		emisora = new Emisora();
		emisora.gestionarCaracteristicas();
		inicializarComponentesVista();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (this.emisora.getNombreEmisora() == null || this.emisora.getModoTransmision() == null
				|| this.emisora.getTipoDeMusica() == null) {
			

		}

	}

	public void inicializarComponentesVista() {
		this.vista.agregarComponentes(this.emisora.getTitulosView());
		this.vista.getPanelEmisora().getPanelCancion().asignarValores(this.emisora.getTitulosPanelCancion());
		this.vista.getPanelEmisora().getPanelCancion().agregarComponentes();
		this.vista.getPanelEmisora().getPanelDatosEmisora().asignarValores(this.emisora.getTitulosPanelDatosEmisora());
		this.vista.getPanelEmisora().getPanelDatosEmisora().agregarComponentes();
		this.vista.getPanelEmisora().getPanelParrilla().asignarValores(this.emisora.getTitulosPanelParrilla());
		this.vista.getPanelEmisora().getPanelParrilla().agregarComponentes();
		this.vista.getPanelInformacion().getPanelAgregarCancion()
				.asignarValores(this.emisora.getTitulosPanelAgregarCancion());
		this.vista.getPanelInformacion().getPanelAgregarCancion().agregarComponentes();
		this.vista.getPanelInformacion().getPanelInformacionEmisora()
				.asignarValores(this.emisora.getTitulosPanelInformacionEmisora());
		this.vista.getPanelInformacion().getPanelInformacionEmisora().agregarComponentes();
		this.vista.actionListener(this);
	}
}
