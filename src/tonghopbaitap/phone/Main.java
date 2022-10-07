package tonghopbaitap.phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào name");
//        String n = sc.nextLine();
//        System.out.println("Nhập vào phone");
//        String p= sc.nextLine();
//        PhoneNumber pn = new PhoneNumber(p,n);
//        PhoneBook phoneBook = new PhoneBook();
//        System.out.println("Nhập vào name a");
//        String a = sc.nextLine();
//        System.out.println("Nhập vào phone a");
//        String b= sc.nextLine();
        PhoneNumber pa = new PhoneNumber("aaa","999");
        PhoneNumber pb = new PhoneNumber("aaa","888");
        PhoneNumber pc = new PhoneNumber("bbb","12345");
        PhoneNumber pd = new PhoneNumber("bbb","66666");
        PhoneBook danhba = new PhoneBook();
        danhba.insertPhone("aaa","9999");
        danhba.insertPhone("aaa","9999");
        danhba.insertPhone("bbb","12345");
        danhba.insertPhone("bbb","66666");
        System.out.println(danhba.searchPhone("ccc"));
        System.out.println(danhba.toString());
    }
}
