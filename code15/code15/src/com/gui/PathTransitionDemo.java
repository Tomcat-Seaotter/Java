package com.gui;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class PathTransitionDemo extends Application{
   @Override
   public void start(Stage stage){	  
	   Pane rootNode = new Pane();
	     Image image = new Image("images/sun.png");
	     ImageView imageView = new ImageView(image);
	     rootNode.getChildren().add(imageView);
	     // 创建移动路径
 	     PathTransition pt = new PathTransition(Duration.millis(10000),
 			   new Line(120,190,120,80),imageView); 
	     pt.play();
	     // 创建音频并自动播放
		 File path = new File("src\\images\\wormfly.mp3");
		 String source = path.toURI().toString();
  	     Media media = new Media(source);
	     MediaPlayer mediaPlayer = new MediaPlayer(media);
	     mediaPlayer.setAutoPlay(true);
	     Scene scene = new Scene(rootNode,300,250);
	     stage.setTitle("路径动画");
         stage.setScene(scene); 
         stage.show();    
   }
   public static void main(String[]args){
	     Application.launch(args);
   } 
}
