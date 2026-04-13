package practice;

import java.util.Scanner;

public class simpleItrest {
    static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in );
        System.out.println("to find simple intrest enter the principle amount : ");
        int p = sc.nextInt();

        System.out.println("enter the intrest rate : ");
        float rate = sc.nextFloat();

        System.out.println("enter the time : ");
        int time = sc.nextInt();
        float si = (p*rate*time)/100;
        System.out.println("the amount of si is : " + si);
    }
}
