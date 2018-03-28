package test;

import static org.junit.Assert.*;

import org.junit.Test;

import codigo.Carta;
import codigo.Dificultades;
import codigo.Tablero;

public class TableroTest {
	Dificultades dificultad;
	
	@Test
	public void CrearTableroTest() {
		Carta [] cartasFacil= new Carta [4];
		Tablero tableroFacil= new Tablero(cartasFacil, false);
		Tablero tableroDosFacil= new Tablero();
		tableroDosFacil.crearTablero(dificultad.FACIL);
		assertTrue(tableroFacil.equals(tableroDosFacil));
		
		Carta [] cartasMedio= new Carta [12];
		Tablero tableroMedio= new Tablero(cartasMedio, false);
		Tablero tableroDosMedio= new Tablero();
		tableroDosMedio.crearTablero(dificultad.MEDIO);
		assertTrue(tableroMedio.equals(tableroDosMedio));
		
		Carta [] cartasDificil= new Carta [16];
		Tablero tableroDificil= new Tablero(cartasDificil, false);
		Tablero tableroDosDificil= new Tablero();
		tableroDosDificil.crearTablero(dificultad.DIFICIL);
		assertTrue(tableroDificil.equals(tableroDosDificil));
		
	}
	
	
	
	

}
