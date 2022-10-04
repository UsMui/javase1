package assignment4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> phoneList;

    public PhoneBook() {
        this.phoneList = new ArrayList<PhoneNumber>();
    }

    public PhoneBook(ArrayList<PhoneNumber> phoneList) {
        this.phoneList = phoneList;
    }

    public ArrayList<PhoneNumber> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(ArrayList<PhoneNumber> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneList=" + phoneList +
                '}';
    }

    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p: phoneList){
            if(p.getName().equals(name)){
                if(p.getPhone().contains(phone)){
                    return;
                }
                p.getPhone().add(phone);
                return;
            }
        }
        PhoneNumber pn = new PhoneNumber(name,phone);
        this.phoneList.add(pn);

    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber p: phoneList){
            if(p.getName().equals(name)){
                this.phoneList.remove(p);
            }
        }

    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber p: phoneList){
            if(p.getName().equals(name)){
                p.getPhone().remove(oldPhone);
                p.getPhone().add(newPhone);
                return;
            }
        }

    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for(PhoneNumber p: phoneList){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;

    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

    }
}
