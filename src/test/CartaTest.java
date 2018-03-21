package test;

import static org.junit.Assert.*;

import org.junit.Test;

import codigo.Carta;

public class CartaTest {

	@Test
	public void desvelarCartaTest() {
		Carta carta = new Carta(true,true);
		carta.desvelarCarta();
		assertFalse(carta.isOculta());
		carta.desvelarCarta();
		assertTrue(carta.isOculta());
	}
	
	@Test
	public void setEmparejadaTest(){
		Carta carta = new Carta(true,true);
		carta.setEmparejada();
		assertFalse(carta.isEmparejada());
		carta.setEmparejada();
		assertTrue(carta.isEmparejada());
	}
	
	@Test
	public void isEmparejadaTest()
	{
		Carta carta = new Carta(true,true);
		assertTrue(carta.isEmparejada());
	}
	
	@Test
	public void isOcultaTest()
	{
		Carta carta = new Carta(true,true);
		assertTrue(carta.isOculta());
	}

}
