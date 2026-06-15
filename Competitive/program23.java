class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.PrintReverse(80);
    }
}

class Logic
{
    void PrintReverse(int iNo)
    {
        int iCnt = 0;
        for(iCnt = iNo; iCnt != 0; iCnt--)
        {
            System.out.println(iCnt);
        }
        
    }
}



