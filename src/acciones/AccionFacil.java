package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import codigo.Dificultades;
import codigo.Tablero;
import vista.ParaUI;



public class AccionFacil implements ActionListener{
	
	private ParaUI paraUI;
	Tablero tablero = new Tablero();

	public AccionFacil(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) { //este crea el tablero en facil, habra otros dos para dificultad
		//y otro para el boton jugar
		//hasta ahi todo es relacionado con la vista
		//el ultimo sera para desvelar/emparejar
		// TODO Auto-generated method stub
		
		
		
	}

}
