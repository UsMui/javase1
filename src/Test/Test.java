package Test;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();
        //stackChuoi.push("giatri") =>đưa giá trị vào stack
        //stackChuoi.pop()=>lấy giá trị ra xóa khỏi stack
        //stackChuoi.peek()=>lấy giá trị ra nhưng không xóa khỏi stack
        //stackChuoi.clear();=>xóa tất cả phần tử trong stack;
        //stackChuoi.contains("giatri") => xác định giá trị có tồn tại trong stack hay không
        //stackChuoi.size() lấy ra độ dài của chuỗi
        //Ví dụ đảo ngươicj chuỗi

        System.out.println("Nhập vào chuỗi");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            stackChuoi.push(s.charAt(i)+"");
        }
        for(int i=0;i<s.length();i++){
            System.out.print(stackChuoi.peek());
        }
    }
}
