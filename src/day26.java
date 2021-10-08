public class day26 {

    public static void main(String[] args) {
        for(int i=1; i<=1000; i++)
        {
            if (i%4==0)
            {
                System.out.println("Football!!");
            }
            else if(i%3==0)
            {
                System.out.println("Match");
            }
            else if(i%10==0)
            {
                System.out.println("Messi!!");
            }
            else
            {
                System.out.println(""+i);
            }
        }
    }
}
