package ucf.assignmnets;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RemoveListController {

        @FXML
        private TextField inputText;

        @FXML
        void RemoveToDo(ActionEvent event) throws IOException {


            //Remove To-Do based on inputText
            //Main.hashMap.remove(inputText);

            //Goes Back to main menu
            Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/HomePage.fxml"));
            Scene newListScene = new Scene(makeNewListParent);

            //This line gets the Stage Info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

            window.setScene(newListScene);
            window.show();
        }


    }

