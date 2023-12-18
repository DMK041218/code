package T8Q2;

public class Digit {
    private String number;
    public Digit(String number){
        this.number = number;
    }
    public int digitMultiplication(){
        int result = 1;
        for(int i = 0;i<this.number.length()-1;i++){
            result *= this.number.charAt(i);
        }
        return result;
    }
    public void display(){
        System.out.println("The result is: "+digitMultiplication());
    }
}
