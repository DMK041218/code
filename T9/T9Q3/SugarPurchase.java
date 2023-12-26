package T9.T9Q1.T9Q3;
public class SugarPurchase extends PurchaseSystem{
    protected double sugar;
    public SugarPurchase(String code, double quantity, double unitPrice,double sugar) {
        super(code, quantity, unitPrice);
        this.sugar = sugar;
        //TODO Auto-generated constructor stub
    }
    public double calculate(){
        return this.unitPrice*this.quantity*this.sugar;
    }
}