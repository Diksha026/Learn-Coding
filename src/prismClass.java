
import java.util.Scanner;

public class prismClass {
    public static void main(String[]args)
    {
         Scanner  sc = new Scanner (System.in);
         System.out.println("enter the area of base");
         double base = sc.nextDouble();
         System.out.println("enter the height");
         double height = sc.nextDouble();
          double area = base* height;
          System.out.println("volume of prism"+area);
          
     }    
}
