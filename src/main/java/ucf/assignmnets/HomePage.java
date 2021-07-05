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
// you can access the public values by doing HomePage.valName = ...

public class HomePage extends Application {
 //   public  Map<String, String> Items =  new HashMap<>();
//    public Map<String,Map<Items>> ToDoList = new HashMap<>();    //name,map


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Start the program
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
