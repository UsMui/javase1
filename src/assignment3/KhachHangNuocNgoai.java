package assignment3;

public class KhachHangNuocNgoai extends KhachHang {
    public String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai(int code, String fullName, String data, int quantity, String quocTich) {
        super(code, fullName, data, quantity);
        this.quocTich = quocTich;
    }

    @Override
    public int thanhTien() {
        return super.thanhTien();
    }
}
