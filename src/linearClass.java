
import java.util.Scanner;

class linear {
    public static void main(String[] args) {
        int arr[]={};
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        arr = new int [n];
        int search = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j = 0;j<1; j++)
        {
            if (search == arr[j]){
                System.out.println("found"+(j+1));
                break;
            }
        }
        if(search == n){
            System.out.println("not found");
        }
                
    }
}
            
   