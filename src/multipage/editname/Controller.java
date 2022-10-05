package multipage.editname;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import multipage.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends multipage.list.Controller implements Initializable {
    public TextField txtEdit;
    public Text subjectEdit;

        public void goToList(ActionEvent actionEvent) throws Exception {
            Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
            Scene listScene = new Scene(listPage,800,600);
            Main.rootStage.setTitle("ListView");
            Main.rootStage.setScene(listScene);
        }
    public void initialize(URL location, ResourceBundle resources){
            subjectEdit.setText("AAAAAAAAA");
    }


}
