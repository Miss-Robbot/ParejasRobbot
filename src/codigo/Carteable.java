package codigo;

public interface Carteable {

	/**
	 * Cambia el estado de Oculto de carta. Si est� oculto lo desvela y si est� desvelado lo oculta.
	 */
	public void desvelarCarta();
		//assert carta seleccionada!=null;
	
	/**
	 * Cambia emparejada a true. Una vez que emparejada est� a true no puede volver a ser false.
	 */
	public void setEmparejada();
	
	/**
	 * Te dice si una carta est� o no emparejada
	 * @return
	 */
	public boolean isEmparejada();
	
	/**
	 * Te dice si una carta est� o no oculta
	 * @return
	 */
	public boolean isOculta();
}
