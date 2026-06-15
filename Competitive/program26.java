class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.FindSmallestDigit(45872);
    }
}

class Logic
{
    void FindSmallestDigit(int iNo)
    {
        int iLast = 0;
        int iSmall = iNo % 10;

        while (iNo != 0) 
        {
            iLast = iNo % 10;

            if (iSmall > iLast) 
            {
                iSmall = iLast;
            }
            
            iNo = iNo / 10;  
        }
        System.out.println(iSmall);

      
    }
}





