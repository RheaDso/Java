class employ{
    String name;
    int year;
    int salary;
    String address;
}
public class Employee {
    public static void main(String[] args) {
        employ one = new employ();
        employ two = new employ();

        one.name = "Rhea";
        one.year = 2002;
        one.salary = 100000;
        one.address = "Malad";

        two.name = "Stefan";
        two.year = 2012;
        two.salary = 100000;
        two.address = "Worli";

        System.out.println("Name\t Year of joining \t Salary \t Address");
        System.out.println("------------------------------------------------");
        System.out.println("Name\t Year of Joining \t Salary \t Address");
        System.out.println(one.name + "\t\t" + one.year + "\t\t\t" + one.salary + "\t\t" + one.address);
        System.out.println(two.name + "\t\t" + two.year + "\t\t\t" + two.salary + "\t\t" + two.address);

    }
}