package ps;
import java .util.Scanner ;
public class arr1 {
    static void main (String[] Args ){
        Scanner sc =  new Scanner(System.in);

        System.out.print("Welcome to array traversing ");
        System.out.println("enter the number of element in the array ");
        int n = sc.nextInt();
        int [] arm = new int [n];
        for (int i =0 ;i<n ;i++ ){
            arm [i ] = sc.nextInt();
        }
        int [] aug =  {12,43,65, 3, 3};
        for (int i = 0 ;i<=4; i++){
            System.out.println(aug[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                for (int i = 0 ; i<n ; i++ ){
            System.out.println( arm[i] );
        }
    }
}
