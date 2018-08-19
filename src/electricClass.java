public class electricClass {
    public static void main(String[]args)
    {
        int units =  380;
        double  billpay = 0;
        if(units <1000)
        {
             billpay = units * 2.20;
        }
        else if (units<700)
        {
            billpay = 1000*5.20+(units-100)-2;
            
        }
        else if(units>700)
                {
                  billpay = 1000*5.20+600*2+(units-700)*3;
                }
        System.out.println("electricity bill = "+billpay);
        
    }
}
