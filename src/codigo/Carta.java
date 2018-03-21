package codigo;

public class Carta implements Carteable{

	private boolean oculta;
	private boolean emparejada;
	
	public Carta(boolean oculta, boolean emparejada) {
		super();
		this.oculta = oculta;
		this.emparejada = emparejada;
	}

	@Override
	public void desvelarCarta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmparejada() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmparejada() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOculta() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
