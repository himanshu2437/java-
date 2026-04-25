package ps;
import java.util.Scanner;
public class greterleass3 {
    public static void main (String [] args){
        Scanner ip = new Scanner (System.in );
        int num = ip.nextInt();
        if(num<3){
            System.out.println("the number is less than 3");
        }else {
            System.out.println("the number is greater than 3");
        }


    }
}
