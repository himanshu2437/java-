package practice;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main (String [] args ){
        Scanner sc  = new Scanner( System.in);
        System.out.println("welcome to program that calculate the are of the triangle ");
        System.out.println("enter the hight");
        float hight = sc.nextFloat();
        System.out.println("enter the width of the triangle ");
        float width = sc.nextFloat() ;
        double area  =  ((0.5))*(hight*width);
        System.out.println("the area of triangle is " + area);



    }
}
