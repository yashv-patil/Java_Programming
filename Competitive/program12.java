class program12
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(23);
    }
}

class Logic
{
    void CheckPrime(int iNo)
    {
        if(iNo % 2 == 0)
        {
            System.out.println("Number is Not Prime");
        }
        else
        {
            System.out.println("Number is Prime");    
            
        }
    }
}


