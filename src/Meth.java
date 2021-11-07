class addition{
    int a;
    int b;
    int c;
    double p;
    double q;
}
class No_parameters extends addition
{
    No_parameters(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
        System.out.println(a + b + c);
    }
}
class Double_value extends addition
{
    Double_value(double i, double j)
    {
        p=i;
        q=j;
        System.out.println(p+q);
    }
}
public class Meth
{
    public static void main(String[] args)
    {
        No_parameters a1 = new No_parameters(4, 9, 5);
        Double_value d1 = new Double_value(3,9);
    }
}
