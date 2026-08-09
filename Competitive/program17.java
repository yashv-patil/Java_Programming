class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2032);
    }
}

class Logic
{
    void CheckLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            System.out.println("It is leap year");
        }
        else
        {
            System.out.println("It is not leap year");
        }
    }
}



