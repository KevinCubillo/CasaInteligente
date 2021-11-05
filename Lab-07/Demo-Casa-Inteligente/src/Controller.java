
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {
	
	JSONParser parser = new JSONParser();
	Controlador controlador = parser.cargarAparatos();
	
	@FXML
	private TextField screen;
	@FXML
	private ImageView boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10;
	
	private File botonVerde = new File("resources/botonVerde.png");
	private File botonRojo = new File("resources/botonRojo.png");
	private InputStream isImage;
	

	public void encender1(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonVerde);
		boton1.setImage(new Image(isImage));
		screen.setText(controlador.get(0).encender());
	}

	public void apagar1(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonRojo);
		boton1.setImage(new Image(isImage));
		screen.setText(controlador.get(0).apagar());
	}
	
	public void encender2(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonVerde);
		boton2.setImage(new Image(isImage));
		screen.setText(controlador.get(1).encender());
	}
	public void apagar2(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonRojo);
		boton2.setImage(new Image(isImage));
		screen.setText(controlador.get(1).apagar());
	}
	
	
	public void encender3(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonVerde);
		boton3.setImage(new Image(isImage));
		screen.setText(controlador.get(2).encender());
	}
	public void apagar3(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonRojo);
		boton3.setImage(new Image(isImage));
		screen.setText(controlador.get(2).apagar());
	}
	
	
	public void encender4(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonVerde);
		boton4.setImage(new Image(isImage));
		screen.setText(controlador.get(3).encender());
	}
	public void apagar4(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonRojo);
		boton4.setImage(new Image(isImage));
		screen.setText(controlador.get(3).apagar());
	}
	
	
	public void encender5(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonVerde);
		boton5.setImage(new Image(isImage));
		screen.setText(controlador.get(4).encender());
	}
	public void apagar5(ActionEvent event) throws FileNotFoundException{ 
		isImage = (InputStream) new FileInputStream(botonRojo);
		boton5.setImage(new Image(isImage));
		screen.setText(controlador.get(4).apagar());
	}
	
	
	public void encender6(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonVerde);
		boton6.setImage(new Image(isImage));
		screen.setText(controlador.get(5).encender());
	}
	public void apagar6(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonRojo);
		boton6.setImage(new Image(isImage));
		screen.setText(controlador.get(5).apagar());
	}
	
	
	public void encender7(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonVerde);
		boton7.setImage(new Image(isImage));
		screen.setText(controlador.get(6).encender());
	}
	public void apagar7(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonRojo);
		boton7.setImage(new Image(isImage));
		screen.setText(controlador.get(6).apagar());
	}
	
	
	public void encender8(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonVerde);
		boton8.setImage(new Image(isImage));
		screen.setText(controlador.get(7).encender());
	}
	public void apagar8(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonRojo);
		boton8.setImage(new Image(isImage));
		screen.setText(controlador.get(7).apagar());
	}
	
	
	public void encender9(ActionEvent event)throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonVerde);
		boton9.setImage(new Image(isImage));
		screen.setText(controlador.get(8).encender());
	}
	public void apagar9(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonRojo);
		boton9.setImage(new Image(isImage));
		screen.setText(controlador.get(8).apagar());
	}
	

	public void encender10(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonVerde);
		boton10.setImage(new Image(isImage));
		screen.setText(controlador.get(9).encender());
	}
	public void apagar10(ActionEvent event) throws FileNotFoundException{
		isImage = (InputStream) new FileInputStream(botonRojo);
		boton10.setImage(new Image(isImage));
		screen.setText(controlador.get(9).apagar());
	}
	
	public void encenderTodo() throws FileNotFoundException{
		for(int i=0; i<controlador.size(); i++) {
			controlador.get(i).encender();
		}
		isImage = (InputStream) new FileInputStream(botonVerde);
		Image image = new Image(isImage);
		boton1.setImage(image);
		boton2.setImage(image);
		boton3.setImage(image);
		boton4.setImage(image);
		boton5.setImage(image);
		boton6.setImage(image);
		boton7.setImage(image);
		boton8.setImage(image);
		boton9.setImage(image);
		boton10.setImage(image);
		screen.setText("Todos los electrodomésticos están encendidos");
	}
	
	public void apagarTodo() throws FileNotFoundException{
		for(int i=0; i<controlador.size(); i++) {
			controlador.get(i).apagar();
		}
		isImage = (InputStream) new FileInputStream(botonRojo);
		Image image = new Image(isImage);
		boton1.setImage(image);
		boton2.setImage(image);
		boton3.setImage(image);
		boton4.setImage(image);
		boton5.setImage(image);
		boton6.setImage(image);
		boton7.setImage(image);
		boton8.setImage(image);
		boton9.setImage(image);
		boton10.setImage(image);
		screen.setText("Todos los electrodomésticos están apagados");
	}
	
}


