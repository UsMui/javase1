//package multipage.list;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.ListView;
//import multipage.Main;
//import multipage.Subject;
//
//import java.io.IOException;
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class Controller implements Initializable {
//    public ListView<Subject> lv;
//    public static ObservableList<Subject> list = FXCollections.observableArrayList();
//    public static Subject editItem;
//
//
//
//    public void goToForm() throws Exception {
//        Parent listPage = FXMLLoader.load(getClass().getResource("../form/form.fxml"));
//        Scene listScene = new Scene(listPage,800,600);
////        Stage newStage = new Stage();
////        newStage.setTitle("Thêm môn học");
////        newStage.setScene(listScene);
////        newStage.show();
//        Main.rooStage.setTitle("Thêm môn học");
//        Main.rooStage.setScene(listScene);
//        Main.rooStage.show();
//
//    }
//
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
////        lv.setItems(subjectList);
////        list.add(new Subject("JP1","Java Programing 1",40));
////        list.add(new Subject("JP2","Java Programing 2",40));
//        lv.setItems(list);
//
//    }
//
//
//    public void edit(ActionEvent actionEvent) throws Exception {
//        editItem =lv.getSelectionModel().getSelectedItem();//Lấy phần tử đang được nhấn chuột
//        if(editItem==null) return;
//
//        Parent listPage = FXMLLoader.load(getClass().getResource("../editname/form.fxml"));
//        Scene listScene = new Scene(listPage,800,600);
//        Main.rooStage.setTitle("Edit tên môn học");
//        Main.rooStage.setScene(listScene);
//        Main.rooStage.show();
//    }
//}
