package codigo;

public class Tablero implements Tableable{

	private Carta [] cartas;
	private boolean ganador;
	
	public Tablero(){
		this.ganador=false;
	}
	public Tablero(Carta[] cartas, boolean ganador) {
		super();
		this.cartas = cartas;
		this.ganador = ganador;
	}

	@Override
	public void crearTablero(Dificultades dificultad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean seleccionarCarta(int posicion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean compararCartas(int posUno, int posDos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comprobarGanador() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}

