package com.gui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
public class ReadUrl extends Application{
	public void start(Stage stage){
		HBox hbox = new HBox();
		final Label label = new Label("地址");
		final TextField address = new TextField("http://www.baidu.com");
		final Button ok = new Button("确定");
		address.setPrefWidth(320);
		hbox.getChildren().addAll(label,address,ok);
		hbox.setPadding(new Insets(10,10,10,10));
		hbox.setSpacing(10);
		
		final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        //ScrollPane scrollPane = new ScrollPane(browser);
		BorderPane rootNode = new BorderPane();
		rootNode.setPadding(new Insets(10, 10, 10, 10));
		rootNode.setTop(hbox);
		rootNode.setCenter(browser);
		ok.setOnAction((ActionEvent e) -> {	
			String location = address.getText();
			webEngine.load(location);  
		});
	    Scene scene = new Scene(rootNode, 800, 500);		
		stage.setScene(scene);
		stage.setTitle("我的浏览器");
		stage.show();
	}
	public static void main(String[] args) {
	   launch(args);
	}
}

