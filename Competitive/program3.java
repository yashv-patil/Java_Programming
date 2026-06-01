class program4
{
    public static void main(String [] A)
    {
        NumberX dobj = new NumberX();

        dobj.Display();
    }
}

class NumberX
{
    void Display ()
    {
        int i = 0;
        i = 5;

        while (i >= 1) 
        {
            System.err.println(i);
            i --;
        }
    }
}
    
