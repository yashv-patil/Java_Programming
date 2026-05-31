import java.util.*;

class program87
{
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Digit");
        iValue = sobj.nextInt();

        iRet = dobj.CountOddDigits(iValue);

        System.out.println("Number of Odd Digits are : "+iRet);

        sobj.close();

    }
}

class DigitX
{
    public int CountOddDigits(int iNo)
    {
        int iLastDigit = 0;
        int iCnt = 0;
        
        while (iNo != 0)
        {
            iLastDigit = iNo % 10;

            if (iLastDigit % 2 != 0)
            {
                iCnt ++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
                
    }
}


