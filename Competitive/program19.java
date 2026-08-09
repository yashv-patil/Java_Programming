class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}

class Logic
{
    void CheckDivisible(int iNo)
    {
        if(iNo % 5 == 0 && iNo % 11 == 0)
        {
            System.out.println("It is Divisible by 5 and 11");
        }
        else
        {
            System.out.println("Not Divisible 5  and 11");
        }
        
    }
}



