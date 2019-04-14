package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/* --module-path /home/solid/Desktop/Studies/38-Java/javafx-sdk-11.0.2/lib --add-modules=javafx.fxml,javafx.controls*/

public class Main extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	 
	
	public static void main(String[] args) {
		launch(args);
	}
}
