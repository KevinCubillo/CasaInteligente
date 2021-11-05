import java.util.Random;


public class AparatoConSenal extends Aparato {
	private float[] senales;
	private float senalActual;
	
	public AparatoConSenal(String nombre, String marca, float[] senales) {
		super(nombre, marca);
		this.senales = senales;
	}

	@Override
	public String encender() {
		Random ran = new Random();
		int aleatorio = ran.nextInt(senales.length);
		this.senalActual = senales[aleatorio];
		return super.encender() + " señal actual "+ senalActual;
		
	}

	@Override
	public String apagar() {
		return super.apagar();
		
	}
	
	
}
