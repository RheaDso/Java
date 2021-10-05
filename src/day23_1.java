public class day23_1 {

    public static void main(String[] args) {
        int i;
        for(i=1; i<=100; i++)

            if (i%3==0)
                System.out.println("First");
            else if(i%5==0)
                System.out.println("Second");
            else
                System.out.println(""+i);
    }
}
