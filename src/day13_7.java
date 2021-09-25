import java.util.Scanner;

public class day13_7 {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of rows : ");

        int alphabet = 65;
        int rows= sc.nextInt();

        for (int i=1; i<=rows; i++)
        {
            for (int j=rows; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print((char) (alphabet + k - 1) + " ");
            }
            System.out.println();
        }
    }
}
