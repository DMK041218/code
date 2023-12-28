package Lab9.Lab9.L9Q1;

import java.util.Scanner;

public class Rectangle extends Shape {
    protected double width,length;
    public Rectangle(String name) {
        super(name);
        input();
        compute();
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the shape: ");
        this.length = sc.nextDouble();
        System.out.println("Please enter the width of the shape: ");
        this.width = sc.nextDouble();
    }
    public void compute(){
        this.perimeter = 2*(this.length+this.width);
        this.area = this.length*this.width;
    }
    

    
}
