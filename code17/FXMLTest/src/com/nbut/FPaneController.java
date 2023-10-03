package com.nbut;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FPaneController {
	
	@FXML
	private Button btn1;
	@FXML
	private Label lab1;
	
	@FXML
	protected void handleButton(ActionEvent e)
	{
		String name = btn1.getText();
		lab1.setText(name);
	}
	

}
