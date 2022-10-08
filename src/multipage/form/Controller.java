//package multipage.form;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.TextField;
//import javafx.scene.text.Text;
//import multipage.Main;
//import multipage.Subject;
//
//public class Controller {
//    public TextField txtCode;
//    public TextField txtName;
//    public TextField txtHours;
//    public Text errors;
//
////    public static ObservableList<Subject> subjectList = FXCollections.observableArrayList();
//
//
//    public void goToList() throws Exception {
//        Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
//        Scene listScene = new Scene(listPage,800,600);
//        Main.rootStage.setTitle("ListView");
//        Main.rootStage.setScene(listScene);
//    }
//
//    public void addSubject() {
//        try {
//            errors.setVisible(true);
//            if(txtCode.getText().isEmpty()||txtName.getText().isEmpty()||txtHours.getText().isEmpty()){
//                throw new Exception("Vui lòng nhập đầy đủ thông tin");
//            }
//            Integer h = Integer.parseInt(txtHours.getText());
//            if(h<0){
//                throw new Exception("Vui lòng nhập đúng giờ");
//            }
//
//
//            for(Subject s: multipage.list.Controller.list){
//                if(s.getCode().equals(txtCode.getText())){
//                   throw new Exception("Vui lòng nhập lại code");
//                }
//            }
//
//            multipage.list.Controller.list.add(new Subject(txtCode.getText(),txtName.getText(),h));
//
//            clear();
//
//            goToList();//Hoặc giữ tham số goToList(null);
//
//        }catch (Exception e){
//            errors.setVisible(true);
//            errors.setText(e.getMessage());
//        }
//
//
//    }
//    public void clear(){
//        txtName.setText("");
//        txtCode.setText("");
//        txtHours.setText("");
//        errors.setText("");
//    }
//
//}
