package baitapjavafx;

public class PhoneNumber {
    public String name;
    public String phone;

    public PhoneNumber() {
    }

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: "+name+"-"+"Phone: "+phone+"\n";
    }
}
