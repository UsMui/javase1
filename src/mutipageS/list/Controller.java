package mutipageS.list;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import mutipageS.Main;
import mutipageS.Student;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public ListView<Student> lv;
    public static ObservableList<Student> studentList = FXCollections.observableArrayList();
    public static Student editStudent;

    public void addStudent() throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../form/formStudent.fxml"));
        Scene listScene = new Scene(listPage,800,600);
        Main.rootStage.setTitle("Thêm sinh viên");
        Main.rootStage.setScene(listScene);


    }

    boolean sortName = true;
    public void sortName(ActionEvent actionEvent) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortName?o1.layTen().compareTo(o2.layTen()):o2.layTen().compareTo(o1.layTen());
            }
        });
        sortName = !sortName;
    }

    boolean sortMark = true;
    public void sortMark(ActionEvent actionEvent) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (sortMark?o1.getMark()-o2.getMark():o2.getMark()-o1.getMark());
            }
        });
        sortMark= !sortMark;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lv.setItems(studentList);
        lv.refresh();
    }

    public void editStudent(ActionEvent actionEvent) throws Exception {
        editStudent= lv.getSelectionModel().getSelectedItem();
        if(editStudent==null) return;
        Parent listPage = FXMLLoader.load(getClass().getResource("../edit/editStudent.fxml"));
        Scene listScene = new Scene(listPage,800,600);
        Main.rootStage.setTitle("Thêm sinh viên");
        Main.rootStage.setScene(listScene);
        Main.rootStage.show();

    }

    public void removeStudent(ActionEvent actionEvent) {
        editStudent= lv.getSelectionModel().getSelectedItem();
        if(editStudent==null) return;
        studentList.remove(editStudent);
        lv.setItems(studentList);
        lv.refresh();
    }
}
