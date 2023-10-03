package btn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BtnTest extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane bpane = (BorderPane)FXMLLoader.load(getClass().getResource("BPaneController.fxml"));
		Scene scene = new Scene(bpane,400,200);
		stage.setTitle("Login Page");
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
