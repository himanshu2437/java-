package practice;
import java .util.Scanner;
public class LCM {
    static void main(String[] args) {
        Scanner sc   =new Scanner(System.in);
        System.out.println("enter the first number ");
        int firstnum = sc.nextInt();
        System.out.println("enter the Second number ");
        int secodnum = sc.nextInt();

    }
    public static int fact (int f, int s ){
        int i  =1;
        while (i<= s){
            int factor  = f*i;
             if(factor%s==0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
