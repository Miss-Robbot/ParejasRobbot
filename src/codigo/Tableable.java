package codigo;

public interface Tableable {
	
	/**
	 * Coge la dificultad del desplegable y crea el tablero con forma de matriz pero que se trata como si fuera un array.
	 * Adem�s, debe crearse con las parejas (tanto imagen como el n�mero asignado) dentro de este.
	 * @param dificultad
	 */
	public void crearTablero(Dificultades dificultad);
	
	/**
	 * Selecciona una carta solo si est� oculta. Adem�s, pondr� la carta en desvelada(!oculta)
	 * @param posicion
	 * @return
	 */
	public boolean seleccionarCarta(int posicion);
		//assert Carta!=null;
	/**
	 * Compara las dos cartas seleccionadas para ver si el n�mero que tienen dentro es el mismo. Si son distintas, cambiar�n
	 * las cartas a modo oculto.
	 * @param posUno
	 * @param posDos
	 * @return
	 */
	public boolean compararCartas(int posUno, int posDos);
		//assert CartaUno!=null CartaDos!=null;
	/**
	 * Comprueba que no haya cartas ocultas en el tablero.
	 * @return
	 */
	public boolean comprobarGanador();
}
