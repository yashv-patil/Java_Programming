class program28
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CountEvenOddRange(10);
    }
}

class Logic
{
    void CountEvenOddRange(int iNo)
    {
        int iEvenCnt = 0;
        int iOddCnt = 0;
        int iCnt = 0;
        
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenCnt++;
            }
            else
            {
                iOddCnt++;
            }
        }
        System.out.println("Even count is "+iEvenCnt);
        System.out.println("Odd count is "+iOddCnt);
      
    }
}





