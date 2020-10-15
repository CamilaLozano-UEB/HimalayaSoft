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
	private JButton botonSonido;
	private JButton botonSonido_2;
	private ImageIcon img_sound;
	private Icon icon_sound;

	public PanelReproduccion() {
		setLayout(new GridLayout(1,2));
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
		botonSonido_2 = new JButton();
		botonSonido_2.setBorder(null);
		botonSonido_2.setOpaque(true);
		botonSonido_2.setBackground(new Color(162, 118, 234));

		botonSonido = new JButton();
		botonSonido.setBorder(null);
		botonSonido.setOpaque(true);
		botonSonido.setBackground(new Color(162, 118, 234));
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
		botonSonido_2.setIcon(icon_sound);
		add(botonSonido_2);

		img_sound = new ImageIcon("./Imagenes/Sonido.png");
		icon_sound = new ImageIcon(img_sound.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		botonSonido.setIcon(icon_sound);
		add(botonSonido);
	}

	public JButton getBotonSonido() {
		return botonSonido;
	}

	public void setBotonSonido(JButton botonSonido) {
		this.botonSonido = botonSonido;
	}

	public JButton getBotonSonido_2() {
		return botonSonido_2;
	}

	public void setBotonSonido_2(JButton botonSonido_2) {
		this.botonSonido_2 = botonSonido_2;
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
