class program7 
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.SumofDigit(1234);
    }
}

class Logic
{
    void SumofDigit(int iNo)
    {
        int iLastDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iLastDigit = iNo % 10;
            iSum = iLastDigit + iSum;
            iNo = iNo / 10;
        }
        System.out.println("Sum of digit is :"+iSum);
    }
}


