import java.util.*;

class program79
{
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;

        System.out.println("Enter Digit");
        iValue = sobj.nextInt();

        dobj.DisplayDigit(iValue);


        sobj.close();

    }
}

class DigitX
{
    public void DisplayDigit(int iNo)
    {
        int iLastDigit = 0;

        while (iNo != 0)
        {
            iLastDigit = iNo % 10;
            System.out.println(iLastDigit);

            iNo = iNo / 10;
        }
            
        
    }
}


