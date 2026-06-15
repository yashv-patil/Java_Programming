class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumber(5);
    }
}

class Logic
{
    void SumEvenNumber(int iNo)
    {
        int iCnt = 0;
        int iEvenSum = 0;

        for(iCnt = 0; iCnt < iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenSum = iEvenSum + iCnt;
            }
        }
        System.out.println("Even sum is:"+iEvenSum);
    }
}



