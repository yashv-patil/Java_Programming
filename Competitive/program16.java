class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckSign(0);
    }
}

class Logic
{
    void CheckSign(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println("Number is Positive");
        }
        else if (iNo < 0) 
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is 0");
        }
    }
}

// Assignment no 18 DOne


