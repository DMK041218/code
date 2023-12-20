package Lab8.L8Q1;

public class WeightCalculator {
    private int age;
    private double height;
    private double recommendWeight;
    public WeightCalculator(int age,double height){
        this.age = age;
        this.height = height;
    }
    public void calculateRecommendWeight(){
        this.recommendWeight = (height-100+age/10)*0.9;
    }
    public void display(){
        System.out.println("The user's age: "+this.age);
        System.out.println("The user's height: "+this.height);
        System.out.printf("The recommend weight: %.2f\n",this.recommendWeight);
    }
}
