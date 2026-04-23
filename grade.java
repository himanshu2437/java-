package ps;
import java.util.Scanner;
public class grade {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("welcome to grade calculator");
        System.out.println("please enter your %");
        float grade = sc.nextFloat();
        if(grade>=90){
            System.out.println("you got 'A'");

        }else if(grade >=75){
            System.out.println("yot got 'B'");
        } else if (grade>=50 ) {
            System.out.println("you got 'c'");

        }else {
            System.out.println("you get 'D'");
        }
    }
}
