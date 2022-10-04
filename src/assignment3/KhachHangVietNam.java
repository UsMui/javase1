package assignment3;

public class KhachHangVietNam extends KhachHang {
    public String doiTuong;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public KhachHangVietNam(int code, String fullName, String data, int quantity, String doiTuong) {
        super(code, fullName, data, quantity);
        this.doiTuong = doiTuong;
    }

    @Override
    public int thanhTien() {
        if(quantity<50) return quantity*1000;
        else if(quantity<100) return (quantity-50)*1200 +50*100;
        else if(quantity<200) return (quantity-100)*1500+50*1200+50*1000;
        else return (quantity-200)*2000+100*1500+50*1200+50*1000;

    }
}

