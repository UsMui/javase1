package qldssv;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        sc.nextLine();
        do{
            System.out.println("MENU");
            luaChon = sc.nextInt();
            if(luaChon==1){
                System.out.println("Nhập mã sinh viên");
                String maSinhvien =sc.nextLine();
                System.out.println("Nhập họ và tên");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhập vào năm sinh");
                int namSinh = sc.nextInt();
                System.out.println("Nhập vào điểm trung bình");
                double diemTrungBinh = sc.nextDouble();
                SinhVien sv = new SinhVien(maSinhvien,hoVaTen,namSinh,diemTrungBinh);
                dssv.themSinhVien(sv);
            } else if (luaChon==2) {

            } else if (luaChon==3) {

            } else if (luaChon==4) {

            }

        }while(luaChon!=0);
    }


}
