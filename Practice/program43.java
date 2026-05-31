// Type 2

import java.util.Scanner;


class program43
{
    public static boolean CheckDivisible(int iNo)
    {
        if((iNo % 3 == 0)&&(iNo % 5 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
            
    }
    
    public static void main(String []A)
    {
        java.util.Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean Ret = false;

        System.out.println("Enter the Number");
        iValue = sobj.nextInt();

        Ret = CheckDivisible(iValue); 
         
        if (Ret == true)
        {
            System.out.println("Number is Divisible by 3 & 5");
        }
        else
        {
            System.out.println("Number is Not Divisible by 3 & 5");
        }
        
        sobj.close();

    }
}
