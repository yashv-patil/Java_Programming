class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.FindLargestDigit(1826);
    }
}

class Logic
{
    void FindLargestDigit(int iNo)
    {
        int iLast = 0;
        int iLarge = iNo % 10;

        while (iNo != 0) 
        {
            iLast = iNo % 10;

            if (iLarge < iLast) 
            {
                iLarge = iLast;
            }
            
            iNo = iNo / 10;  
        }
        System.out.println(iLarge);

      
    }
}



