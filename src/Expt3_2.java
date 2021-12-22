
import java.util.Scanner;
class InvalidException extends Exception
{
    
}
public class Expt3_2
{
    public static void main(String[] args)
    {
        int number = 0;
        int sign = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your Login ID: ");
        String loginID = in.next();

        System.out.println("----------------------");

        System.out.println("Enter your Password: ");
        String password = in.next();

        System.out.println("----------------------");

        for(int i=0; i<password.length(); i++)
        {
            if(password.length() == 8) {
                if (password.charAt(i) == '*' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '_')
                {
                    sign++;
                }
                else if (password.charAt(i) == '0' || password.charAt(i) == '1' || password.charAt(i) == '2' || password.charAt(i) == '3' ||
                        password.charAt(i) == '4' || password.charAt(i) == '5' || password.charAt(i) == '6' || password.charAt(i) == '7' ||
                        password.charAt(i) == '8' || password.charAt(i) == '9')
                {
                    number++;
                }
            }
        }
        if(sign>0 && number>0)
        {
            System.out.println("Login Completed Successfully!!");
        }
        else
        {
            try
            {
                throw new InvalidException();
            }
            catch(InvalidException ipe)
            {
                System.out.println("Please Enter Valid Password of length 8 characters including 1 Digit and 1 Special Symbol.");
            }
        }
    }
}
