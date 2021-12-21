import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Pactice2
{
    public static void main(String[] args) throws IOException {
        File myFile = new File("Javachip.txt");
        String str = "Rhea";
        BufferedWriter myfile = new BufferedWriter(new FileWriter("RheaD.txt"));
        myfile.append(str);
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
