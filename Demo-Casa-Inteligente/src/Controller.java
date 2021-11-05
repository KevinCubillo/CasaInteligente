import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private TextField screen;
	JSONParser parser = new JSONParser();
	Controlador controlador = parser.cargarAparatos();
	
	
	public void encender1(ActionEvent event){
		screen.setText(controlador.get(0).encender());
	}
	public void apagar1(ActionEvent event){
		screen.setText(controlador.get(0).apagar());
	}
	
	
	
	public void encender2(ActionEvent event){
		screen.setText(controlador.get(1).encender());
	}
	public void apagar2(ActionEvent event){
		screen.setText(controlador.get(1).apagar());
	}
	
	
	
	public void encender3(ActionEvent event){
		screen.setText(controlador.get(2).encender());
	}
	public void apagar3(ActionEvent event){
		screen.setText(controlador.get(2).apagar());
	}
	
	
	public void encender4(ActionEvent event){
		screen.setText(controlador.get(3).encender());
	}
	public void apagar4(ActionEvent event){
		screen.setText(controlador.get(3).apagar());
	}
	
	
	public void encender5(ActionEvent event){
		screen.setText(controlador.get(4).encender());
	}
	public void apagar5(ActionEvent event){
		screen.setText(controlador.get(4).apagar());
	}
	
	
	public void encender6(ActionEvent event){
		screen.setText(controlador.get(5).encender());
	}
	public void apagar6(ActionEvent event){
		screen.setText(controlador.get(5).apagar());
	}
	
	
	public void encender7(ActionEvent event){
		screen.setText(controlador.get(6).encender());
	}
	public void apagar7(ActionEvent event){
		screen.setText(controlador.get(6).apagar());
	}
	
	
	public void encender8(ActionEvent event){
		screen.setText(controlador.get(7).encender());
	}
	public void apagar8(ActionEvent event){
		screen.setText(controlador.get(7).apagar());
	}
	
	
	public void encender9(ActionEvent event){
		screen.setText(controlador.get(8).encender());
	}
	public void apagar9(ActionEvent event){
		screen.setText(controlador.get(8).apagar());
	}
	
	
	public void encender10(ActionEvent event){
		screen.setText(controlador.get(9).encender());
	}
	public void apagar10(ActionEvent event){
		screen.setText(controlador.get(9).apagar());
	}
	
}


