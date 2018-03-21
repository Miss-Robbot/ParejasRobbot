package codigo;

public enum Dificultades {

	FACIL(4),MEDIO(12),DIFICIL(16);
	private int longitudTablero;

	private Dificultades(int longitudTablero)
	{
		this.longitudTablero=longitudTablero;
	}
	public int getLongitudTablero() {
		return longitudTablero;
	}
	
	
	
}
