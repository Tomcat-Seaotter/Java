package com.gui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
public class TextAreaDemo extends Application{
	public void start(Stage stage){
		Label label = new Label();
		label.setGraphic(new ImageView("images\\panda.jpg"));
        //创建一个文本区并将它置于滚动面板中
		TextArea ta = new TextArea("国宝大熊猫");
		ta.setFont(new Font("楷体",16));
		ta.setWrapText(true);
		ta.setEditable(false);
		// 创建根节点
		BorderPane rootNode = new BorderPane();
		rootNode.setLeft(label);
		ScrollPane scrollPane = new ScrollPane(ta);
		rootNode.setCenter(scrollPane);
		Scene scene = new Scene(rootNode, 250, 100);		
		stage.setScene(scene);
		stage.setTitle("文本区示例");
		stage.show();
	}
	public static void main(String[] args) {
	   launch(args);
	}
}
