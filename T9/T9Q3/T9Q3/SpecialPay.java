package T9.T9Q1.T9Q3.T9Q3;

public class SpecialPay extends PaySystem {
    public SpecialPay(int hours,double payRate){
        super(hours, payRate);
    }
    public double totalPay(int hours){
        return this.payRate*this.payRate*1.3;
    }
}
