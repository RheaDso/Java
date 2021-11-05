class Addition
{
    public int add(int a, int b, int c)
    {
        int sum = a + b + c;
        return sum;
    }
    public double add(double a, double b, double c)
    {
        double sum = a + b + c;
        return sum;
    }
}
class day52_1
{
    public static void main(String[] args)
    {
        Addition ob = new Addition();

        int sum2 = ob.add(1,2,3);
        System.out.println("Sum of the three integer values: "+sum2);
        double sum3 = ob.add(1.0, 2.0, 3.0);
        System.out.println("Sum of the three double value: "+sum3);
    }
}
