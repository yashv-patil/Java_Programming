// Type 1

import java.util.Scanner;

class program39
{
    public static void main(String []A)
    {
        java.util.Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number");
        iValue = sobj.nextInt();

        if((iValue % 3 == 0)&&(iValue % 5 == 0))
        {
            System.out.println("Number is divisible by 3 and 5");
        }
        else
        {
            System.out.println("Numbre is not Divisible by 3 and 5");
        }

        sobj.close();
    }
}
