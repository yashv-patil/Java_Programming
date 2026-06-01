import java.util.Scanner;

class program4
{
    public static void main(String [] A)
    {
        int iValue = 0;
        
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter  number:");
        iValue = sobj.nextInt();

        NumberX dobj = new NumberX();
        bRet = dobj.Check(iValue);

        if (bRet == true)
        {
            System.out.println("Divided by 5");
        }
        else
        {
            System.out.println("Not Divided bt 5");
        }

        sobj.close();
    }
}

class NumberX
{
    boolean Check(int iNo)
    {
        if((iNo % 5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
    
