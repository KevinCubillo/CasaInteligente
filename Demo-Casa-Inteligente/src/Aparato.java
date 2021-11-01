
public abstract class Aparato implements Interruptor {

	private static int contadorAparatos = 0;
	private String nombre;
	private String marca;
	private Boolean estado;
	private int id;
	
	
	
	public Aparato(String nombre, String marca) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.estado = false;
		this.id = ++contadorAparatos;
	}


	@Override
	public String toString() {
		String texto = id + " " + nombre + " " + marca;
		if(estado) {
			texto += "[ on ]";
			
		}else {
			texto += "[ off ]";
		}
		return texto;
	}
	
	public String encender(){
		this.estado = true;
		return toString();
	}
	
	public String apagar() {
		this.estado = false;
		return toString();
	}
	
	
	
	
}
