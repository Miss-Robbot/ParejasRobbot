package codigo;

public enum Dificultades {

	FACIL(3),MEDIO(4),DIFICIL(5);
	
	
	public int getTama�o() {
		return tama�o;
	}

	private int tama�o;

	private Dificultades(int tama�o)
	{
		this.tama�o=tama�o;
		
	}
	
	
	
	
}