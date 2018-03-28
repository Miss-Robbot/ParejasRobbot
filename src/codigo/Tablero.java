package codigo;

import java.util.Random;

public class Tablero implements Tableable{
	
	private Carta[] cartas;
	private boolean ganador;
	private int[] sacoDeNumeros={1,1,2,2,3,3,4,4,5,5}; //con esto intentare hacer el sorteo de los numeros
	
	private void cortarSaco(Dificultades dificultad){
		int[] numeros = new int[dificultad.getTamaño()*2]; 
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=sacoDeNumeros[i];
		}
		desordenarNumeros(numeros);
	}
	
	private void desordenarNumeros(int[] numeros){ //voy en orden y les asigno una posicion aleatoria, intercambiandolos
	
		for (int i = 0; i < numeros.length; i++) {
			Random aleatorio = new Random(System.currentTimeMillis());
			numeros[aleatorio.nextInt(numeros.length)]=numeros[i];
			numeros[i]=numeros[aleatorio.nextInt(numeros.length)];
		}
	}
	
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