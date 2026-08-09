class program9
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.FindMax(123, 133);
    }
}

class Logic
{
    void FindMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println("Maximum number is :"+iNo1);
        }
        else
        {
            System.out.println("Maximum number is :"+iNo2);
        }
    }
}


