package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Emisora;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private View vista;
	private Emisora emisora;
	
	public Controller() {
		vista=new View(this);
		emisora= new Emisora();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
