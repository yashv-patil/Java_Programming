class program28
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.DisplayFactors(20);
    }
}

class Logic
{
    void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt <=  iNo/2; iCnt++)
        {
            if (iNo % iCnt == 0) 
            {
                System.out.println(iCnt);
            }
        }
    }
}





