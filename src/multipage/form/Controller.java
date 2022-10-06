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
import javafx.scene.text.Text;
import multipage.Main;

public class Controller {
    public TextField txtCode;
    public TextField txtName;
    public TextField txtHours;
    public Text errors;

    public static ObservableList<Subject> subjectList = FXCollections.observableArrayList();


    public void goToList() throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene listScene = new Scene(listPage,800,600);
        Main.rootStage.setTitle("ListView");
        Main.rootStage.setScene(listScene);
    }

    public void addSubject() {
        try {
            errors.setVisible(true);
            if(txtCode.getText().isEmpty()||txtName.getText().isEmpty()||txtHours.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đầy đủ thông tin");
            }
            Double h = Double.parseDouble(txtHours.getText());
            if(h<0){
                throw new Exception("Vui lòng nhập đúng giờ");
            }
            Subject sb = new Subject(txtCode.getText(),txtName.getText(),h);
            int k=0;
            for(Subject s:subjectList){
                if(s.getCode().equals(txtCode.getText())){
                    k++;
                }
            }
            if(k==0){
                subjectList.add(sb);
            }
            clear();

            goToList();

        }catch (Exception e){
            errors.setVisible(true);
            errors.setText(e.getMessage());
        }


    }
    public void clear(){
        txtName.setText("");
        txtCode.setText("");
        txtHours.setText("");
        errors.setText("");
    }

}
