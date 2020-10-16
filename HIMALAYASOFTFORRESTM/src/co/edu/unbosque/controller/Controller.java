package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Emisora;
import co.edu.unbosque.model.ExtensionIncorrectaException;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private View vista;
	private Emisora emisora;

	public Controller() {
		vista = new View();
		emisora = new Emisora();
		iniciarEmisora();
		inicializarComponentesVista();

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

		if (event.getActionCommand().equals(vista.getPanelInformacion().getPanelInformacionEmisora().getGUARDAR())) {
			this.gestionarDatosEmisora();
			this.vista.getPanelEmisora().getPanelDatosEmisora().actualizarAtributos(this.emisora.getNombreEmisora(),
					this.emisora.getModoTransmision(), this.emisora.getTipoDeMusica());
			this.emisora.escribirArchivoEmisora();
		} else if (event.getActionCommand()
				.equals(vista.getPanelInformacion().getPanelInformacionEmisora().getCANCELAR())) {
			this.vista.getPanelInformacion().getPanelInformacionEmisora().borrarCampos();
		} else if (event.getActionCommand().equals(vista.getPanelInformacion().getPanelAgregarCancion().getAGREGAR())) {
			this.gestionarIngresoCancion();
		}
	}

	public void gestionarDatosEmisora() {
		if (!this.vista.getPanelInformacion().getPanelInformacionEmisora().getCampoTextoNombreEmisora().getText()
				.equals("")
				&& !this.vista.getPanelInformacion().getPanelInformacionEmisora().getComboModoTransmision()
						.getSelectedItem().equals("Seleccione...")
				&& !this.vista.getPanelInformacion().getPanelInformacionEmisora().getComboModoTransmision()
						.getSelectedItem().equals("Select...")
				&& !this.vista.getPanelInformacion().getPanelInformacionEmisora().getCampoTextoTipoMusica().getText()
						.equals("")) {
			String nombreEmisora = this.vista.getPanelInformacion().getPanelInformacionEmisora()
					.getCampoTextoNombreEmisora().getText();
			String modoTransmision = (String) this.vista.getPanelInformacion().getPanelInformacionEmisora()
					.getComboModoTransmision().getSelectedItem();
			String tipoMusica = this.vista.getPanelInformacion().getPanelInformacionEmisora().getCampoTextoTipoMusica()
					.getText();
			String idioma = "";
			if (this.vista.getPanelInformacion().getPanelInformacionEmisora().getRadio_EN().isSelected()) {
				idioma = "EN";
			} else {
				idioma = "ES";
			}
			this.emisora.asignarInformacionEmisora(nombreEmisora, modoTransmision, tipoMusica, idioma);
			vista.mostrarMensajeReinicio("Información guardada correctamente.\nPor favor vuelva a abrir el programa.");

		} else {
			vista.mostrarMensajeError("¡Es necesario llenar los campos!");
			this.vista.getPanelInformacion().getPanelInformacionEmisora().borrarCampos();
		}
	}

	public void gestionarIngresoCancion() {
		if (!this.vista.getPanelInformacion().getPanelAgregarCancion().getCampoTextoNombreCancion().getText().equals("")
				&& !this.vista.getPanelInformacion().getPanelAgregarCancion().getCampoTextoNombreAutor().getText()
						.equals("")
				&& !this.vista.getPanelInformacion().getPanelAgregarCancion().getCampoTextoGeneroMusica().getText()
						.equals("")
				&& !this.vista.getPanelInformacion().getPanelAgregarCancion().getCampoTextoArchivo().getText()
						.equals("")) {
			String nombreCancion = this.vista.getPanelInformacion().getPanelAgregarCancion()
					.getCampoTextoNombreCancion().getText();
			String nombreArtista = this.vista.getPanelInformacion().getPanelAgregarCancion().getCampoTextoNombreAutor()
					.getText();
			String genero = this.vista.getPanelInformacion().getPanelAgregarCancion().getCampoTextoGeneroMusica()
					.getText();
			String rutaArchivo = this.vista.getPanelInformacion().getPanelAgregarCancion().getCampoTextoArchivo()
					.getText();
			try {
				this.emisora.verificarExtensionArchivo(rutaArchivo);
			} catch (ExtensionIncorrectaException e) {
				// TODO Auto-generated catch block
				vista.mostrarMensajeError(e.getMessage());
			}
			if (this.emisora.agregarPistaMusical(nombreCancion, nombreArtista, genero, rutaArchivo)
					&& this.emisora.getArchivo().copiarCancion(rutaArchivo, nombreCancion)) {
				this.vista.getPanelInformacion().getPanelAgregarCancion().crearTabla(this.emisora.asignarDatosTabla());
				vista.mostrarMensajeAviso("Información ingresada correctamente!!!");
				this.vista.getPanelInformacion().getPanelAgregarCancion().borrarCampos();
			} else {
				vista.mostrarMensajeError("Error al guardar canción");
				this.vista.getPanelInformacion().getPanelAgregarCancion().borrarCampos();
			}

		} else {
			vista.mostrarMensajeError("Es necesario llenar los campos");
			this.vista.getPanelInformacion().getPanelAgregarCancion().borrarCampos();
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
		this.vista.getPanelEmisora().getPanelDatosEmisora().actualizarAtributos(this.emisora.getNombreEmisora(),
				this.emisora.getModoTransmision(), this.emisora.getTipoDeMusica());
		this.vista.getPanelInformacion().getPanelInformacionEmisora().cargarCampos(this.emisora.getNombreEmisora(),
				this.emisora.getModoTransmision(), this.emisora.getTipoDeMusica(), this.emisora.getIdioma());
		this.vista.getPanelInformacion().getPanelAgregarCancion().crearTabla(this.emisora.asignarDatosTabla());
	}

	public void iniciarEmisora() {
		this.emisora.gestionarCaracteristicas();
		this.emisora.cargarAtributosArchivoPistas();
	}
}
