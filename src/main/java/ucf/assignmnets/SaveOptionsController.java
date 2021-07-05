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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveOptionsController {
    @FXML
    private TextField SaveListKey;

    @FXML
    void SaveAllLists(ActionEvent event) throws IOException {

        //String outputString = Main.hmap.toString();

        //MakeNewFile();

        //String fileName = nameOutfileName + ".txt";
//        try{
//            PrintWriter outputFile = new PrintWriter(fileName);
//            outputFile.println(outputString);
//            outputFile.close(); //Closes the file
//            System.out.println("done");
//        }catch(FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }

        //Goes Back to main menu
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/HomePage.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newListScene);
        window.show();
    }

    private void MakeNewFile() {
        //        File myFile = new File("address");

    }

    @FXML
    void SaveList(ActionEvent event) throws IOException {
        //String outputString = Main.hmap.toString();

        //MakeNewFile();

        //String fileName = nameOutfileName + ".txt";
//        try{
//            PrintWriter outputFile = new PrintWriter(fileName);
//            outputFile.println(outputString);
//            outputFile.close(); //Closes the file
//            System.out.println("done");
//        }catch(FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }


        //Goes Back to main menu
        Parent makeNewListParent = FXMLLoader.load(getClass().getResource("/ucf.assignmnets/HomePage.fxml"));
        Scene newListScene = new Scene(makeNewListParent);

        //This line gets the Stage Info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(newListScene);
        window.show();
    }
}
