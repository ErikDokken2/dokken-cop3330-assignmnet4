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


public class RemoveItemFromListController {

    @FXML
    private TextField ToDoTitleKey;

    @FXML
    private TextField ItemNameKey;

    @FXML
    void RemoveItemButton(ActionEvent event) throws IOException {

        //boollean there a list; CheckforList();
        //if(CheckforList != False)
            //Map.HashMap.Items.remove(ItemNameKey);
        //otherwise
        //Error message

        //Goes Back to main menu
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/HomePage.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newListScene);
        window.show();
    }

    private boolean CheckforList() {
        //int counter = 0
        //if publis map == Null || ""
        //return false
        //otherwise
        //do
        // if (map.contains(titlekey)
        //return true

        //filler return
        return false;
    }

}
