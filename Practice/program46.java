import java.util.Scanner;

class program46
{
    
    public static void main(String []A)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
    

        System.out.println("Enter the Number");
        iValue = sobj.nextInt();


        NumberX nobj = new NumberX();
        nobj.DisplayFactors(iValue);
        
        sobj.close();

    }
}

class NumberX
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
    
}

// Time Complexity = O(n)
// Where N >= 0