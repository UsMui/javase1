package multipage.list;

import baitapjx2.Student;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import multipage.Main;
import multipage.form.Subject;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends multipage.form.Controller implements Initializable {
    public ListView<Subject> lv;

    public void goToForm() throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../form/form.fxml"));
        Scene listScene = new Scene(listPage,800,600);
//        Stage newStage = new Stage();
//        newStage.setTitle("Thêm môn học");
//        newStage.setScene(listScene);
//        newStage.show();
        Main.rootStage.setTitle("Thêm môn học");
        Main.rootStage.setScene(listScene);
        Main.rootStage.show();

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lv.setItems(subjectList);
    }
}
