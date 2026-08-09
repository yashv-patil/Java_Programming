import java.io.*;
import java.util.*;

class program31
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        FileOutputStream foobj = null;

        String Fname = null;
        String Data = null;

        System.out.println("Enter the file name:");
        Fname = sobj.nextLine();

        System.out.println("Enter the file data:");
        Data = sobj.nextLine();

        try
        {
            foobj = new FileOutputStream(Fname);

            foobj.write(Data.getBytes());

            System.out.println("Data written successfully");

            foobj.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to write data into file");
        }

        sobj.close();
    }
}