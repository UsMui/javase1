package mutipageS.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import mutipageS.Main;
import mutipageS.Student;


import java.time.LocalDate;

public class Controller {
    public TextField txtName;
    public TextField txtCode;
    public TextField txtBirth;
    public TextField txtMark;
    public Text noticeName;
    public Text noticeCode;
    public Text noticeBirth;
    public Text noticeMark;
    public Text errors;

    public void goToList() throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/listStudent.fxml"));
        Scene listScene = new Scene(listPage,800,600);
        Main.rootStage.setTitle("List Student");
        Main.rootStage.setScene(listScene);
        Main.rootStage.show();

    }
    public void submitForm(ActionEvent actionEvent) throws Exception {
        try{
            errors.setVisible(false);
            if(txtName.getText().isEmpty()||txtCode.getText().isEmpty()||txtBirth.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đầy đủ tên và mã sinh viên");
            }
            Double diem = Double.parseDouble(txtMark.getText());
            if(diem<0||diem>10){
                throw new Exception("Vui lòng nhập đúng điểm sinh viên");
            }
            LocalDate ns= LocalDate.parse(txtBirth.getText());
            if(ns==null){
                throw new Exception("Vui lòng nhập đúng ngày sinh sinh viên");
            }
            Student st = new Student(txtName.getText(),txtCode.getText(),ns,diem);
            for(Student s: mutipageS.list.Controller.studentList){
                if(s.getName().equals(st.getName())){
                    return;
                }
            }
            mutipageS.list.Controller.studentList.add(st);

            goToList();

        }catch(Exception e){
            errors.setVisible(true);
            errors.setText(e.getMessage());
        }

    }
}
