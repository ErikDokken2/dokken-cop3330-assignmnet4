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

public class EditListNameController {


    @FXML
    private TextField ToDoTitleKey;

    @FXML
    private TextField NewToDoTitle;

    @FXML
    void EditToDoTitle(ActionEvent event) throws IOException {
        //Check for map exist(ToD0) with inputted title

        //boolean check = CheckforList();
        //if(check != false)  //list exist
        //do{
        //  if(map.containsKey(TitleKey)
            // Since you cant just change the key value we have to copy and delete the original
            //
            // while(ToDoList.hasNext())
            // Map.Entry map = (Map.Entry) iterator.next();
            // if map.getKey == TitleKey
            //     replace (titleKey, NewKey)
            //return;
        //
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

