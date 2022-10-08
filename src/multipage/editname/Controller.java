//package multipage.editname;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.TextField;
//import javafx.scene.text.Text;
//import multipage.Main;
//import multipage.Subject;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class Controller implements Initializable {
//    public TextField txtCode;
//    public TextField txtName;
//    public TextField txtHours;
//    public Text errors;
//
//
//    public void goToList() throws Exception {
//        Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
//        Scene listScene = new Scene(listPage,800,600);
//        Main.rootStage.setTitle("ListView");
//        Main.rootStage.setScene(listScene);
//    }
//
//    public void editSubject() {
//        try {
//            errors.setVisible(true);
//            if(txtName.getText().isEmpty()||txtHours.getText().isEmpty()){
//                throw new Exception("Vui lòng nhập đầy đủ thông tin");
//            }
//            Integer h = Integer.parseInt(txtHours.getText());
//            if(h<0){
//                throw new Exception("Vui lòng nhập đúng giờ");
//            }
//
//            multipage.list.Controller.editItem.setName(txtName.getText());
//            multipage.list.Controller.editItem.setHours(h);
//
//            goToList();//Hoặc giữ tham số goToList(null);
//
//        }catch (Exception e){
//            errors.setVisible(true);
//            errors.setText(e.getMessage());
//        }
//
//    }
//    public void clear(){
//        txtName.setText("");
//        txtCode.setText("");
//        txtHours.setText("");
//        errors.setText("");
//    }
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        try {
//            if(multipage.list.Controller.editItem==null){
//                goToList();
//            }
//            txtCode.setText(multipage.list.Controller.editItem.getCode());
//            txtName.setText(multipage.list.Controller.editItem.getName());
//            txtHours.setText(multipage.list.Controller.editItem.getHours().toString());
//            txtCode.setEditable(false);//Không cho sửa
//        }catch (Exception e){
//
//        }
//
//    }
//}
