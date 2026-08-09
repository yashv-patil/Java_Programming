class program28
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CountFactors(20);
    }
}

class Logic
{
    void CountFactors(int iNo)
    {
        int iCnt = 0;
        int iCountFactor = 0;

        for(iCnt = 2; iCnt <=  iNo/2; iCnt++)
        {
            if (iNo % iCnt == 0) 
            {
                iCountFactor++;
            }
        }
        System.out.println("Factor count is :"+iCountFactor);
    }
}





