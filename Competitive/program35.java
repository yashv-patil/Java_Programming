import java.io.*;
import java.util.*;

class program31
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        File fd = null;

        String Fname = null;

        System.out.println("Enter the file name:");
        Fname = sobj.nextLine();

        try
        {
            fd = new File(Fname);
            
            if(fd.exists())
            {
                System.out.println("File is Alreay Exist");
            }
            else
            {
                fd.createNewFile();
                System.out.println("File Created Successfully");
            }
            
        }
        catch(IOException ioe)
        {
            System.out.println("Unable to write data into file");
        }

        sobj.close();
    }
}

// Ass 45 Done