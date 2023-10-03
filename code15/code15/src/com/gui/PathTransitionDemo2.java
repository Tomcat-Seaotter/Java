package com.gui;
import java.io.File;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
public class PathTransitionDemo2 extends Application{
   @Override
   public void start(Stage stage){
	   Pane rootNode = new Pane();
//	   Image image = new Image("images/china.gif");
//	   ImageView imageView = new ImageView(image);
	   Text text = new Text("JavaFX　Programming");
	   text.setFont(Font.font("宋体",20));
	   text.setFill(Color.BLUE);
	   rootNode.getChildren().add(text);
	  
	  
 	   PathTransition pt = new PathTransition(Duration.millis(5000),
 			   new Line(500,25,-250,25),text); 
	   pt.setCycleCount(5);
	   pt.play();
	   
//		 File path = new File("src\\images\\china.mp3");
//		 String source = path.toURI().toString();
//  	     Media media = new Media(source);
//	     MediaPlayer mediaPlayer = new MediaPlayer(media);
//	     mediaPlayer.setAutoPlay(true);
//	    // MediaView mediaView = new MediaView(mediaPlayer);
	     
 	   Scene scene = new Scene(rootNode,250,50);
	   stage.setTitle("滚动字幕");
       stage.setScene(scene); 
       stage.show(); 
   }
   public static void main(String[]args){
	   Application.launch(args);
   } 
}
