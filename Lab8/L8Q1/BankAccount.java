package Lab8.L8Q1;

public class BankAccount {
    private final String name;
    private final String IC;
    private final String passport;
    private double balance;
    public BankAccount(String name,String IC,String passport,double balance){
        this.name = name;
        this.IC = IC;
        this.passport = passport;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(this.balance-amount>0){
            this.balance -= amount;
        }
        else{
            System.out.println("Not sufficient funds");
        }
    }
    public void display(){
        System.out.println("Current balance: "+this.balance);
    }
}
