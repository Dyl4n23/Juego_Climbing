package climbingv01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable; 


public class Climbingv01Controller implements Initializable {
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML public void botonJugar(){
		System.out.println("Jugar");
	
	}
	@FXML public void botonSalir(){
		System.exit(0);
	}
}
