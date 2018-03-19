package climbingv01;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Juego {
	public void jugar(Stage Stage1) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Climbingv01.fxml"));
			Scene scene1 = new Scene(root);
			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage1.setResizable(false);
			Stage1.setScene(scene1);
			Stage1.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}