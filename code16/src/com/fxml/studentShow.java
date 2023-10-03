package com.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class studentShow extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("studentPanel.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("FXML");
		stage.setScene(scene);
		stage.show();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
