package codigo;

public class Carta implements Carteable{

	private boolean oculta=true;
	private boolean emparejada=false;
	

	@Override
	public void desvelarCarta() {
		oculta=false;
		
	}

	@Override
	public void setEmparejada() {
		oculta=false;
		emparejada=true;
		
	}

	@Override
	public boolean isEmparejada() {
		return emparejada;
	}

	@Override
	public boolean isOculta() {
		return oculta;
	}
	
	
}
