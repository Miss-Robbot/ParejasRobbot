package codigo;

public class Tablero implements Tableable{

	private Carta [] cartas;
	private boolean ganador;
	
	public Tablero(){
		this.setGanador(false);
	}
	public Tablero(Carta[] cartas, boolean ganador) {
		super();
		this.cartas = cartas;
		this.setGanador(ganador);
	}

	@Override
	public void crearTablero(Dificultades dificultad) {
		for (int i = 0; i < dificultad.getTamaño(); i++) {//Carta[] es solo un array
			
		}
		
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
				
		return false;
	}
	
	public boolean isGanador() {
		return ganador;
	}
	
	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}
	
	
}