package Lab8.L8Q1;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;
    Scanner sc = new Scanner(System.in);
    public Fraction(){
        System.out.println("Please enter the numerator: ");
        this.numerator = sc.nextInt();
        System.out.println("Please enter the denominator: ");
        this.denominator = sc.nextInt();
    }
    public void setNumerator(int numerator ){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    public int gcd(int a,int b){
        if(a==b){
            return a;
        }
        else if(a>b){
            if(a%b==0){
                return b;
            }
            else{
                return gcd(b,a%b);
                }
            }
        else{
            if(b%a==0){
                return a;
            }
            else{
                return gcd(a,b%a);
            }
        }
        }
    
    public void display(){
        int div = gcd(getNumerator(),getDenominator());
        System.out.printf("Reduced fraction: %d/%d\n",this.numerator/div,this.denominator/div);
    }
}

