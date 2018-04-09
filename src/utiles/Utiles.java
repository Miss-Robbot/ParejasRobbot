package utiles;

import javax.swing.JButton;

import codigo.Dificultades;
import codigo.Tablero;


public class Utiles {
	Tablero tablerito;
	public static int [] matriz;
	
	public int aleatorio(int maximo)
	{
		return (int)Math.random()*maximo;
	}
	
	public static int convertirAPosicion(JButton boton, int numero) {

		String[]coordenada = boton.getName().split(",");
		
		int[] posicion = new int[2];

		posicion[0]=Integer.parseInt(coordenada[0]);
	
		posicion[1]=Integer.parseInt(coordenada[1]);
	
		if(numero==1){
			return posicion[0];
		}else{
			return posicion[1];
		}
		
}

}
