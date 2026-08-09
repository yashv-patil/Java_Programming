class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.PrintsDigits(3752);
    }
}

class Logic
{
    void PrintsDigits(int iNo)
    {
        int iCnt = 0;

        String str = Integer.toString(Math.abs(iNo));

        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            System.out.println(str.charAt(iCnt));
        }
        
    }
}



