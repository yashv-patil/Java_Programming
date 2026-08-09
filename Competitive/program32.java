import java.io.*;
import java.util.*;

class program31
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        FileInputStream fiobj = null;

        String Fname;

        System.out.println("Enter the file name:");
        Fname = sobj.nextLine();

        try
        {
            fiobj = new FileInputStream(Fname);

            System.out.println("File opened successfully");

            int iRet;

            while((iRet = fiobj.read()) != -1)
            {
                System.out.print((char)iRet);
            }

            fiobj.close();
        }
        catch(IOException e)
        {
            System.out.println("File could not be opened");
        }

        sobj.close();
    }
}