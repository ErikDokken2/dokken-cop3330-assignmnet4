package ucf.assignmnets;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


// Note to self to change the .getResource("/ucf.assignmnets/HomePage.fxml")) from homepage to Application


public class HomePage extends Application {
//    private static Map<String, String> Items =  new HashMap<>();
//    private static Map<String,Map<Items>> ToDoList = new HashMap<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/HomePage.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("HomePage");
            primaryStage.show();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
