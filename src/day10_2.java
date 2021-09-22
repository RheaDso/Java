public class day10_2 {

    public static void main(String[] args)
    {
        int term = 6;
        for(int i=1;i<=term;i++)
        {
            for(int j=term;j>=i;j--)
            {
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}
