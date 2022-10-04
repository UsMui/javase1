package sinhvien;

import java.util.Objects;

public class Lop {
    private String tenLop, tenKhoa;

    public Lop() {
    }

    public Lop(String tenLop, String tenKhoa) {
        this.tenLop = tenLop;
        this.tenKhoa = tenKhoa;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    @Override
    public String toString() {
        return "Lop{" +
                "tenLop='" + tenLop + '\'' +
                ", tenKhoa='" + tenKhoa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lop)) return false;
        Lop lop = (Lop) o;
        return getTenLop().equals(lop.getTenLop()) && getTenKhoa().equals(lop.getTenKhoa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTenLop(), getTenKhoa());
    }
}
