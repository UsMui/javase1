package javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
//    public TextField txtFullName;
//    public TextField txtEmail;
//    public TextField txtAge;
//    public TextArea txtAddress;
//    public Text fullName;
//    public Text email;
//    public Text age;
//    public Text address;
//    public Text noticeFullName;
//    public Text noticeEmail;
//    public Text noticeAge;
//    public Text noticeAddress;
//
//
//    public void handleSubmit() {
//        String fn= txtFullName.getText();
//        if(fn.isEmpty()){
//          noticeFullName.setText("Vui lòng nhập họ tên");
//          noticeFullName.setVisible(true);
//
//        }else{
//            fullName.setText(fn);
//            noticeFullName.setVisible(false);
//        }
////        email.setText(txtEmail.getText());
////        age.setText(txtAge.getText());
////        address.setText(txtAddress.getText());
//        String ag = txtAge.getText();
//        try{
//            Integer nAge = Integer.parseInt(ag);
//            if(nAge<=0||nAge>100)
//                throw new Exception("Vui lòng nhập tuổi hợp lệ");
//            age.setText(nAge.toString());
//            noticeAge.setVisible(false);
//        }catch (Exception e){
//            noticeAge.setText(e.getMessage());
//            noticeAge.setVisible(true);
//        }
//        String em =txtEmail.getText();
//        if(em.isEmpty()||!em.contains("@")||em.startsWith("@")||em.endsWith("@")){
//            noticeEmail.setText("Vui lòng nhập vào 1 email");
//            noticeEmail.setVisible(true);
//
//        }else{
//            email.setText(em);
//            noticeEmail.setVisible(false);
//        }
////        if(em.indexOf("@")==0||em.indexOf("@")==em.length()||em.indexOf("@")<0){
////            noticeEmail.setText("Vui lòng nhập vào 1 email");
////            noticeEmail.setVisible(true);
////
////        }
//
//    }
    public TextField txtFullName;
    public TextField txtEmail;
    public TextField txtAge;
    public TextField txtAddress;
    public Text fullName;
    public Text email;
    public Text age;
    public Text address;
    public Text noticeFullName;
    public Text noticeEmail;
    public Text noticeAge;
    public Text noticeAddress;


    public void handleSubmit() {
        String fn = txtFullName.getText();
        if(fn.isEmpty()){
            noticeFullName.setVisible(true);
            noticeFullName.setText("Vui Lòng Nhập Họ Và Tên");
        }else{
            fullName.setText(fn);
            noticeFullName.setVisible(false);
        }

        String em = txtEmail.getText();
        if(em.isEmpty()||!em.contains("@")||em.startsWith("@")||em.endsWith("@")){
            noticeEmail.setVisible(true);
            noticeEmail.setText("Vui lòng nhập đúng email");
        }else{
            email.setText(em);
            noticeEmail.setVisible(false);
        }

        String ag = txtAge.getText();
        try{
            Integer nAge = Integer.parseInt(ag);
            if(nAge<=0||nAge>100)
                throw new Exception("Vui lòng nhập tuổi hợp lệ");
            age.setText(nAge.toString());
            noticeAge.setVisible(false);
        }catch (Exception e){
            noticeAge.setText(e.getMessage());
            noticeAge.setVisible(true);
        }
        String ad = txtAddress.getText();
        address.setText(ad);
    }
}