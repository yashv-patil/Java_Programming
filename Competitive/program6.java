import java.util.*;

public class program6 
{
    public static void main(String[] args) 
    {
        int iLength = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Elements:");
        iLength = sobj.nextInt();
        
        ArrayX aobj = new ArrayX(iLength);
        
        aobj.Accept(sobj);                          // Importent passing the Reference of Scanner class 
        aobj.Display();
        iRet = aobj.Summation();

        System.out.println("Summation is:"+iRet);   

        sobj.close();

        System.gc();

    }
    
}

class ArrayX 
{

    private int iSize = 0;
    private int []Arr;

    public ArrayX(int X)
    {
        iSize = X;
        Arr = new int[iSize];
    }

    public void Accept(Scanner sobj)                        // Same reference from Scanner object of the main method
    {
        int iCnt = 0;
        
        System.out.println("Enter elemet now:");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of Array are:");

        for(iCnt = 0 ; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int Summation()
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}
