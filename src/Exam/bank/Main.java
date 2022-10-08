package Exam.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input balance");
        double b = sc.nextDouble();
        System.out.println("Input annual interest rate %");
        double r = sc.nextDouble();
        Bank newB = new Bank(b,r);
        System.out.println("Monthly interest is: " + newB.calculateInterest() +" USD");
    }

}
