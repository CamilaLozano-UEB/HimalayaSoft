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
	private JButton botonPlay;
	private JButton botonPausa;
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
		botonPausa.setBackground(new Color(162, 118, 234));

		botonPlay = new JButton();
		botonPlay.setBorder(null);
		botonPlay.setOpaque(true);
		botonPlay.setBackground(new Color(162, 118, 234));
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
		img_sound = new ImageIcon("./Imagenes/SinSonido.png");
		icon_sound = new ImageIcon(img_sound.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		botonPausa.setIcon(icon_sound);
		add(botonPausa);

		img_sound = new ImageIcon("./Imagenes/Sonido.png");
		icon_sound = new ImageIcon(img_sound.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		botonPlay.setIcon(icon_sound);
		add(botonPlay);
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

}
