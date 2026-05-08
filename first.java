package Array;
import java .util.Scanner;

public class first {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lenght of the array : ");

        int n  = sc.nextInt();

        int [] arr  = new int [n];
        for(int i = 0 ; i<n ;i++){
            arr[i] = sc.nextInt();
            arr[i] = arr[i]+10;


        }
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
