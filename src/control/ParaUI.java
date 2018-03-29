package control;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

import acciones.AccionBoton;
import acciones.AccionCartas;
import acciones.AccionDificultades;
import codigo.Dificultades;
import codigo.Tablero;
import vista.ParejasUI;

public class ParaUI extends ParejasUI{
	
	Tablero tablerito = new Tablero();
	AccionDificultades listenD = new AccionDificultades(this);
	AccionCartas listenC = new AccionCartas(this);
	AccionBoton listenB = new AccionBoton(this);

	public ParaUI(){
		
		//actionlistener averigurselas para acceder a los botones de las nzrices
		//por parametro tiene problemas
		
		// primero los listener se encargan de crear el tablero que toque y se puede pulsar el boton jugar
		//en el AL del boton jugar se ca,bia de panel (cambiar visibilidad)
		
		//finalmente implementar el AL de los botones
		
		//tablerito.seleccionarCarta(arg0¿?) situar posicion
		
		
		
		
		
		
		
		
	}

}
