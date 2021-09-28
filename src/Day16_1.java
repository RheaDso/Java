import java.util.Scanner;

public class Day16_1 {

    static boolean isArmstrong(int n)
        {
            int temp, digits=0, last=0, sum=0;
//assigning n into a temp variable
            temp=n;
//loop execute until the condition becomes false
            while(temp>0)
            {
                temp = temp/10;
                digits++;
            }
            temp = n;
            while(temp>0)
            {
//determines the last digit from the number
                last = temp % 10;
//calculates the power of a number up to digit times and add the resultant to the sum variable
                sum +=  (Math.pow(last, digits));
//removes the last digit
                temp = temp/10;
            }
//compares the sum with n
            if(n==sum)
//returns if sum and n are equal
                return true;
//returns false if sum and n are not equal
            else return false;
        }
    public static void main(String args[])
    {
            int num;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the limit: ");
            num=sc.nextInt();
            System.out.println("Armstrong Number up to "+num+"are: ");
            for(int i=0; i<=num; i++)
                if(isArmstrong(i))
                    System.out.println(i+"  ");
    }

}
