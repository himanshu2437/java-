package practice;

import java.util.Scanner;

public class arithmaticOps {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in );
        System.out.println("enter the nuber want to operation ");
        int num1 = sc.nextInt();
        System.out.println("enter the second number ; ");
        int num2 = sc.nextInt();
        int add = num1+ num2;
        int sub = num1 - num2;
        int mul = num1*num2;

        int mod = num1%num2;
        System.out.println(add);
        System.out.println(mul);
        System.out.println(sub);
        System.out.println(mod);


    }
}
