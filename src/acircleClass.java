
import java.util.Scanner;

public class acircleClass {
     public static void main(String[]args)
     {
         
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the  radius");
        double r = sc.nextDouble();
        double area = (22*r*r)/7;
        System.out.println("area of circle"+area);
     }
}