package T9.T9Q1.T9Q3.T9Q3;

public class PaySystem {
    protected int hours;
    protected double payRate;
    public PaySystem(int hours,double payRate){
        this.hours = hours;
        this.payRate = payRate;
    }
    public double totalPay(int hours){
        return this.hours*this.payRate;
    }
}
