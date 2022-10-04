package multipage.form;

import baitapjx2.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import multipage.Main;

public class Controller {
    public TextField txtCode;
    public TextField txtName;
    public TextField txtHours;

    public static ObservableList<Subject> subjectList = FXCollections.observableArrayList();


    public void goToList(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene listScene = new Scene(listPage,800,600);
        Main.rootStage.setTitle("ListView");
        Main.rootStage.setScene(listScene);
    }

    public void addSubject(ActionEvent actionEvent) {
//            if(txtCode.getText().isEmpty()||txtName.getText().isEmpty()||txtHours.getText().isEmpty()){
//                return;
//            }
            Double h = Double.parseDouble(txtHours.getText());
            Subject sb = new Subject(txtCode.getText(),txtName.getText(),h);
            subjectList.add(sb);
            clear();

    }
    public void clear(){
        txtName.setText("");
        txtCode.setText("");
        txtHours.setText("");
    }

}
