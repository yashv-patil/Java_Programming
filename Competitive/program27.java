class program27
{
     public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.ProductofDigit(234);
    }
}

class Logic
{
    void ProductofDigit(int iNo)
    {
        int iProduct = 1;
        int iLast = 0;
        
        while (iNo != 0) 
        {
            iLast = iNo % 10;

            iProduct = iProduct * iLast;

            iNo = iNo / 10;  
        }
        System.out.println(iProduct);

      
    }
}





