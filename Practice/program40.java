// Type 2

import java.util.Scanner;


class program40
{
    Void CheckDivisible(int iNo)
    {
        if((iNo % 3 == 0)&&(iNo % 5 == 0))
        {
            System.out.println("Number is divisible by 3 and 5");
        }
        else
        {
            System.out.println("Numbre is not Divisible by 3 and 5");
        }
            
    }
    
    
    public static void main(String []A)
    {
        java.util.Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number:");
        iValue = sobj.nextInt();

        CheckDivisible(iValue);             //Error Because Static Method i.e main can't call or access the Non static method i.e CheckDivisible

    }
}
