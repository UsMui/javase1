package assignment3;

public class KhachHang {
    public int code;
    public String fullName;
    public String data;
    public int quantity;

    public KhachHang() {
    }

    public KhachHang(int code, String fullName, String data, int quantity) {
        this.code = code;
        this.fullName = fullName;
        this.data = data;
        this.quantity = quantity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int thanhTien(){
        return quantity*2000;
    }
}
