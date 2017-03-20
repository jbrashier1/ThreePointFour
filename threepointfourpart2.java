import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
/**
 * Author: Jack Brashier
 * Date: 3/19/2017
 * Purpose: To show understanding of nested loops.
 */
public class threepointfourpart2 extends Application {
	@Override

    public void start(Stage primaryStage) {

	String trueUser = "jbrashier";
	String truePass = "compsci";

	Alert lockOut = new Alert(AlertType.INFORMATION);
	lockOut.setTitle("Login");
	lockOut.setHeaderText("Too many failed attempts:");
	lockOut.setContentText("Please contact the admin for assistance");

	for (int i = 3; i > 0; i--) {
		TextInputDialog userReader = new TextInputDialog();
        	userReader.setTitle("Login");
        	userReader.setHeaderText("Input Username and Password:");
        	userReader.setContentText("Username:");
        	userReader.showAndWait();

        	TextInputDialog passReader = new TextInputDialog();
        	passReader.setTitle("Login");
        	passReader.setHeaderText("Input Username and Password:");
        	passReader.setContentText("Password:");
        	passReader.showAndWait();
		if ((userReader.getResult()).equals(trueUser)) { 
			if ((passReader.getResult()).equals(truePass)) {
				Alert welcome = new Alert(AlertType.INFORMATION);
				welcome.setTitle("Login");
				welcome.setHeaderText("Welcome");
				welcome.setContentText("Welcome, " + trueUser + "!");
				welcome.showAndWait();
				System.exit(0);
			} else { 
				Alert wrongPass = new Alert(AlertType.INFORMATION);
				wrongPass.setTitle("Login");
				wrongPass.setHeaderText("There was an issue logging in:");
				wrongPass.setContentText("The password you entered was incorrect");
				wrongPass.showAndWait();
				if (i == 1) {
					lockOut.showAndWait();
				}
			}
		} else {
			Alert wrongUser = new Alert(AlertType.INFORMATION);
			wrongUser.setTitle("Login");
			wrongUser.setHeaderText("There was an issue logging in:");
			wrongUser.setContentText("The username you entered was not recognized");
			wrongUser.showAndWait();
			if (i == 1) { 
				lockOut.showAndWait();
			}	
		}
	}
    }
}

