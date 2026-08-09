class program16
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(59);
    }
}

class Logic
{
    void DisplayGrade(int imarks)
    {
        if(imarks > 100)
        {
            System.out.println("Invalid Input");
        }
        else if (imarks >= 80 && imarks < 100) 
        {
            System.out.println("Student have A Grade");
        }
        else if (imarks >= 60 && imarks < 80) 
        {
            System.out.println("Student have B Grade");
        }
        else if (imarks >= 35 && imarks < 60) 
        {
            System.out.println("Student have C Grade");
        }
    }
}



