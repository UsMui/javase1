package Exam.flight;

public class Main {
    public static void main(String[] args) {

        Flight  g1 = new Flight(857, "Toronto");
        g1.display();
        Flight g2 = new Flight(-153,"Toronto");
        g2.display();
        Flight g = new Flight();
        g.display();

    }
}
