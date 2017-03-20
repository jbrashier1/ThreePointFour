import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
/**
 * Name: Jack Brashier
 * Date: 3/19/2017
 * Purpose: To demonstrate understanding of nested if and if else statements.
 */
public class threepointfour extends Application {
	@Override

    public void start(Stage primaryStage) {
	TextInputDialog athleteNumReader = new TextInputDialog();
	athleteNumReader.setTitle("Team Size Calculator");
	athleteNumReader.setHeaderText("Input total amount of athletes, receive suggested team size.");
        athleteNumReader.setContentText("Number of Athletes:");
	athleteNumReader.showAndWait();

	int numAthletes = Integer.parseInt(athleteNumReader.getResult());
	int teamSize;
	if (numAthletes < 3) {
                        Alert tooLow = new Alert(AlertType.INFORMATION);
                        tooLow.setTitle("Team Size Calculator");
                        tooLow.setHeaderText("Failed to calculate team size:");
                        tooLow.setContentText("There must be at least three members.");
                        tooLow.showAndWait();

		} else if (numAthletes < 11) {
			teamSize = numAthletes/3;
                        Alert between = new Alert(AlertType.INFORMATION);
                        between.setTitle("Team Size Calculator");
                        between.setHeaderText("Calculated Team Size:");
                        between.setContentText("Teams should have " + teamSize + " members.");
                        between.showAndWait();
		} else {
			teamSize = numAthletes/2;
			Alert higher = new Alert(AlertType.INFORMATION);
			higher.setTitle("Team Size Calculator");
			higher.setHeaderText("Calculated Team Size:");
			higher.setContentText("Teams should have " + teamSize + " members.");
			higher.showAndWait();
		}
	}
}

