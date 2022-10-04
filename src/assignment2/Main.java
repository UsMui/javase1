package assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(1,"Trinh Hoa",1000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn rút: ");
        int x = sc.nextInt();
        if(myAccount.debit(x)){
            System.out.println("Rút thành công, số dư hiện tại: "+myAccount.getBalance());
        }else{
            System.out.println("Số dư tài khoản không đủ hoặc nhập sai số tiền");
        }

        Account nam =new Account(2,"Cao Hoàng Nam",10000);
        System.out.println("Nhập số tiền cần chuyển");
        int y =sc.nextInt();
        if(myAccount.tranferTo(nam,y)){
            System.out.println("Chuyển thành công sang tài khoản "+nam.getName());
        }else{
            System.out.println("Chuyển khoản thất bại");
        }

    }
}
