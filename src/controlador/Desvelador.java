package controlador;

import codigo.Tablero;

public class Desvelador {

	Tablero tablerito;

	public Desvelador(Tablero tablero) {
		super();
		this.tablerito = tablero;
	}

	/**
	 * comprueba si una carta esta oculta (o emparejada, que tb estaria oculta)
	 * 
	 * @return si puede o no desvelarse
	 */
	public boolean comprobarDesvelada(int posicionUno, int posicionDos) {

		return tablerito.getCartas()[posicionUno][posicionDos].isOculta();
	}

	/**
	 * 
	 * @return si esta o no emparejada
	 */
	public boolean comprobarEmparejada(int posicionUno, int posicionDos) {
		return tablerito.getCartas()[posicionUno][posicionDos].isEmparejada();
	}

	/**
	 * Pone la carta en oculta o desvelada
	 */
	public void desvelarCarta(int posicionUno, int posicionDos) {
		this.tablerito.getCartas()[posicionUno][posicionDos].setEmparejada();
	}
	
	/**
	 * para seleccionar la carta
	 * @param posicion
	 * @return
	 */
	public boolean seleccionarCarta(int posicionUno, int posicionDos){
		return tablerito.seleccionarCarta(posicionUno,posicionDos);
	}
	
}
