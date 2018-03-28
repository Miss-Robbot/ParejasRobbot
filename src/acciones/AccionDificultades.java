package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import vista.ParaUI;

public class AccionDificultades implements ActionListener{
	
	private ParaUI paraUI;

	public AccionDificultades(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//crear tablero en modo facil
		//setEnabled(true), no va..
		
		
	}

}
