package T9.T9Q1.T9Q3;


public class PurchaseSystem {
    protected String code;
    protected double quantity;
    protected double unitPrice;
    protected double total;
    public PurchaseSystem(String code,double quantity, double unitPrice){
        this.code = code;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public double calculate(){
        return this.quantity*this.unitPrice;
    }
    public void display(){
        System.out.printf("The code is: %s\nThe quantity is %6.2f\nThe unit price is: %6.2f\n",this.code,this.quantity,this.unitPrice);
    }

}
