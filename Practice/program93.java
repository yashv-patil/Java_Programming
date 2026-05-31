import java.util.*;

class program93
{
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter Digit");
        iValue = sobj.nextInt();

        bRet = dobj.CheckPallindrom(iValue);

        if(bRet == true)
        {
            System.out.println("Numbere is Pallindrom");
        }
        else
        {
            System.out.println("Number is not Pallindrom");
        }

        sobj.close();

    }
}

class DigitX
{
    public boolean CheckPallindrom(int iNo)
    {
        int iLastDigit = 0;
        int iRev = 0;
        int iTemp = iNo;                // For Comparison
        
        while (iNo != 0)
        {
            iLastDigit = iNo % 10;
            iRev = (iRev * 10) + iLastDigit;
            iNo = iNo / 10;
        }

        if (iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        } 

    }
}


