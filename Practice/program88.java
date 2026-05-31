import java.util.*;

class program88
{
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;

        System.out.println("Enter Digit");
        iValue = sobj.nextInt();

        dobj.CountEvenOddDigits(iValue);

        sobj.close();

    }
}

class DigitX
{
    public void CountEvenOddDigits(int iNo)
    {
        int iLastDigit = 0;
        int iCntEven = 0;
        int iCntOdd = 0;
        
        while (iNo != 0)
        {
            iLastDigit = iNo % 10;

            if (iLastDigit % 2 == 0)
            {
                iCntEven ++;
            }
            else
            {
                iCntOdd ++;
            }  
            iNo = iNo / 10;
        }
        System.out.println("Even count is "+iCntEven);
        System.out.println("Odd count is "+iCntOdd);
                
    }
}


