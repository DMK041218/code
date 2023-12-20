package Lab8.L8Q1;

import java.util.Random;

public class Game {
    private String name1;
    private String name2;
    private int score1;
    private int score2;
    Random r = new Random();
    public Game(String name1,String name2){
        this.name1 = name1;
        this.name2 = name2;
        this.score1 =0;
        this.score2 = 0;
    }
    public void roll(){
        do{
        this.score1 += r.nextInt(6)+1;
        this.score2 += r.nextInt(6)+1;
        if(this.score1>100&&this.score2<100){
            System.out.println("Player "+this.name1+" won the game!");
        }
        else if(this.score2>100&&this.score1<100){
            System.out.println("Player "+this.name2+" won the game!");
        }
        else if(this.score1==100&&this.score2==100){
            System.out.println("Tie!");
        }
        }
        while(this.score1<100&&this.score2<100);
    }

}
