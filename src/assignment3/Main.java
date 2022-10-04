package assignment3;

public class Main {
    public static void main(String[] args) {
        KhachHangVietNam a = new KhachHangVietNam(1,"Nguyễn Văn An","2022-09-22",519,"Cá Nhân");
        KhachHangNuocNgoai b = new KhachHangNuocNgoai(2,"Jack","2022-09-21",156,"USA");
        System.out.println(a.thanhTien());
        System.out.println(b.thanhTien());
        KhachHang kh = (KhachHang) new KhachHangVietNam(2,"Nguyễn Văn B","2022-09-22",519,"Cá Nhân");
        KhachHangVietNam khvn = (KhachHangVietNam) new KhachHang(2,"Nguyễn Văn B","2022-02-22",100);
        khvn.thanhTien();
    }
}
