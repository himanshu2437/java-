package practice;
import java .util.Scanner;
public class prime {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to prime number checker ");
        System.out.println(("enter the number "));
        int num = sc.nextInt();
        boolean prime = isprime(num);
        if(prime) {
            System.out.println("Prime Number");

        }else {
            System.out.println("Not Prime Number");
        }

    }
    public static boolean isprime(int n ){
        int i =2 ;
        while(i <n){
            if(n%i==0){
                return false;
            }
            i++;
        }

        return true;
    }

}
