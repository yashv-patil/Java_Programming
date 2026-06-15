class program8
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckPalindrom(123);
    }
}

class Logic
{
    void CheckPalindrom(int iNo)
    {
        int iLastDigit = 0;
        int iReverse = 0;
        int iTemp = iNo;

        while(iNo != 0)
        {
            iLastDigit = iNo % 10;
            iReverse = (iReverse * 10) + iLastDigit;
            iNo = iNo / 10;
        }
        if(iTemp == iReverse)
        {
            System.out.println("Number is Palindrom");
        }
        else
        {
            System.out.println("Number is not Palindrom");
        }
    }
}


