//Write a java program to demonstrate file input output.
//3315_Question-10

import java.io.File;
public class R
{
    public static void main(String[] args)
    {
        File myFile = new File("Javachip.txt");
        if (myFile.exists())
        {
            System.out.println(myFile.getName() + "exist.");
            System.out.println("Total " + myFile.length() + " bytes.");

            if (myFile.canRead())
            {
                System.out.println("readable.");
            }
            else
            {
                System.out.println("not readable.");
            }
            if (myFile.canWrite())
            {
                System.out.println("okay to write.");
            }
            else
            {
                System.out.println("not okay to write.");
            }
            System.out.println("Path :" +myFile.getAbsolutePath());
            System.out.println("File Name :"+ myFile.getName());
            System.out.println("File Size :"+ myFile.length() + " bytes");
        }
        else
        {
            System.out.println("file does not exist!!");
        }
    }
}