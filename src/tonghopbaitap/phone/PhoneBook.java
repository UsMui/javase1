package tonghopbaitap.phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> phoneBook;

    public PhoneBook() {
        this.phoneBook = new ArrayList<>();
    }

    public ArrayList<PhoneNumber> getPhoneBook() {
        return phoneBook;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }

    @Override
    void insertPhone(String name, String phone) {
        for(PhoneNumber pn:phoneBook){
            if(pn.getName().equals(name)){
                if(pn.getPhoneList().contains(phone)){
                    return;
                }
                pn.getPhoneList().add(phone);
                return;
            }
        }
        phoneBook.add(new PhoneNumber(name,phone));
    }

    @Override
    void removePhone(String name) {
        for(PhoneNumber pn:phoneBook){
            if(pn.getName().equals(name)){
                phoneBook.remove(pn);
            }
        }
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber pn:phoneBook){
            if(pn.getName().equals(name)){
                pn.getPhoneList().remove(oldPhone);
                pn.getPhoneList().add(newPhone);
            }
        }

    }

    @Override
    PhoneNumber searchPhone(String name) {
        for(PhoneNumber pn:phoneBook){
            if(pn.getName().equals(name)){
                return pn;
            }
        }

        return null;
    }

    @Override
    void sort() {
        Collections.sort(phoneBook, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.layTen().compareTo(o2.layTen());
            }
        });

    }
}
