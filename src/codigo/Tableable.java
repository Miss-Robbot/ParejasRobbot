package codigo;

public interface Tableable {
	
	/**
	 * Coge la dificultad del desplegable y crea el tablero con forma de matriz pero que se trata como si fuera un array.
	 * Además, debe crearse con las parejas (tanto imagen como el número asignado) dentro de este.
	 * @param dificultad
	 */
	public void crearTablero(Dificultades dificultad);
	
	/**
	 * Selecciona una carta solo si está oculta. Además, pondrá la carta en desvelada(!oculta)
	 * @param posicion
	 * @return
	 */
	public boolean seleccionarCarta(int posicion);
	
	/**
	 * Compara las dos cartas seleccionadas para ver si el número que tienen dentro es el mismo. Si son distintas, cambiarán
	 * las cartas a modo oculto.
	 * @param posUno
	 * @param posDos
	 * @return
	 */
	public boolean compararCartas(int posUno, int posDos);
	
	/**
	 * Comprueba que no haya cartas ocultas en el tablero.
	 * @return
	 */
	public boolean comprobarGanador();
	
}
