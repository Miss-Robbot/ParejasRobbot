package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import control.ParaUI;

public class AccionDificultades implements ActionListener{
	
	private ParaUI paraUI;

	public AccionDificultades(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//setEnabled(true), no va..
		if (((JMenuItem) arg0.getSource()).getName() == "facil") {
			//crear tablero en modo facil
			//podria funcionar un pseudoMain
		}else if (((JMenuItem) arg0.getSource()).getName() == "medio") {
			
		}else{
			
		}
		
	}

}
