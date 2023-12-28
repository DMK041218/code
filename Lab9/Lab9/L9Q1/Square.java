package Lab9.Lab9.L9Q1;

import java.util.Scanner;

public class Square extends Shape{
    private double length;
    public Square(String name){
        super(name);
        input();
        compute();
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the shape: ");
        this.length = sc.nextDouble();
    }
    public void compute(){
        this.area = Math.pow(this.length, 2);
        this.perimeter = 4*this.length;
    }
    
}
