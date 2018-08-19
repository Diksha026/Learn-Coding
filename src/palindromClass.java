public class palindromClass {
    public static void main(String[]args){
        int r = 0, n, digit; 
         n = 424;
         while(n > 0){
             digit = n%10;
             r = (digit *10)+r;
             n = n/10;
         }
         if (r == n)
              System.out.println("it is a pallindrom");
          else
              System.out.println("it is not a palindrom");
         }
 } 
    
