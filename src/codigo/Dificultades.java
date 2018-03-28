package codigo;

public enum Dificultades {

	FACIL(3),MEDIO(4),DIFICIL(5);
	
	
	public int getTamaño() {
		return tamaño;
	}

	private int tamaño;

	private Dificultades(int tamaño)
	{
		this.tamaño=tamaño;
		
	}
	
	
	
	
}