package session4;

public class Main {
    public static void main(String[] args) {
        //Tạo lớp ẩn danh =>implements
        StudentInterface s = new StudentInterface() {
            @Override
            public void run() {

            }

            @Override
            public void eat() {

            }

            @Override
            public void learn() {

            }
        };
        //Tạo lớp ẩn danh =>extends
        Human h = new Human() {
            @Override
            public void eat() {
                System.out.println("Eat...");


            }

            @Override
            public void run() {

            }
        };
        h.eat();
        Human h2 = new Human() {
            @Override
            public void eat() {
                System.out.println("Eating...");
            }

            @Override
            public void run() {

            }
        };
        h2.eat();
        FptStudentInterface f = new FptStudentInterface() {
            @Override
            public void coding(int y) {

            }
        };

        //lambda expresstion
        FptStudentInterface fs=(y)->{
            //body of coding function
        };


    }

}
