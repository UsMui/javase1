package tonghopbaitap.phone;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public ArrayList<String> phoneList;

    public PhoneNumber() {
    }

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phoneList = new ArrayList<>();
        this.phoneList.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhoneList() {
        return phoneList;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "name='" + name + '\'' +
                ", phoneList=" + phoneList +
                '}';
    }

    public String layTen(){
        String ten = name.trim();
        if(ten.indexOf(" ")>0){
            int vt = ten.lastIndexOf(" ");
            return ten.substring(vt+1);
        }
        return ten;
    }


}
