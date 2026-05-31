import java.util.Scanner;

class program69
{
    
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the Number:");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        
        bRet = nobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println("It is Prime Number");
        }
        else
        {
            System.out.println("It is Not Prime Number");
        }
        
        sobj.close();

    }
}

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlage = false;

        for(bFlage = true, iCnt = 2; iCnt <= (iNo / 2); iCnt++)     //added bflag = td      
        {
            if ((iNo % iCnt) == 0)
            {
                bFlage = false;
                break;                      
            }
        }

        return bFlage;
        
    }
    
}
