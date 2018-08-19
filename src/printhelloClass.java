
import java.util.Scanner;

class fa
{
    public static void main(String[]arg)
    {
        int fact=1,n;
       System.out.println("enter the value");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for(int i=1;i<=n;i++)
       {
           fact=fact*i;
           
       }
       System.out.println("value is"+fact);
       
    }
   
}
