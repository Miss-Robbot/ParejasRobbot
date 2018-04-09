package codigo;

public enum Dificultades {

	FACIL(2,2),MEDIO(4,4),DIFICIL(5,5);
	private int longitudTablero;
	private int anchoTablero;

	private Dificultades(){
		this.longitudTablero=2;
		this.anchoTablero=2;
	}
	private Dificultades(int longitudTablero, int anchoTablero)
	{
		this.longitudTablero=longitudTablero;
		this.anchoTablero=anchoTablero;
	}
	public int getLongitudTablero() {
		return longitudTablero;
	}
	public int getAnchoTablero() {
		return anchoTablero;
	}

}
