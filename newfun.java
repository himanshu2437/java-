package ps;
import  java .util.Scanner;

public class newfun {
 public static void main (String[] args){
     System.out.println("Enter the two number : ");
     Scanner sc = new Scanner (System.in);
     int num1  =sc.nextInt();
     int num2 = sc.nextInt();
     int show;
     show =mul(num1,num2);
     System.out.println(show);
     System.out.println("thanks for using the program ");

 }
public  static int mul(int m, int n ) {

     int res = 1 ;
     for (int i = 1 ;i<5 ; i++ ){
         res  = m*n*i*res;
     }
     return res;

}

}
