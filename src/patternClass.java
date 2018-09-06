public class patternClass {
    public static void main(String[] args){
        int  n  = 9; 
        int i, j, k;
        if( n % 2 == 0)
        {
        k = n/2;
    }
        else
        {
         k= (n/2)+1;
        }
        for( i=k; i>1; i-- )
    {
        for( j = k; j>=1; j-- )
        {
            if (j>i)
                System.out.println(j);
            else 
                 System.out.println( i);
        }
        for( j=2; j<=k; j++)
        {
            if(j>i) 
                System.out.println(j);
            else 
                System.out.println( i);
        }
       System.out.println("\n");
    }    
    for(i=1; i<=k; i++)
    {
        for(j=k;j>=1;j--)
        {
            if(j>i)
                System.out.println(j);
            else 
                System.out.println(i);
        }
        for(j=2;j<=k;j++)
        {
            if(j>i) 
                System.out.println(j);
            else 
                System.out.println(i);
        }
        
       System .out. println("\n");
    } 
} 
  int main()  
{ 
    int n = 9;  
     System.out.println(n);  
    return 0; 
}
}

