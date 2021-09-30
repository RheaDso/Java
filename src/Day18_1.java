public class Day18_1
{
    //Instance Vaeiables
    String name;
    String branch;
    int roll_no;
    int age;

    //Constructor Declaration of Class
    public Day18_1(String name, String branch, int roll_no, int age)
    {
        this.name = name;
        this.branch = branch;
        this.roll_no = roll_no;
        this.age = age;
    }

    //method 1
    public String getName()
    {
        return name;
    }

    public String getBranch()
    {
        return branch;
    }

    public int getRoll_no()
    {
        return roll_no;
    }

    public int getAge()
    {
        return age;
    }


    public String  toString()
    {
        return ("Hi! My name is "+this.getName()+".\nMy branch, Roll No. and age are "+this.getBranch()+", "+this.getRoll_no()+", "+this.getAge());
    }

    public static void main(String[] args)
    {
        Day18_1 Rhea = new Day18_1("Rhea", "IT",16, 19);
        System.out.println(Rhea.toString());
    }
}
