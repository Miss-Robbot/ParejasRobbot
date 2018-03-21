package vista;

import javax.swing.JPanel;

import codigo.Dificultades;

import javax.swing.JButton;

public class Botonera extends JPanel {
	//necesito o el tablero.length o la dificultad para el tamaño de la botonera

	public JButton botones[][];
	int anchoPanel = 150, altoPanel = 150;
	int altoBoton = 70;
	int anchoBoton=30;

	/**
	 * Create the panel.
	 */
	public Botonera(int x, int y, Dificultades dificultad) {
		setLayout(null);
		this.setBounds(x, y, this.anchoPanel, this.altoPanel);
		iniciarBotonera(dificultad);
	}

	private void iniciarBotonera(Dificultades dificultad) {
		this.botones = new JButton[dificultad.getFilas()][dificultad.getColumnas()]; //queda mejor:  3*4(medio) 4*6(dificil) 2*3(facil)
		int x = 0, y = 0;
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(String.valueOf(i) + String.valueOf(j));
				this.botones[i][j].setBounds(x, y, this.anchoBoton, this.altoBoton);
				this.add(this.botones[i][j]);
				x += this.anchoBoton;
			}
			x = 0;
			y += this.altoBoton;
		}
	}
}