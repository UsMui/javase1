package maytinh;

public class MayTinh {
    private HangSanXuat hangSanXuat;
    private Date ngaySanXuat;
    private Date hanBaoHanh;
    private double giaBan;

    public MayTinh() {
    }

    public MayTinh(HangSanXuat hangSanXuat, Date ngaySanXuat, Date hanBaoHanh, double giaBan) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.hanBaoHanh = hanBaoHanh;
        this.giaBan = giaBan;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getHanBaoHanh() {
        return hanBaoHanh;
    }

    public void setHanBaoHanh(Date hanBaoHanh) {
        this.hanBaoHanh = hanBaoHanh;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public boolean kiemTraGiaBanThapHon(MayTinh A){
        return this.giaBan<A.giaBan;
    }
    public String layTenQuocGia(){
        return this.hangSanXuat.layTenQuocGia();
    }
}
