package qlsv;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SinhVien)) return false;
        SinhVien sinhVien = (SinhVien) o;
        return getMaSinhVien() == sinhVien.getMaSinhVien() && Double.compare(sinhVien.getDiemTrungBinh(), getDiemTrungBinh()) == 0 && getHoVaTen().equals(sinhVien.getHoVaTen()) && getTenLop().equals(sinhVien.getTenLop());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaSinhVien(), getHoVaTen(), getTenLop(), getDiemTrungBinh());
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien=" + maSinhVien +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", tenLop='" + tenLop + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }


//    @Override
//    public int compareTo(SinhVien o) {
//        return this.maSinhVien-o.maSinhVien;
//    }
    public String getTen(){
        String name = this.hoVaTen.trim();
        if(name.indexOf(" ")>0){
           int vt = name.lastIndexOf(" ");
           return name.substring(vt+1);
        }
        return name;
    }
    @Override
    public int compareTo(SinhVien o) {
        String tenThis = this.getTen();
        String tenO = o.getTen();
        return tenThis.compareTo(tenO);

    }

}
