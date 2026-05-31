import java.util.*;

class program84
{
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Digit");
        iValue = sobj.nextInt();

        iRet = dobj.CountDigits(iValue);

        System.out.println(+iRet);

        sobj.close();

    }
}

class DigitX
{
    public int CountDigits(int iNo)
    {
        int iCnt = 0;
        
        while (iNo != 0)
        {
            iCnt ++;
            iNo = iNo / 10;
        }
        return iCnt;
                
    }
}


