package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.CancionIgualException;
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

		} else if (event.getActionCommand()
				.equals(vista.getPanelEmisora().getPanelParrilla().getCOMMAND_AGREGAR_PARRILLA())) {

			if (!vista.getPanelEmisora().getPanelParrilla().getComboNombreCancion().getSelectedItem()
					.equals("Seleccionar Canción")
					&& !vista.getPanelEmisora().getPanelParrilla().getComboNombreCancion().getSelectedItem()
							.equals("Select Song")) {
				String cancion = (String) vista.getPanelEmisora().getPanelParrilla().getComboNombreCancion()
						.getSelectedItem();
				emisora.gestionarParrilla(cancion);

				String[] tabla = emisora.llenarParrilla(cancion);
				vista.getPanelEmisora().getPanelParrilla().actualizarTabla(tabla[0], tabla[1], tabla[2]);

			}
		} else if (event.getActionCommand()
				.equals(this.vista.getPanelEmisora().getPanelReproduccion().getCOMMAND_REPRODUCIR())) {
			this.emisora.getParrillaMusical().reproducir();

		} else if (event.getActionCommand()
				.equals(this.vista.getPanelEmisora().getPanelReproduccion().getCOMMAND_PAUSAR())) {
			this.emisora.getParrillaMusical().pausar();

		} else if (event.getActionCommand()
				.equals(this.vista.getPanelEmisora().getPanelReproduccion().getCOMMAND_PARAR())) {
			this.emisora.getParrillaMusical().parar();

		} else if (event.getActionCommand()
				.equals(this.vista.getPanelEmisora().getPanelReproduccion().getCOMMAND_AVANZAR())) {
			this.emisora.getParrillaMusical().reproducirSiguiente();

		} else if (event.getActionCommand()
				.equals(this.vista.getPanelEmisora().getPanelReproduccion().getCOMMAND_RETROCEDER())) {
			this.emisora.getParrillaMusical().reproducirAnterior();

		} else if (event.getActionCommand()
				.equals(this.vista.getPanelEmisora().getPanelParrilla().getCOMMAND_BORRAR_PARRILLA())) {
			this.vista.getPanelEmisora().getPanelParrilla().borrarContenidoTabla();
			this.emisora.getParrillaMusical().borrarParrilla();
			this.emisora.getArchivo().borrarArchivoParrilla();

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
			vista.mostrarMensajeReinicio(this.emisora.getMensajeAceptar());

		} else {
			vista.mostrarMensajeError(this.emisora.getMensajesError()[0]);
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
				this.emisora.verificarExtensionArchivo(rutaArchivo, nombreCancion);

				if (this.emisora.agregarPistaMusical(nombreCancion, nombreArtista, genero, nombreCancion + ".mp3")
						&& this.emisora.getArchivo().copiarCancion(rutaArchivo, nombreCancion)) {

					this.vista.getPanelInformacion().getPanelAgregarCancion().actualizarTabla(nombreCancion,
							nombreArtista, genero);
					this.vista.getPanelEmisora().getPanelParrilla().getComboNombreCancion().addItem(nombreCancion);
					vista.mostrarMensajeAviso(this.emisora.getMensajeAceptar());
					this.vista.getPanelInformacion().getPanelAgregarCancion().borrarCampos();
				} else {
					vista.mostrarMensajeError(this.emisora.getMensajesError()[1]);
					this.vista.getPanelInformacion().getPanelAgregarCancion().borrarCampos();
				}
			} catch (ExtensionIncorrectaException | CancionIgualException e) {
				// TODO Auto-generated catch block
				vista.mostrarMensajeError(e.getMessage());
			}

		} else {
			vista.mostrarMensajeError(this.emisora.getMensajesError()[0]);
			this.vista.getPanelInformacion().getPanelAgregarCancion().borrarCampos();
		}

	}

	public void inicializarComponentesVista() {
		this.vista.agregarComponentes(this.emisora.getTitulosView());
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
		this.vista.getPanelInformacion().getPanelAgregarCancion()
				.crearTabla(this.emisora.asignarDatosTablaAgregarCancion());
		this.vista.getPanelEmisora().getPanelParrilla()
				.agregarCancionesComboBox(this.emisora.generarListaDeCancionesDisponibles());
		this.vista.getPanelEmisora().getPanelParrilla().crearTabla(this.emisora.asignarDatosTablaParrilla());
	}

	public void iniciarEmisora() {
		this.emisora.gestionarCaracteristicas();
		this.emisora.cargarAtributosArchivoPistas();
		this.emisora.cargarInformacionArchivoParrilla();
		this.emisora.getParrillaMusical().generarPlayList();

	}

}
