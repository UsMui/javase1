package qldssv;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {
    public static void main(String[] args) {
        //Lưu ý: MS Windows: \ =>\\ Ví dụ "C:\\Thưmục1\\Thưmục\\Têntậptin"
        // Linus, MacOS :/ Ví dụ "/Thưmục1/Thưmục2/Tentaptin."
        File folder1 = new File("C:\\Users\\MystUphng\\IdeaProjects\\javase1\\src\\qldssv");
        File folder2 = new File("C:\\Users\\MystUphng\\IdeaProjects\\javase1\\src\\qldssv1");

        //Kiểm tra thư mục hoặc tập tin có tồn tại hay không
        System.out.println("Kiểm tra folder1 có tồn tại hay không: "+folder1.exists());
        System.out.println("Kiểm tra folder2 có tồn tại hay không: "+folder2.exists());
        //Tạo thư mục
        //Phương thức mkdir() =>Tạo 1 thư mục
        File d1 = new File("C:\\Users\\MystUphng\\IdeaProjects\\javase1\\src\\qldssv\\Directory_1");
        d1.mkdir();
        //Phương thức mkdirs() =>Tạo ra nhiều thư mục cùng lúc
        File d2 = new File("C:\\Users\\MystUphng\\IdeaProjects\\javase1\\src\\qldssv\\Directory_5\\Directory_2\\Directory_3\\Directory_4");

        d2.mkdirs();
        //Tạo tập tin (có phần mở rộng: .exe,.txt,.doc,.xls
        File file1 = new File("C:\\Users\\MystUphng\\IdeaProjects\\javase1\\src\\qldssv\\Directory_1\\vidu1.txt");
        File file3 = new File("C:\\Users\\MystUphng\\IdeaProjects\\javase1\\src\\qldssv\\Directory_1\\file.data");
        try {
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
