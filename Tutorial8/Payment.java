public class Payment {
    private int amount;
    public Payment(int amount){
        this.amount = amount;
    }
    public void pay(int amount){
        this.amount = amount;
    }
    public void pay(int amount,String number){
        this.amount = amount;
    }
    public void pay(int amount,String cardHolderName,String cardType,String expiration,String validationCode){
        this.amount =amount;
    }

}
