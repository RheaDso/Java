public class day23_2 {

    public static void main(String[] args) {
        int i;
        for(i=10; i<=100; i++)

            if (i%2==0)
                System.out.println("First");
            else if(i%3==0)
                System.out.println("Second");
            else
                System.out.println(""+i);
    }
}

