package practice;

import java.util.Scanner;

public class compoundIntrest {
    static void main(String[] args) {
        Scanner sc  = new Scanner( System.in );

        System.out.println("enter the principle amount : ");
        int p  = sc.nextInt();
        System.out.println("enter the rate of the intrest :  ");
        float rate= sc.nextFloat();
        System.out.println(" enter the time in year : ");
        float time =  sc.nextFloat();
        double ci = p*(Math.pow((1+rate/100),time)); // math is a function used to calculate the power

        System.out.println( ci+" is the compond intrest of the amount  " + p );


    }
}
