class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.Checkperferct(6);
    }
}

class Logic
{
    int iCnt = 0;
    int iSum = 0;

    void Checkperferct(int iNo)
    {
        
        for(int iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0) // Found a divisor
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            System.out.println(iNo + " is a Perfect Number");
        }
        else
        {
            System.out.println(iNo + " is NOT a Perfect Number");
        }
       
      
    }
}



