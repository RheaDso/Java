public class day8_4 {

    double sub1, sub2, sub3, sub4, sub5;

    public static void main(String[] args)
    {
        student s = new student();
        s.sub1=78;
        s.sub2=89;
        s.sub3=98;
        s.sub4=67;
        s.sub5=83;
        double average = (s.sub1 + s.sub2 + s.sub3 + s.sub4 + s.sub5)/5;
        System.out.println("Average marks = ");
        System.out.println(average);

    }
}
