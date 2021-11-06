class Operations {
    int a;
    int b;
}
    class Add extends Operations {
        Add(int x, int y){
            a=x;
            b=y;
            System.out.println(a+b);
        }
    }
    class sub extends Operations {
        sub(int x, int y) {
            a = x;
            b = y;
            System.out.println(a - b);
        }
    }
    class mult extends Operations{
        mult(int x, int y){
            a=x;
            b=y;
            System.out.println(a*b);
        }
    }
    class div extends Operations{
        div (int x, int y){
            a=x;
            b=y;
            System.out.println(a/b);
        }
    }

public class day53 {

    public static void main(String[] args) {
        Add a1 = new Add(10,20);
        sub s1 = new sub(34, 78);
        mult m1 = new mult(65, 90);
        div d1 = new div(34, 27);
    }
}

