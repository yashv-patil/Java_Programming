import java.util.Scanner;

class program5
{
    public static void main(String [] A)
    {
        int iValue = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter  number:");
        iValue = sobj.nextInt();

        NumberX dobj = new NumberX();

        dobj.Accept(iValue);
    
        sobj.close();
    }
}

class NumberX
{
    void Accept(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*");
        }
    }
}
    
