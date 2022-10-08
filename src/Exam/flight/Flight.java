package Exam.flight;

public class Flight {
    public int number;
    public String destination;

    public Flight() {
        this.destination = null;
        this.number = 0;
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }
    public void display(){
        System.out.println(getNumber()+","+getDestination());
    }

}
