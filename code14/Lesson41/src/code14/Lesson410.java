package code14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Lesson410 extends Application {
	@Override
	public void start(Stage stage) {
		BorderPane root = new BorderPane();
		root.setCenter(new Label("ʹ��CSS������ʽ��"));
		HBox hBox = new HBox();
		hBox.getStyleClass().add("hbox");
		Button backButton = new Button("����");
		hBox.getChildren().add(backButton);
		Button nextButton = new Button("��һ��");
		nextButton.setId("nextBtn");
		hBox.getChildren().add(nextButton);
		root.setBottom(hBox);
		Scene scene = new Scene(root, 400, 100);
		scene.getStylesheets().add("style.css");
		stage.setTitle("CSS ������ʽ��");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
