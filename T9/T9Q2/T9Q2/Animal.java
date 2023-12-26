package T9.T9Q1.T9Q2.T9Q2;
public class Animal extends Organism {
    protected double foodNeed;
    public Animal(double size, double growthRate,double foodNeed) {
        super(size, growthRate);
        this.foodNeed = foodNeed;
    }
    public void show(){
        System.out.printf("The size of the animal is: %.2f\nThe growth rate is: %.2f\nThe food need amount is: %.2f\n",this.size,this.growthRate,this.foodNeed);
    }
    public static void main(String[] args) {
        Animal ani = new Animal(30.21, 30.3, 12.54);
        ani.show();
    }
}
