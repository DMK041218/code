package Lab8.L8Q1;

public class testBurger {
    public static void main(String[] args) {
        Burger a  = new Burger("a");
        Burger b = new Burger("b");
        Burger c =  new Burger("c");
        a.sold(300);
        b.sold(29);
        c.sold(30);

        a.display();
        b.display();
        c.display();
        System.out.println("Total sold: "+Burger.getTotalNumber());
        
    }
}
