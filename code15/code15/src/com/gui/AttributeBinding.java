package com.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
public class AttributeBinding extends Application{
   @Override
   public void start(Stage stage){  
	  BorderPane rootNode = new BorderPane();	  
	  Label label = new Label("Hello,JavaFX");
	  TextField  text = new TextField("Hello,JavaFX");
	  label.textProperty().bind(text.textProperty());
	  rootNode.setPadding(new Insets(0,0,10,0));
	  rootNode.setCenter(label);
	  rootNode.setBottom(text);
	  Scene scene = new Scene(rootNode,300,100);
      stage.setTitle("属性绑定");   
      stage.setScene(scene);       
      stage.show();                 
   }
   public static void main(String[]args){
	   launch(args);
   }
}

