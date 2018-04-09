package test;

import static org.junit.Assert.*;

import org.junit.Test;

import codigo.Carta;
import codigo.Dificultades;
import codigo.Tablero;

public class TableroTest {
	Dificultades dificultad;
	Tablero tablero= new Tablero();
	
	@Test
	public void CrearTableroTest() {
		Carta [] cartasFacil= new Carta [4];
		//Tablero tableroFacil= new Tablero(cartasFacil, false);
		tablero.crearTablero(dificultad.FACIL);
	//	assertTrue(tableroFacil.equals(tablero));
		
		Carta [] cartasMedio= new Carta [12];
		//Tablero tableroMedio= new Tablero(cartasMedio, false);
		
		tablero.crearTablero(dificultad.MEDIO);
		//assertTrue(tableroMedio.equals(tablero));
		
		Carta [] cartasDificil= new Carta [16];
	//	Tablero tableroDificil= new Tablero(cartasDificil, false);
		tablero.crearTablero(dificultad.DIFICIL);
	//	assertTrue(tableroDificil.equals(tablero));
		
	}
	
	@Test
	public void seleccionarCartaTest()
	{
		//assertTrue(tablero.seleccionarCarta(0));
	}
	
	@Test
	public void compararCartasTest(){
		//assertTrue(tablero.compararCartas(0, 1));
	}
	
	@Test
	public void comprobarGanador(){
		assertFalse(tablero.comprobarGanador());
		tablero.setGanador(true);
		assertTrue(tablero.comprobarGanador());
	}

}
