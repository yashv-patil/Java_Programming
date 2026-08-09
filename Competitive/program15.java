class program15
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigit(5);
    }
}

class Logic
{
    void SumEvenOddDigit(int iNo)
    {
        int iCnt = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        for(iCnt = 1; iCnt < iNo; iCnt ++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenSum = iEvenSum + iCnt;
            }
            else
            {
                iOddSum = iOddSum + iCnt;
            }
        }
        System.out.println("Even Sum is:"+iEvenSum);
        System.out.println("Even Sum is:"+iOddSum);
    }
}


