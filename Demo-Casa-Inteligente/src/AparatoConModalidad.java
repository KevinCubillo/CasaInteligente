
public class AparatoConModalidad extends Aparato {
	
	private String[] modalidades;
	private String modalidadActual;
	
	public AparatoConModalidad(String nombre, String marca, String[] modalidades) {
		super(nombre, marca);
		this.modalidades = modalidades;
	}

	@Override
	public String encender() {
		this.modalidadActual = modalidades[0];
		return super.encender() + " modalidad " + modalidadActual;
	}
	

	@Override
	public String apagar() {
		return super.apagar();	
	}
	

}
