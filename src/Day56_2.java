import java.util.Scanner;

public class Day56_2
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Factorial()");
        System.out.println("2. Armstrong()");
        System.out.println("3. Palindrome()");
        System.out.println("4. Prime()");
        System.out.println("5. FibonacciSeries()");
        int c = s.nextInt();
        switch(c)
        {
            case 1:
            {
                System.out.println("Enter your number: ");
                int n = s.nextInt();
                int fact = 1;
                for(int i=1; i<=n; i++){
                    fact = fact * i;
                }
                System.out.println("Factorial of "+n);
                System.out.println("is" +fact);
                break;
            }
            case 2:
            {
                System.out.println("Enter your number: ");
                int n = s.nextInt();
                int sum = 0;
                int r;
                int nn = n;
                while(n>0)
                {
                    r = n % 10;
                    sum = sum + c * c * c;
                    n = n / 10;
                }
                if(nn == sum){
                    System.out.println("Yes, it is an Angstrom number.");
                }
                else {
                    System.out.println("No, it is not an Angstrom number");
                }
                break;
            }
            case 3: {
                System.out.println("Enter your number: ");
                int n = s.nextInt();
                int r, sum = 0;
                int nn = n;
                while (n > 0) {
                    r = n % 10;
                    sum = sum * 10 + n;
                    n = n % 10;
                }
                if (nn == sum) {
                    System.out.println("It is Palindrome Number.");
                } else {
                    System.out.println("It is not a Palindrome Number.");
                    break;
                }
            }
            case 4: {
                System.out.println("Enter a Number: ");
                int n = s.nextInt();
                int i = 2;
                while(i<n){
                    if(n%i==0){
                        System.out.println("It is not a Prime Number.");
                        return;
                    }
                    i++;
                }
                System.out.println("It is a Prime Number.");
                break;
            }
            case 5: {
                System.out.println("Prime");
                break;
            }
        }
    }
}

