import java.util.Scanner;
public class Binarysearchclass {
     public static void main(String[]args){
         int c, first, last, middle,n, search =0,array[];
         Scanner in = new Scanner(System.in);
         System.out.println("enter number of elements search");
         n = in. nextInt();
         array = new int[n];
         System.out.println("enter the value of"+n+"integers value");
         for(c = 0;c < n;c++ )
             array[c]=in.nextInt();
             first =0;
             last =n-1;
             middle = (first + last )/2;
             while( first <= last )
             {
                 if(array[middle] < search)
                     first = middle+1;
                 else if(array[middle] == search )
                 {
                     System.out.println(search +"found at location" +(middle+1)+".");
                     break;
                     
                 }
                 else
                     last = middle -1;
                  middle = (first + last)/2;
                  
             }
           if (first > last )
               System.out.println(search+" isn't present in the list .\n");
             
     }

}
