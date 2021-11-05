import java.util.Random;

public class AparatoConModalidad extends Aparato {
	
	private String[] modalidades;
	private String modalidadActual;
	
	public AparatoConModalidad(String nombre, String marca, String[] modalidades) {
		super(nombre, marca);
		this.modalidades = modalidades;
	}

	@Override
	public String encender() {
		Random ran = new Random();
		int aleatorio = ran.nextInt(modalidades.length);
		this.modalidadActual = modalidades[aleatorio];
		return super.encender() + " modalidad " + modalidadActual;
	}
	

	@Override
	public String apagar() {
		return super.apagar();	
	}
	

}
