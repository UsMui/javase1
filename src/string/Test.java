package string;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
////        System.out.println("Nhập vào chuỗi ");
////        s = sc.nextLine();
//        System.out.println("-------");
//        //Hàm length()
//        System.out.println(s.length());
//        int doDai = s.length();
//        //Hàm charArt ==>Lấy ra 1 ký tu tại vị trí
//        for(int i=0;i<doDai;i++){
//            System.out.println("Vị trí: "+i+" la "+s.charAt(i));
//        }
        //Hàm getChars(vị trí bắt đầu,vị trí kết thúc,mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng)
//        char[] arrayChar = new char[20];
//        s.getChars(2,5,arrayChar,0);
//        for(int i=0;i<arrayChar.length;i++){
//            System.out.println("Giá trị của mảng tại"+i+" là "+arrayChar[i]);
//        }
        //Hàm getBytes có 3 cách lấy ra giá trị của các ký tự thành 1 mảng
//        byte[] arrayBytes = s.getBytes();
//        for(byte b: arrayBytes){
//            System.out.println(b);
//        }
        //So sánh chuỗi trong lập trình java
//        String s1 ="titv.vn";
//        String s2 ="TITV.vn";
//        String s3 ="titv.vn";
//        //Hàm equals so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        //Hàm equalsIgnoreCase so sánh 2 chuỗi không phân biệt hoa thường
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.equalsIgnoreCase(s3));
//        //Hàm compareTo =>so sánh ><=
//        String sv1 = "Nguyễn Văn A";
//        String sv2 = "Nguyễn Văn B";
//        String sv3 = "Nguyễn Văn";
//        String sv4 = "Nguyễn Văn A";
//        System.out.println("sv1 compareTo sv2"+ sv1.compareTo(sv2));
//        System.out.println("sv1 compareTo sv3"+ sv1.compareTo(sv3));
//        System.out.println("sv1 compareTo sv4"+ sv1.compareTo(sv4));
//        //Hàm compareToIgnoreCase so sánh ><= nhưng không phân biệt hoa thường.
//        //Hàm regionMatches => so sánh một đoạn
//        String r1 = "TITV.vn";
//        String r2 ="TV.v";
//        boolean check =r1.regionMatches(2,r2,0,4);
//        System.out.println(check);
//        //Hàm starWith =>Hàm kiểm tra chuỗi bắt đầu bằng
//        String dt ="037456789";
//        System.out.println(dt.startsWith("037"));
//        System.out.println(dt.startsWith("034"));
//        // Hàm endWith =>Hàm kiểm tra chuỗi kết thúc bằng
//        String tenfile1 ="ilove.jpg";
//        String tenfile2 = "hocjava.pdf";
//        if(tenfile1.endsWith(".jpg")){
//            System.out.println("File là 1 hình ảnh");
//        }else if(tenfile1.endsWith(".pdf")){
//            System.out.println("File là 1 file pdf");
//        }
//
//        if(tenfile2.endsWith(".jpg")){
//            System.out.println("File là 1 hình ảnh");
//        }else if(tenfile2.endsWith(".pdf")){
//            System.out.println("File là 1 file pdf");
//        }
//        String s1 = "Xin chào cô chú, xin chòa các bạn, Xin chào";
//        String s2 ="Xin chào";
//        String s3 ="Xin chào 123";
//        char c1 ='ô';
//        //Hàm indexOf
//
//        System.out.println(s1.indexOf(s2));
//        System.out.println(s1.indexOf(s3));
//        //Hàm indexOf sử dụng vị trí bắt đầu
//        System.out.println(s1.indexOf(s2,2));
//        System.out.println(s1.indexOf(c1,0));
        String s1 ="TITV";
        String s2 =".vn";
        String s3=s1+s2;
        //Hàm concat =>nối chuỗi
        String s4=s1.concat(s2);
        System.out.println(s3);
        System.out.println(s4);
        //Hàm replayce =>thay thế
        String s5= "tung.vn";
        String s6 = s5.replaceAll("tung","Titv");
        System.out.println(s6);

        String s10="Xin chào các bạn, mình là Mui";
        String s11 =s10.substring(10);
        String s12 = s10.substring(10,15);
        System.out.println(s10);
        System.out.println(s11);
        System.out.println(s12);






    }
}
