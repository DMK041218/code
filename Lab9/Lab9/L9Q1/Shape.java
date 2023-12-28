package Lab9.Lab9.L9Q1;

public class Shape {
    protected String name;
    protected double perimeter;
    protected double area;
    public Shape(String name){
        this.name = name;
    }
    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }
    public double getPerimeter(){
        return this.perimeter;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getArea(){
        return this.area;
    }
    public void display(){
        System.out.printf("The name of the shape is: %s\nThe perimeter is: %.2f\nThe Area is: %.2f\n",this.name,this.perimeter,this.area);
    }
}
