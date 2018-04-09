package codigo;

import utiles.Utiles;

public class Tablero implements Tableable{

	private Carta [] [] cartas;
	private boolean ganador;
	
	public Tablero(){
		this.ganador=false;
	}
	public Tablero(Carta[][] cartas, boolean ganador) {
		super();
		this.cartas = cartas;
		this.ganador = ganador;
	}

	@Override
	public void crearTablero(Dificultades dificultad) {
		this.cartas= new Carta [dificultad.getLongitudTablero()][dificultad.getAnchoTablero()];
		distribuirParejas(dificultad);
		desOrdenarParejas();
	}

	private void distribuirParejas(Dificultades dificultad)
	{
		int parejas=(dificultad.getLongitudTablero()*dificultad.getAnchoTablero())/2;
		int numero=1;
		for (int i = 0; i < cartas.length; i++) {
			for (int j = 0; j < cartas[i].length; j++) {
				this.cartas[i][j]= new Carta();
				this.cartas[i][j].setNumero(numero);
				numero++;
				if(numero==parejas+1)
				{
					numero=1;
				}
			}
			
		}
		
	}
	
	private void desOrdenarParejas()
	{
		Utiles util= new Utiles();
		int posiUno=0, posiFinal=0, numeroCartaIntermedia=0,posjUno=0,posjFinal=0;
		for (int i = 0; i < 100; i++) {
			posiUno= util.aleatorio(this.cartas.length);
			posiFinal=util.aleatorio(this.cartas.length);
			numeroCartaIntermedia=cartas[posiUno][posjUno].getNumero();
			this.cartas[posiUno][posjUno].setNumero(cartas[posiFinal][posjFinal].getNumero());
			this.cartas[posiFinal][posjFinal].setNumero(numeroCartaIntermedia);
		}
	}
	
	@Override
	public boolean seleccionarCarta(int posicionUno, int posicionDos) {
		if(!this.cartas[posicionUno][posicionDos].isEmparejada())
		{
			if(this.cartas[posicionUno][posicionDos].isOculta())
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean compararCartas(int posicionUnoCartaUno,int posicionDosCartaUno, int posicionUnoCartaDos, int posicionDosCartaDos) {
		if(this.cartas[posicionUnoCartaUno][posicionDosCartaUno].getNumero()==this.cartas[posicionUnoCartaDos][posicionDosCartaDos].getNumero())
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean comprobarGanador() {
		for (int i = 0; i < cartas.length; i++) {
			for (int j = 0; j < cartas[i].length; j++) {
				if(this.cartas[i][j].isOculta())
				{
					return false;
				}
			}
		}
		return true;
	}
	public Carta[][] getCartas() {
		return cartas;
	}
	public void setCartas(Carta[][] cartas) {
		this.cartas = cartas;
	}
	public boolean isGanador() {
		return ganador;
	}
	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}
	
	
}

