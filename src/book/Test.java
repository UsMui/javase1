package book;

public class Test {
    public static void main(String[] args) {
        Date da = new Date(1,1,2020);
        Date db = new Date(2,2,2022);
        Date dc = new Date(1,1,2020);
        TacGia ta = new TacGia("Nguyễn Văn An",da);
        TacGia tb = new TacGia("Nguyễn B",db);
        TacGia tc = new TacGia("Nguyễn C",dc);
        Book ba = new Book("Đồi gió",50,1999,ta);
        Book bb = new Book("Vợ nhặt",60,2000,tb);
        Book bc = new Book("Con ngoan",70,1999,tc);
        System.out.println(ba.toString());
//        ba.inTenSach();
//        bb.inTenSach();
//        bc.inTenSach();
//        System.out.println(ba.kiemTraCungNamXuatBan(bb));
//        System.out.println(ba.kiemTraCungNamXuatBan(bc));
//        System.out.println("Sau giảm 10% giá sách 1:" +ba.giaSauKhiGiam(10));
//        System.out.println("Sau giảm 20% giá sách 2:" +bb.giaSauKhiGiam(20));
//        System.out.println("Sau giảm 50% giá sách 3:" +bc.giaSauKhiGiam(50));

    }
}
