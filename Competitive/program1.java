import java.util.Scanner;

class program1
{
    public static void main(String [] A)
    {
        int iValue1 = 5;
        int iValue2 = 15;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second number:");
        iValue2 = sobj.nextInt();


        NumberX dobj = new NumberX();
        iRet = dobj.Divide(iValue1, iValue2 );

        System.out.println("Divisin is:"+iRet);

        sobj.close();
    }
}

class NumberX
{
    int Divide(int iNo1, int iNo2)
    {
        int iAns = 0;

        if (iNo2 == 0)
        {
            return -1;
        }

        iAns = iNo1 / iNo2 ;

        return iAns;

    }
}