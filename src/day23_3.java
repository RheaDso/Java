public class day23_3 {

    public static void main(String[] args) {
        int i;
        for(i=1; i<=100; i++)

            if (i%10==0)
                System.out.println("Yes");
            else if(i%3==0)
                System.out.println("No");
            else
                System.out.println(""+i);
    }
}
