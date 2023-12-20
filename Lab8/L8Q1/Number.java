package Lab8.L8Q1;

import java.util.Random;

public class Number{
    Random r = new Random();
    private int[] numberArray;
    public Number(){
        numberArray = new int[10];
        for(int i = 0;i<10;i++){
            this.numberArray[i] = r.nextInt(101);
        }
    }
    public Number(int n){
        numberArray = new int[n];
        for(int i = 0; i<n;i++){
            this.numberArray[i] = r.nextInt(101);
        }
    }
    public Number(int n,int amount){
        numberArray = new int[n];
        for(int i = 0; i<n;i++){
            this.numberArray[i] = r.nextInt(amount+1);
        }
    }
    public void displayAll(){
        for(int i = 0;i<this.numberArray.length;i++){
            System.out.printf(this.numberArray[i]+" ");
        }
        System.out.println();
    }
    public void getEven(){
        System.out.print("Even numbers : ");
        for(int i = 0;i<this.numberArray.length;i++){
            if(this.numberArray[i]%2==0){
                System.out.printf(this.numberArray[i]+" ");
            }
        }
        System.out.println();
    }
    public void getPrime(){
        System.out.print("Prime number(s): ");
        for(int i=0 ; i<numberArray.length ; i++){
            boolean prime = true;
            if(numberArray[i]==1 || numberArray[i]==0){
                prime = false;
            }
            
            for(int j=2 ; j<=Math.sqrt(numberArray[i]) ; j++){
                
                if(numberArray[i]%j==0){
                    prime = false;
                    break;
                }
            }
            
            if(prime){
                System.out.print(numberArray[i] + " ");
            }
        }
        System.out.println();
    }
    public void getMax(){
        System.out.print("Maximum number: ");
        int max = this.numberArray[0];
        for(int i = 1;i<this.numberArray.length;i++){
            if(this.numberArray[i]>max){
                max = this.numberArray[i];
            }
        }
        System.out.println(max);
    }
    public void getMin(){
        System.out.print("Minimum number: ");
        int min = this.numberArray[0];
        for(int i = 1;i<this.numberArray.length;i++){
            if(this.numberArray[i]<min){
                min = this.numberArray[i];
            }
        }
        System.out.println(min);
    }
    public void getAverage(){
        System.out.print("Average : ");
        int sum = 0;
        for(int i = 0;i<this.numberArray.length;i++){
            sum+=this.numberArray[i];
            }
        int Average = sum/this.numberArray.length;
        System.out.println(Average);
    }
    public void getSquare(){
        System.out.print("Square :");
        for(int i = 0;i<this.numberArray.length;i++){
                System.out.print(Math.pow(this.numberArray[i],2)+" ");
            }
        }
    }
