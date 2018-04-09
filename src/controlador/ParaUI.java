package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

import codigo.Dificultades;
import codigo.Tablero;
import utiles.Utiles;
import vista.ParejasUI;

public class ParaUI extends ParejasUI {

	Tablero tablerito = new Tablero();
	Desvelador desvelador = new Desvelador(tablerito);
	boolean bandera=false;

	public ParaUI() {

		facil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnJugar.setEnabled(true);
				tablerito.crearTablero(Dificultades.FACIL);

				crearBotonera(Dificultades.FACIL);

			}

		});
		medio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnJugar.setEnabled(true);
				tablerito.crearTablero(Dificultades.MEDIO);
				crearBotonera(Dificultades.MEDIO);

			}

		});
		dificil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnJugar.setEnabled(true);
				tablerito.crearTablero(Dificultades.DIFICIL);
				crearBotonera(Dificultades.DIFICIL);
			}
		});

		btnJugar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panelSeleccion.setVisible(false);
				panelJuego.setVisible(true);
			}
		});

	}

	// Alicia del futuro, aunque no haya errores mirate como poner bien los
	// botones de la botonera anda.
	// Necesitas que quede cuadrada y ademas que sea par
	private void crearBotonera(Dificultades dificultad) {
		int contador=0;
		
		for (int i = 0; i < dificultad.getLongitudTablero(); i++) {
			for (int j = 0; j < dificultad.getAnchoTablero(); j++) {
				botones[i][j] = new JButton();
				botones[i][j].setBackground(Color.getHSBColor(234, 243, 92));
				botonera.add(botones[i][j]); 
				botones[i][j].setName(contador+"");
				botones[i][j].setText(contador+1+"");
				contador++;			
			}
		}
		
		int[] cartaUno= new int[2];
		
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						((JButton) e.getSource()).setText("");	
//						se queda pillado...				desvelador.desvelarCarta(Utiles.convertirAPosicion(((JButton) e.getSource()), 1), Utiles.convertirAPosicion(((JButton) e.getSource()), 2));
										((JButton) e.getSource()).getName();	//Esta es la posición de la carta

						// si se pone a true, haremos lo de la carta 2

						boolean seleccionar = false;
						do {
							seleccionar = desvelador.seleccionarCarta(
									Utiles.convertirAPosicion(((JButton) e.getSource()), 0),
									Utiles.convertirAPosicion(((JButton) e.getSource()), 1));
							if (!bandera) {
								cartaUno[0] = Utiles.convertirAPosicion(((JButton) e.getSource()), 0);
								cartaUno[1] = Utiles.convertirAPosicion(((JButton) e.getSource()), 1);
							}
						} while (!seleccionar);

						bandera = !bandera;

						if (bandera) {
							if (tablerito.compararCartas(cartaUno[0], cartaUno[1],
									Utiles.convertirAPosicion(((JButton) e.getSource()), 0),
									Utiles.convertirAPosicion(((JButton) e.getSource()), 1))) {
								desvelador.desvelarCarta(cartaUno[0], cartaUno[1]); // deberia
																					// ser
																					// emparejar
																					// pero
																					// no
																					// hay
																					// metodo
								desvelador.desvelarCarta(Utiles.convertirAPosicion(((JButton) e.getSource()), 0),
										Utiles.convertirAPosicion(((JButton) e.getSource()), 1));

							}
						}

					}

								});
				
						/*((JButton) e.getSource()).setText("");	
						((JButton) e.getSource()).getName();	//Esta es la posición de la carta

						for (int k = 0; k < 2; k++) {
							boolean seleccionar=false;
							do{
								if(k==1){
									seleccionar=desvelador.seleccionarCarta(i,j);
								}
								else{
									seleccionar=desvelador.seleccionarCarta(i,j);
								}
							}while(!seleccionar);
						}
						
						//aqui poner todo lo que tenga que hacer la botonera
						for (int k = 0; k < 2; k++) {
							boolean seleccionar=false;
							do{
								if(k==1){
									int posicionCartaUno=Integer.parseInt(((JButton) e.getSource()).getName());
									seleccionar=desvelador.seleccionarCarta(posicionCartaUno);
								}
								else{
									int posicionCartaDos=Integer.parseInt(((JButton) e.getSource()).getName());
									seleccionar=desvelador.seleccionarCarta(posicionCartaDos);
								}
							}while(!seleccionar);
						}*/
			}
}

}

}
