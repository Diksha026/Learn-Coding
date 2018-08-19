public class fibonacciClass {
    public static void main(String[]args)
    {
        int a=0,a1= 1 , a2 = 0,i,count =10;
        System.out.println("print the fibonacci series");
        for(i=0;i<count;i++)
        {
            a2 = a+a1;
            System.out.println(""+a2);
            a= a1;
            a1= a2;
        }
        
    }
    
}
