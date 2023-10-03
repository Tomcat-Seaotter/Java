package btn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class BPaneController {
	
	@FXML
	private Button btn1;
	
	@FXML
	private Button btn2;
	
	@FXML
	private Label lab1;
	
	@FXML
	private Label lab2;
	
	@FXML 
	private TextField tx1;
	
	@FXML 
	private PasswordField ps1;
	
	@FXML
	protected void loginClick(ActionEvent e)
	{
		if((tx1.getText().equals("nbut"))&&(ps1.getText().equals("123456")))
		{
			lab1.setText("用户名和密码正确");
		}
		else
		{
			lab1.setText("用户名和密码不正确，请重新输入");
		}
	}
	@FXML
	protected void registerClick(ActionEvent e)
	{
		tx1.setText("");
		ps1.setText("");
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("信息提示对话框");
		alert.setHeaderText("头部内容");
		alert.setContentText("“文本内容");
		alert.showAndWait();
	}

}
