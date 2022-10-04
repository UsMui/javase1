package sinhvien;

public class SinhVien {
    private String id;
    private String hoVaTen;
    private Date ngaySinh;
    private double diemTrungBinh;
    private Lop svLop;

    public SinhVien() {
    }

    public SinhVien(String id, String hoVaTen, Date ngaySinh, double diemTrungBinh, Lop svLop) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
        this.svLop = svLop;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Lop getSvLop() {
        return svLop;
    }

    public void setSvLop(Lop svLop) {
        this.svLop = svLop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", diemTrungBinh=" + diemTrungBinh +
                ", svLop=" + svLop +
                '}';
    }
    public String layTenKhoa(){
        return this.svLop.getTenKhoa();
    }
    public boolean kiemTraDau(double x){
        return this.diemTrungBinh>x;
    }
    public boolean kiemTraGiongNS(SinhVien A){
        return this.ngaySinh.equals(A.getNgaySinh());
    }


}
