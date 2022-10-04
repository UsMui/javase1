package book;

import java.util.Objects;

public class TacGia {
    private String tenTacGia;
    private Date ngaySinh;

    public TacGia() {
    }

    public TacGia(String tenTacGia, Date ngaySinh) {
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "TacGia{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", ngaySinh=" + ngaySinh +
                '}';
    }
}

