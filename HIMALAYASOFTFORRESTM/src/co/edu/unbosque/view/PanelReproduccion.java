package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelReproduccion extends JPanel {

	private static final long serialVersionUID = 1L;
	private final String COMMAND_REPRODUCIR = "REPRODUCIR";
	private final String COMMAND_PARAR = "PARAR";
	private final String COMMAND_PAUSAR = "PAUSAR";
	private final String COMMAND_RETROCEDER = "RETROCEDER";
	private final String COMMAND_AVANZAR = "AVANZAR";
	private JButton botonPlay;
	private JButton botonStop;
	private JButton botonPausa;
	private JButton botonRetrocede;
	private JButton botonAvanza;
	private ImageIcon img_sound;
	private Icon icon_sound;

	public PanelReproduccion() {

		setLayout(new GridLayout(1, 2));
		setVisible(true);
		this.asignarValores();
		this.agregarComponentes();
	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado
	 * 
	 *         Se asigna los valores correspondientes a cada componente
	 * 
	 */

	public void asignarValores() {
		botonPausa = new JButton();
		botonPausa.setBorder(null);
		botonPausa.setOpaque(true);
		botonPausa.setBackground(new Color(144, 215, 247));
		botonPausa.setActionCommand(COMMAND_PAUSAR);

		botonPlay = new JButton();
		botonPlay.setBorder(null);
		botonPlay.setOpaque(true);
		botonPlay.setBackground(new Color(144, 215, 247));
		botonPlay.setActionCommand(COMMAND_REPRODUCIR);

		botonStop = new JButton();
		botonStop.setBorder(null);
		botonStop.setOpaque(true);
		botonStop.setBackground(new Color(144, 215, 247));
		botonStop.setActionCommand(COMMAND_PARAR);

		botonRetrocede = new JButton();
		botonRetrocede.setBorder(null);
		botonRetrocede.setOpaque(true);
		botonRetrocede.setBackground(new Color(144, 215, 247));
		botonRetrocede.setActionCommand(COMMAND_RETROCEDER);

		botonAvanza = new JButton();
		botonAvanza.setBorder(null);
		botonAvanza.setOpaque(true);
		botonAvanza.setBackground(new Color(144, 215, 247));
		botonAvanza.setActionCommand(COMMAND_AVANZAR);
	}

	/**
	 * 
	 * @author Juana Valentina Torres Parrado
	 * 
	 *         Se agrega cada componente del panel y se agrega los iconos
	 *         correspondientes de los botones
	 * 
	 */

	public void agregarComponentes() {

		img_sound = new ImageIcon("./Imagenes/Retrocede.png");
		icon_sound = new ImageIcon(img_sound.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		botonRetrocede.setIcon(icon_sound);
		add(botonRetrocede);

		img_sound = new ImageIcon("./Imagenes/Stop.png");
		icon_sound = new ImageIcon(img_sound.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		botonStop.setIcon(icon_sound);
		add(botonStop);

		img_sound = new ImageIcon("./Imagenes/Pause.png");
		icon_sound = new ImageIcon(img_sound.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		botonPausa.setIcon(icon_sound);
		add(botonPausa);

		img_sound = new ImageIcon("./Imagenes/Play.png");
		icon_sound = new ImageIcon(img_sound.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		botonPlay.setIcon(icon_sound);
		add(botonPlay);

		img_sound = new ImageIcon("./Imagenes/Avanzar.png");
		icon_sound = new ImageIcon(img_sound.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		botonAvanza.setIcon(icon_sound);
		add(botonAvanza);
	}

	public void manejarBotones(boolean valor) {
		
		this.botonAvanza.setEnabled(valor);
		this.botonPausa.setEnabled(valor);
		this.botonPlay.setEnabled(valor);
		this.botonRetrocede.setEnabled(valor);
		this.botonStop.setEnabled(valor);
	}

	public JButton getBotonStop() {
		return botonStop;
	}

	public void setBotonStop(JButton botonStop) {
		this.botonStop = botonStop;
	}

	public JButton getBotonRetrocede() {
		return botonRetrocede;
	}

	public void setBotonRetrocede(JButton botonRetrocede) {
		this.botonRetrocede = botonRetrocede;
	}

	public JButton getBotonAvanza() {
		return botonAvanza;
	}

	public void setBotonAvanza(JButton botonAvanza) {
		this.botonAvanza = botonAvanza;
	}

	public String getCOMMAND_PARAR() {
		return COMMAND_PARAR;
	}

	public String getCOMMAND_RETROCEDER() {
		return COMMAND_RETROCEDER;
	}

	public String getCOMMAND_AVANZAR() {
		return COMMAND_AVANZAR;
	}

	public JButton getBotonPlay() {
		return botonPlay;
	}

	public void setBotonPlay(JButton botonPlay) {
		this.botonPlay = botonPlay;
	}

	public JButton getBotonPausa() {
		return botonPausa;
	}

	public void setBotonPausa(JButton botonPausa) {
		this.botonPausa = botonPausa;
	}

	public ImageIcon getImg_sound() {
		return img_sound;
	}

	public void setImg_sound(ImageIcon img_sound) {
		this.img_sound = img_sound;
	}

	public Icon getIcon_sound() {
		return icon_sound;
	}

	public void setIcon_sound(Icon icon_sound) {
		this.icon_sound = icon_sound;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCOMMAND_REPRODUCIR() {
		return COMMAND_REPRODUCIR;
	}

	public String getCOMMAND_PAUSAR() {
		return COMMAND_PAUSAR;
	}

}
