
import java.util.Scanner;


public class swapClass {
    public static void main(String[]args){
        int a,b, temp;
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         b = sc.nextInt();
         System.out.println("enter the value");
         temp = a;
         a = b;
         b = temp;
       System.out.println("value"+a);
       System.out.println("value"+b);  
    }
    
}
