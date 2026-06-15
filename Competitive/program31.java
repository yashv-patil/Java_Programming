class program28
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.PrintDivisibleBy2and3(20);
    }
}

class Logic
{
    void PrintDivisibleBy2and3(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <=  iNo; iCnt++)
        {
            if (iCnt % 2 == 0 && iCnt % 3 == 0) 
            {
                System.out.println("Numbers that are divisible by 2 and 3 are:"+iCnt);
            }
        }
        
    }
}





