import java.util.*;

class program81
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
    void DisplayDigit(int iNo)
    {
        int iLastDigit = 0;

        for(; iNo != 0; )                           // new 
        {
            iLastDigit = iNo % 10;
            System.out.println(iLastDigit);
            iNo = iNo / 10;

        }
            
        
    }
}


