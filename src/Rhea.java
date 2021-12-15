//Write a java program to demonstrate file input output.
//3315_Question-10

import java.io.File;
public class Rhea
{
    public static void main(String[] args)
    {
        File myFile = new File("RheaD.txt");
        if (myFile.exists())
        {
            System.out.println(myFile.getName() + "does exist.");
            System.out.println("This file has " + myFile.length() + " bytes.");

            if (myFile.canRead())
            {
                System.out.println("Yes, it is readable.");
            }
            else
            {
                System.out.println("No, It is not readable.");
            }
            if (myFile.canWrite())
            {
                System.out.println("Yes, it is okay to write.");
            }
            else
            {
                System.out.println("No, it is not okay to write.");
            }
            System.out.println("Path :" +myFile.getAbsolutePath());
            System.out.println("File Name :"+ myFile.getName());
            System.out.println("File Size :"+ myFile.length() + " bytes");
        }
        else
        {
            System.out.println("Sorry, This file does not exist!!");
        }
    }
}