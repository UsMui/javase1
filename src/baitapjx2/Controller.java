package baitapjx2;

import com.sun.deploy.panel.ExceptionListDialog;
import com.sun.javaws.exceptions.ExitException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPoint;
    public Text noticeName;
    public Text noticeEmail;
    public Text noticePoint;
    public Text errors;
    public Button btnSortByName;
    public ListView<Student> lv;
    public ObservableList<Student> studentList = FXCollections.observableArrayList();

    public void studentList() {
        String name= txtName.getText();
        String em = txtEmail.getText();
        String diem = txtPoint.getText();
        try{
            errors.setVisible(false);
          if(name.isEmpty()){
              throw new Exception("Vui lòng nhập tên sinh viên");
          }
          Double diemThi = Double.parseDouble(diem);
          if(diemThi<0||diemThi>10){
              throw new Exception("Vui lòng nhập điểm");
          }
          if(em.isEmpty()||!em.contains("@")||em.startsWith("@")||em.endsWith("@")){
              throw new Exception("Vui lòng nhập email");
          }
          Student st = new Student(name,em,diemThi);
          studentList.add(st);
          printResult();

        }catch (Exception e){
            errors.setVisible(true);
            errors.setText(e.getMessage());
        }
    }
    public void printResult(){
        lv.setItems(studentList);
        lv.refresh();
    }
    public void sortName(){
        FXCollections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName()); //Sắp xếp tên theo alphabe
            }
        });
    }
    public void sortPoint(){
        FXCollections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getPoint()-o2.getPoint()); //Sắp xếp điểm tăng dần
            }
        });
    }

    public void addStudent(){
        try{
            errors.setVisible(false);
            Double mark = Double.parseDouble(txtPoint.getText());
            if(txtName.getText().isEmpty()||txtEmail.getText().isEmpty()||!txtEmail.getText().contains("@")||
            txtEmail.getText().startsWith("@")||txtEmail.getText().endsWith("@")||mark<0||mark>10){
                throw new Exception("Vui lòng nhập thông tin hợp lệ");
            }
            studentList.add(new Student(txtName.getText(),txtEmail.getText(),mark));
            lv.setItems(studentList);
            lv.refresh();
            clearInput();

        }catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(true);

        }
    }
    public void clearInput(){
        txtName.setText("");
        txtEmail.setText("");
        txtPoint.setText("");
    }


    private boolean sortName = true;
    public void sortByName(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortName?o1.getName().compareTo(o2.getName()):o2.getName().compareTo(o1.getName());
            }
        });
        btnSortByName.setText(sortName?"A->Z":"Z->A");
        sortName=!sortName;
        lv.refresh();
    }
    private boolean sortMart = true;
    public void sortByMart(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortMart?(int) (o1.getPoint()-o2.getPoint()):(int) (o2.getPoint()-o1.getPoint());
            }
        });
        sortMart =!sortMart;
        lv.refresh();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        studentList.add(new Student("Hưng","hung@gmail.com",5.0) );
        studentList.add(new Student("Thành","thanh@gmail.com",6.0));
        lv.setItems(studentList);
    }
}