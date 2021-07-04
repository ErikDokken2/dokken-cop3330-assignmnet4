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

public class HomePageController  {

    @FXML
    private TextField resultDisplay;

    @FXML
    void AddToDoClicked(ActionEvent event) throws IOException {

        //Makes new scene
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/MakeNewList.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //Set Scene and Shows
        window.setScene(newListScene);
        window.show();
    }
    @FXML
    void RevListButClicked(ActionEvent event) throws IOException {
        //Makes new scene
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/RemoveList.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //Sets Scene and Shows
        window.setScene(newListScene);
        window.show();
    }
    @FXML
    void EditListNameClicked(ActionEvent event) throws IOException {
        //Makes new scene
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/EditListName.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //Sets Scene and Shows
        window.setScene(newListScene);
        window.show();
    }

    @FXML
    void RemoveItemClicked(ActionEvent event) throws IOException {
        //Makes new scene
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/RemoveItemFromList.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //Sets Scene and Shows
        window.setScene(newListScene);
        window.show();
    }



    @FXML
    void SaveOptionClicked(ActionEvent event) throws IOException {
        //Makes new scene
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/SaveOptions.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //Sets Scene and Shows
        window.setScene(newListScene);
        window.show();

    }

    @FXML
    void AddItemClicked(ActionEvent event) throws IOException {
        //Makes new scene
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/AddItemToList.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //Sets Scene and Shows
        window.setScene(newListScene);
        window.show();
    }


    @FXML
    void OtherActions(ActionEvent event) throws IOException {
        //Makes new scene
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/OtherOptions.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //Sets Scene and Shows
        window.setScene(newListScene);
        window.show();
    }


}

