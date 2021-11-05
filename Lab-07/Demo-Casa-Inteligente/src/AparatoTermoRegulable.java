
public class AparatoTermoRegulable extends Aparato {
	
	private int temperaturaMinima;
	private int temperaturaMaxima;
	private int temperaturaActual;
	
	
	public AparatoTermoRegulable(String nombre, String marca, int temperaturaMinima, int temperaturaMaxima) {
		super(nombre, marca);
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
	}

	@Override
	public String encender() {
		this.temperaturaActual = (temperaturaMinima+temperaturaMaxima)/2;
		return super.encender() + " con temperatura de " + temperaturaActual + " grados";
	}


	@Override
	public String apagar() {
		 return super.apagar();
	}
	
	

}
