package session1;

public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien1Kg;
    private double khoiLuong;

    public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien1Kg, double khoiLuong) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.giaTien1Kg = giaTien1Kg;
        this.khoiLuong = khoiLuong;
    }
    public double tinhTongTien(){
        return this.giaTien1Kg*this.khoiLuong;
    }

    public boolean ktKhoiLuongLonHon(double kl){
        return this.khoiLuong>kl;
    }
    public boolean ktTongTienLonHon500K(){
        return this.tinhTongTien()>500000;
    }
    public double giamGia(double x){
        if(this.tinhTongTien()>500000){
        return (x/100)*this.tinhTongTien();
        }else{
            return 0;
        }
    }
    public double giaSauKhiGiam(double x){
        return this.tinhTongTien()-this.giamGia(x);
    }

}
