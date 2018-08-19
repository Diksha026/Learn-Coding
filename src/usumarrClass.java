
import java.util.Scanner;

public class usumarrClass {
    public static void main(String[]args){
        int n,  sum  = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of:");
          n = sc.nextInt();
              int a []=new int[n];
              System.out.println("enter the elements");
              for(int i=0;i<n;i++){
                  a[i]= sc.nextInt();
                  sum = sum+ a[i];
              }
              System.out.println("sum of elements:"+sum);
    }
}