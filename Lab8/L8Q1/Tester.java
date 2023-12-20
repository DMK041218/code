package Lab8.L8Q1;

public class Tester {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Number a = new Number(10);
        a.displayAll();
        a.getAverage();
        a.getEven();
        a.getPrime();
        a.getSquare();
        WeightCalculator w = new WeightCalculator(18, 178);
        w.calculateRecommendWeight();
        w.display();
        Fraction f = new Fraction();
        f.display();
        Game g = new Game("william", "jack");
        g.roll();
    }
}
