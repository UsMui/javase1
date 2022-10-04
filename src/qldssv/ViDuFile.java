package qldssv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ViDuFile {
    File file;

    public ViDuFile(String tenFile) {
    }

    public ViDuFile(File file) {
        this.file = file;
    }
    public boolean kiemTraThucThi(){
        return this.file.canExecute();
    }
    public boolean kiemTraDoc(){
        return this.file.canRead();
    }
    public boolean kiemTraGhi(){
        return this.file.canWrite();
    }
    public void inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }
    public void inTen(){
        System.out.println(this.file.getName());
    }
    public void kiemTraThuMucHoacTapTin(){
        if(this.file.isDirectory()){
            System.out.println("Đây là thư mục");
        } else if (this.file.isFile()) {
            System.out.println("Đây là tập tin");
        }
    }

    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        String tenFile = sc.nextLine();
//        ViDuFile vdf = new ViDuFile("C:\\Users\\MystUphng\\IdeaProjects\\javase1\\src\\qldssv\\Directory_1");
//        vdf.inDuongDan();
//        vdf.inTen();
//        vdf.kiemTraThuMucHoacTapTin();

        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\MystUphng\\IdeaProjects\\javase1\\src\\qldssv\\Directory_1\\vidu1.txt","UTf-8");
            pw.println("xin chào");
            pw.println("pi=3.14");
            pw.print("đóng");
            pw.print(3.14);
            Student st = new Student(100,"Nguyễn Văn An");
            pw.print(st);
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}
