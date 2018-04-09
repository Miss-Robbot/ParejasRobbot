package codigo;

import javax.swing.text.StyledEditorKit.AlignmentAction;

import utiles.Utiles;
import codigo.Dificultades;
public class Prueba {

	Utiles util;
	
	public static void main(String[] args) {
		
		/*Carta [] cartas= new Carta [12];
		int parejas=12/2;
		int numero=1;
		for (int i = 0; i < cartas.length; i++) {
			cartas[i]= new Carta();
			cartas[i].setNumero(numero);
			numero++;
			if(numero==parejas+1)
			{
				numero=1;
			}
		}
		
		int posicionPrimera=0, posicionFinal=0, numeroCartaIntermedia=0;
		
		for (int i = 0; i < 100; i++) {
			posicionPrimera= aleatorio(cartas.length);
			posicionFinal=aleatorio(cartas.length);
			numeroCartaIntermedia=cartas[posicionPrimera].getNumero();
			cartas[posicionPrimera].setNumero(cartas[posicionFinal].getNumero());
			cartas[posicionFinal].setNumero(numeroCartaIntermedia);
		}
		
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i].getNumero());
		}
	}
	
	public static int aleatorio(int maximo)
	{
		return ((int)(Math.random()* maximo));
	}*/
		
	Dificultades dificultad;
	Tablero tablero= new Tablero();
	//tablero.crearTablero(dificultad);
}
}
