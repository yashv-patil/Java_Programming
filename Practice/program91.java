import java.util.*;

class program91
{
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Digit");
        iValue = sobj.nextInt();

        iRet = dobj.SumEvenDigits(iValue);

        System.out.println("Sum of Even digit : "+iRet);

        sobj.close();

    }
}

class DigitX
{
    public int SumEvenDigits(int iNo)
    {
        int iLastDigit = 0;
        int iSum = 0;
        
        while (iNo != 0)
        {
            iLastDigit = iNo % 10;

            if (iLastDigit % 2 == 0)
            {
                iSum = iSum + iLastDigit;
            }

            iNo = iNo / 10;
        }
        return iSum;
                
    }
}


