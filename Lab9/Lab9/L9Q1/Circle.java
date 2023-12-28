package Lab9.Lab9.L9Q1;

import java.util.Scanner;

public class Circle extends Shape{
    private double diameter;
    public Circle(String name) {
        super(name); 
        input();
        compute();

    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the diameter of the shape: ");
        this.diameter = sc.nextDouble();

    }
    public void compute(){
        this.perimeter = Math.PI*this.diameter;
        this.area = Math.PI*this.diameter/4;
    }


    
}
