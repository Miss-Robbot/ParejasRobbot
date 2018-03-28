package codigo;

public class Tablero implements Tableable{
	
	private Carta[] cartas;
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
		cartas = new Carta[dificultad.getTamaño()];
		for (int i = 0; i < dificultad.getTamaño(); i++) {//Carta[] es solo un array
			cartas[i] = new Carta();
		}
		
	}

	@Override
	public boolean seleccionarCarta(int posicion) {
		if(cartas[posicion].isOculta()){//lo he puesto para que cuando se empareje tambien conste como que esta oculta
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public boolean compararCartas(int posUno, int posDos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comprobarGanador() {
		ganador=true;
		for (int i = 0; i < cartas.length; i++) {
			if(!cartas[i].isEmparejada()){
				ganador=false;
			}
		}
		return ganador;
	}
	
	public boolean isGanador() {
		return ganador;
	}
	
	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}
	
	
}