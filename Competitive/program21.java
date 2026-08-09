class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2,5);
    }
}

class Logic
{
    void CalculatePower(int base, int exp)
    {
        int iCnt = 0;
        int iPower = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iPower = base * iPower;
        }
        System.out.println(iPower);
       
    }
}



