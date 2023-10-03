package com.gui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class KeyEventDemo extends Application {   
   @Override
   public void start(Stage stage) {
	    Pane pane = new Pane();
	    Text text = new Text(80,20,"M");
	    pane.getChildren().add(text);
	    // 为文本对象设置键按下事件处理器
        text.setOnKeyPressed(e-> {
          switch(e.getCode()){
             case DOWN: text.setY(text.getY()+10);break;
             case UP: text.setY(text.getY()-10);break;
             case LEFT: text.setX(text.getX()-10);break;
             case RIGHT: text.setX(text.getX()+10);break;
             default:
            	if(e.getText()!=null)
            		text.setText(e.getText());
          }
      }); 
      Scene scene = new Scene(pane,240,50);
      stage.setTitle("KeyEvent事件");
      stage.setScene(scene);
      stage.show();
      // 设置文本对象获得焦点，接收用户输入
      text.requestFocus();
   }
   public static void main(String[] args) {
      launch(args);
   }
}
