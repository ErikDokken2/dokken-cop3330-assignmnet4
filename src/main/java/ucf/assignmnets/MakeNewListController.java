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

import java.awt.event.MouseEvent;
import java.io.IOException;

public class MakeNewListController  {

    @FXML
    private TextField inputText;

    @FXML
    void CreateToDo(ActionEvent event) throws IOException {
        //Creates the new ToDOList element with put

        //HomePage.ToDoList.put(inputText,null);

        //Goes Back to main menu
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/HomePage.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newListScene);
        window.show();
    }
}


