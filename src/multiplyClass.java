
import java.util.Scanner;

public class multiplyClass {
    public static void main(String[]args){
        int  multi = 1 ,n ;
         System.out. println("enter the value");
           Scanner io = new Scanner(System.in);
             n = io.nextInt();
             
               for(int i = 0; i<= n ; i++){
                   multi = i*n;
                   
               }    
                System.out.println(multi);
     }
    
}
