package com.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class ButtonDemo extends Application{
   @Override
   public void start(Stage stage){
	  HBox hbox = new HBox(10);
	  Pane pane = new Pane();
	  BorderPane rootNode = new BorderPane();	  
	  Text text = new Text(50,40,"JavaFX程序设计");
	  Button left = new Button("向左",new ImageView("images\\left.gif"));
	  Button right = new Button("向右",new ImageView("images\\right.gif"));
	  
	  hbox.setAlignment(Pos.CENTER);
	  hbox.getChildren().addAll(left,right);
	  pane.setPadding(new Insets(0,0,20,0));
	  pane.getChildren().add(text);
	  
	  left.setOnAction(e->text.setX(text.getX()-10));
	  right.setOnAction(e->text.setX(text.getX()+10));
	  
	  rootNode.setPadding(new Insets(0,0,10,0));
	  rootNode.setCenter(pane);
	  rootNode.setBottom(hbox);
	  
	  Scene scene = new Scene(rootNode,300,100);
      stage.setTitle("按钮示例");   
      stage.setScene(scene);       
      stage.show();                 
   }
   public static void main(String[]args){
	   launch(args);
   }
}

