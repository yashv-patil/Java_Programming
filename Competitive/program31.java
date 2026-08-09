import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class program31
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        FileInputStream fiobj = null;

        String Fname;

        System.out.println("Enter the file name that you want to open:");
        Fname = sobj.nextLine();

        try
        {
            fiobj = new FileInputStream(Fname);

            System.out.println("File opened successfully");
        }
        catch(IOException e)
        {
            System.out.println("Unable to open file");
        }
    }
}