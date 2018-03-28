package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import control.ParaUI;

public class AccionBoton implements ActionListener{
	
	private ParaUI paraUI;

	public AccionBoton (ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//poner invisible el panelSeleccion y visibilizar el panelJuego
		
	}

}
