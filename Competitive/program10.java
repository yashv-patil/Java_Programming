class program10
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.FindMin(123, 133, 142);
    }
}

class Logic
{
    void FindMin(int iNo1, int iNo2,int iNo3)
    {
        if(iNo1 > iNo2 && iNo1 > iNo3)
        {
            System.out.println("Maximum number is :"+iNo1);
        }
        else if (iNo2 > iNo1 && iNo2 > iNo3) 
        {
            System.out.println("Maximum number is :"+iNo2);
        }
        else
        {
            System.out.println("Maximum number is :"+iNo3);
        }
        
    }
}


