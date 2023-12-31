package cn.student;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import cn.student.model.student;
import cn.student.view.StudentOverviewController;

public class Lesson42 extends Application {
    
	 private ObservableList<student> studentData = FXCollections.observableArrayList();

	    public Lesson42() {
	        // Add some sample data
	        studentData.add(new student("Hans", "Muster"));
	        studentData.add(new student("Ruth", "Mueller"));
	        studentData.add(new student("Heinz", "Kurz"));
	        studentData.add(new student("Cornelia", "Meier"));
	        studentData.add(new student("Werner", "Meyer"));
	        studentData.add(new student("Lydia", "Kunz"));
	        studentData.add(new student("Anna", "Best"));
	        studentData.add(new student("Stefan", "Meier"));
	        studentData.add(new student("Martin", "Mueller"));
	    }
  

	    public ObservableList<student> getStudentData() {
	        return studentData;
	    }
	
	private Stage stage;
    private BorderPane pane1;
    @Override
    public void start(Stage stage) {
        this.stage = stage;
        this.stage.setTitle("学生信息表");
        initRootLayout();
        showStudentOverview();
    }

    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Lesson42.class.getResource("view/mainpane.fxml"));
            pane1 = (BorderPane) loader.load();
            // Show the scene containing the root layout.
            Scene scene = new Scene(pane1);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showStudentOverview() {
             
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Lesson42.class.getResource("view/student.fxml"));
            AnchorPane studentOverview = (AnchorPane) loader.load();
            // Set person overview into the center of root layout.
            pane1.setCenter(studentOverview);
            // Give the controller access to the main app.
            StudentOverviewController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public Stage getPrimaryStage() {
        return stage;
    }

    public static void main(String[] args) {
       Application.launch(args);
    }
}