public class Day8 {

    public static void main(String[] args)
    {
        int r,sum=0,temp;
        int n=45754;
        temp=n;
        while(n>0)
        {
            r=n%10;  //getting a remainder
            sum = (sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not palindrome");
    }
}
