package Exam.flight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Flight  g1 = new Flight(857, "Toronto");
        g1.display();

        Flight g = new Flight();
        g.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of flight");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Input destination");
        String des=sc.nextLine();

        if(num<0){
            Flight fl = new Flight();
            fl.display();
        }else{
            Flight fl = new Flight(num,des);
            fl.display();
        }



    }
}
