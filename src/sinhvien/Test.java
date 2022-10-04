package sinhvien;

public class Test {
    public static void main(String[] args) {
        Date da = new Date(1,1,1991);
        Date db = new Date(2,2,1992);
        Date dc = new Date(1,1,1991);
        Lop la = new Lop("2203E","A4");
        Lop lb = new Lop("2204E","A6");
        SinhVien sa = new SinhVien("123","aaaa",da,9.0,la);
        SinhVien sb = new SinhVien("234","bbbb",db,4.0,lb);
        SinhVien sc = new SinhVien("456","cccc",dc,4.5,la);
        System.out.println("Tên khoa :"+ sa.layTenKhoa());
        System.out.println("Tên khoa :"+ sb.layTenKhoa());
        System.out.println("Tên khoa :"+ sc.layTenKhoa());
        System.out.println("Kiểm tra đỗ sinh vien: "+sa.getHoVaTen()+sa.kiemTraDau(5.0));
        System.out.println("Kiểm tra đỗ sinh vien: "+sb.getHoVaTen()+sb.kiemTraDau(5.0));
        System.out.println("Kiểm tra đỗ sinh vien: "+sc.getHoVaTen()+sc.kiemTraDau(5.0));
        System.out.println("Kiểm tra giống ngày sinh: "+sa.getHoVaTen()+"=="+sa.getHoVaTen()+sa.kiemTraGiongNS(sb));
        System.out.println("Kiểm tra giống ngày sinh: "+sa.getHoVaTen()+"=="+sc.getHoVaTen()+sc.kiemTraGiongNS(sc));
    }
}
