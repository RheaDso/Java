import java.util.Scanner;

public class day9 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("1.Factorial()");
        System.out.println("2.TestArmstrong()");
        System.out.println("3.TestPalindrome()");
        System.out.println("4.TestPrime()");
        System.out.println("5.FibonacciSeries()");
        System.out.println("Enter your choice: ");
        int c = s.nextInt();

        switch (c) {
            case 1: {
                System.out.println("Enter a number:");
                int n = s.nextInt();
                int fact = 1, i;
                for (i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                System.out.print("Factorial of " + n);
                System.out.println(" is " + fact);
                break;
            }
            case 2: {
                System.out.println("Enter your number: ");
                int n = s.nextInt();
                int sum = 0, r;
                int nn = n;
                while (n > 0) {
                    r = n % 10;
                    sum = sum + c * c * c;
                    n = n / 10;
                }
                if (nn == sum) {
                    System.out.println("Yes, it is an Angstrom Number: ");
                } else {
                    System.out.println("No, it is not an Angstrom Number");
                }
                break;
            }
            case 3: {
                System.out.println("Enter your number:");
                int n = s.nextInt();
                int r, sum = 0;
                int nn = n;
                while (n > 0) {
                    r = n % 10;
                    sum = sum * 10 + n;
                    n = n / 10;
                }
                if (nn == sum) {
                    System.out.println("It is a palindrome no");
                } else
                    System.out.println("Its not a paindrome number");
                break;
            }
            case 4: {
                System.out.println("Enter your number:");
                int n = s.nextInt();
                int i = 2;
                while (i < n) {
                    if (n % i == 0) {
                        System.out.println("Not a Prime Number.");
                        return;
                    }
                    i++;
                }
                System.out.println("It is a Prime Number.");
                break;
            }
            case 5: {
                System.out.println("Prime" );
                break;
            }
        }
    }
}