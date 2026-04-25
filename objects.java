package ps;
import java .util.Scanner ;
class car {
    int speed ;
    String Brand ;
    String color;
    int model;
    void driving (){
        System.out.println(Brand+" is driving at the speed "+ speed);
        System.out.println( color+ " is the colour and  model is "+ model);
    }
}
public class objects {
    public static void main (String [] args){
        Scanner sc =  new Scanner (System.in );
        car  mycar = new  car ();
        System.out.println("enter the Speed");

        mycar.speed = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the brand");
        mycar.Brand = sc.nextLine(); // for taking input from the user

        System.out.println("enter the Model");
        mycar.model = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the Color");
        mycar.color = sc.nextLine();

        System.out.println("thanks you !");
        mycar.driving();

//        mycar.driving();
        System.out.println("thanks you !");




    }

}

