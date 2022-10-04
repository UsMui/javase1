package maytinh;

public class Test {
    public static void main(String[] args) {
        QuocGia qa = new QuocGia("aaaa","VN");
        QuocGia qb = new QuocGia("bbbb","USA");
        QuocGia qc = new QuocGia("cccc","NB");
        Date da = new Date(1,1,2021);
        Date db = new Date(2,2,2022);
        Date dc = new Date(3,3,2023);
        Date da1 = new Date(6,6,2021);
        Date db1 = new Date(7,7,2022);
        Date dc1 = new Date(8,8,2023);
        HangSanXuat ha = new HangSanXuat("Bphone",qa);
        HangSanXuat hb = new HangSanXuat("Intel",qb);
        HangSanXuat hc = new HangSanXuat("Hp",qc);
        MayTinh ma = new MayTinh(ha,da,da1,200);
        MayTinh mb = new MayTinh(hb,db,db1,300);
        MayTinh mc = new MayTinh(hc,dc,dc1,200);
        System.out.println("Tên Quốc Gia ma: "+ma.layTenQuocGia());
        System.out.println("Tên Quốc Gia mb: "+mb.layTenQuocGia());
        System.out.println("Tên Quốc Gia mc: "+mc.layTenQuocGia());
        System.out.println("Kiểm tra giá máy tính a rẻ hơn b: " +ma.kiemTraGiaBanThapHon(mb));
        System.out.println("Kiểm tra giá máy tính a rẻ hơn c: " +ma.kiemTraGiaBanThapHon(mc));

    }
}
