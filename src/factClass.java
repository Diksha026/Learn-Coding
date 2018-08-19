
import java.util.Scanner;
public class factClass {
     public static void main(String[]args){
         int   fact = 1 , n;
         System.out. println("enter the value");
         Scanner io = new Scanner(System.in);
            n = io.nextInt();
            for (int i=1; i<=n; i++)
            {
                 fact = fact*i;
            }
            System.out.println(fact);
     }
    
}
