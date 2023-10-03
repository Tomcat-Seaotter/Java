package com.nbut;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class PaneTest extends Application {

	private PaneTest pt;
	private Stage stage;
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FlowPane pane1 = (FlowPane)FXMLLoader.load(getClass().getResource("FPane.fxml"));
		Scene scene = new Scene(pane1,400,300);
		stage.setTitle("FXML");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public Stage getStage()
	{
		return this.stage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);

	}

}
