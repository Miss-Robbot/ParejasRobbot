package codigo;

public class Carta implements Carteable{

	private boolean oculta;
	private boolean emparejada;
	private int numero;
	
	public Carta() {
		super();
		this.oculta = true;
		this.emparejada = false;
		this.numero=0;
	}

	@Override
	public void desvelarCarta() {
		this.oculta=!oculta;
	}

	@Override
	public void setEmparejada() {
		this.emparejada=!emparejada;
	}

	@Override
	public boolean isEmparejada() {
		return emparejada;
	}

	@Override
	public boolean isOculta() {
		return oculta;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
