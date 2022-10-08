package Exam.bank;

public class Bank {
    public double balance;
    public double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }
    public double calculateInterest (){
        return balance*(rate/1200);
    }
}
