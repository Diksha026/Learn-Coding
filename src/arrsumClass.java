
import java.util.Scanner;

public class arrsumClass {
    public static void main(String[]args){
        int[] array ={ 10,20,30,45,65};
          int sum = 0;
          for(int i: array){
              sum = sum +i;
          }
              System.out.println("value"+sum);
    }
}