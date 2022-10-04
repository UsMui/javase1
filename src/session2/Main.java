package session2;

import session1.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Car c = new Car();
        Human h = new Human();
        h.run(5);
        h.run("Chó đuổi");
        h.run(10,"Chó đuổi");
        Human h2 = new Human("Nguyễn Tuấn Anh");
        System.out.println(h2.name);

        Scanner sc= new Scanner(System.in);
        Car c1 =new Car();
        c1.brand ="Honda";
        c1.year = 2020;
        Student s = new Student("Nguyễn Văn An","098499999","8-TTT",18,new Car());

        s.girlFriends[0]="Ngọc Trinh";
        s.girlFriends[1]="Thị Nở";
        s.myCar.brand="Toyota";



        int [] marks = new int[4];
        marks[0] = 19;

        Student[] st = new Student[10];

        st[0] = new Student("HHH","098499999","8-TTT",18,c1);

        for(int i=0;i<st.length;i++){
            st[i]= new Student();
        }
        //set 10 sinh viên theo độ tuoi tu 20-29
        for(int i=0;i<st.length;i++){
            st[i].setAge(i+20);
        }

        for(int i=0;i<st.length;i++){
            System.out.println(st[i].getAge());
        }
        for(Student a: st){
            System.out.println(a.getAge()); //a=st[i]; for each
        }

    }
}
