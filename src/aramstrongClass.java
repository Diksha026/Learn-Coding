public class aramstrongClass {
     public static void main(String[]args)
     {
         int a, temp,c = 0;
          int n = 153;
           temp = n;
           while(n>0)
           {
               a = n%10;
               n = n/10;
               c = c+(a*a*a);
               
               
           }
            if (temp == c)
                 System.out.println("armstrong no");
             else
                 System.out.println("not a aramstrong no");
     }
}
