package codigo;

public enum Dificultades {

	FACIL(2,3),MEDIO(3,4),DIFICIL(4,6);
	
	
	public int getFilas() {
		return filas;
	}

	public int getColumnas() {
		return columnas;
	}

	private int filas,columnas;

	private Dificultades(int filas, int columnas)
	{
		this.filas=filas;
		this.columnas=columnas;
	}
	
	
	
	
}