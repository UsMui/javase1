package qldssv;

import qldssv.SinhVien;

import java.io.*;

public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\MystUphng\\IdeaProjects\\javase1\\src\\qldssv\\Directory_1\\file.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos =  new ObjectOutputStream(os);
            SinhVien st = new SinhVien("1111","Nguyễn Văn An",2000,10.0);
            oos.writeObject(st);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
