import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root=
		FXMLLoader.load(getClass().getResource("Casa.fxml"));
		primaryStage.setTitle("Casa inteligente");
		Scene scene = new Scene(root, 1040, 716);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}	
	
	