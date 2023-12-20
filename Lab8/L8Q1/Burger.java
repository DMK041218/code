package Lab8.L8Q1;

public class Burger {
    private String ID;
    private int number;
    private static int totalNumber = 0;
    public Burger(String ID){
        this.ID = ID;
        this.number = 0;
    }
    public void sold(int burgersold){
        this.number += burgersold;
        totalNumber += burgersold;
    }
    public int getNumber(){
        return this.number;
    }
    public static int getTotalNumber(){
        return totalNumber;
    }
    
    public void display(){
        System.out.println(this.ID+" sold "+getNumber());
    }

}
