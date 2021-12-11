public class C1 {

    public static void main(String[] args) {
        String s1="MUMBAI ";
        String s2="Malad";
        String s3="Sunday";
        String s4="DSRV";
        String s5="Ice";
        String s6="";

        System.out.println("String length is "+s1.length());
        System.out.println("String length is "+s2.length());

        System.out.println("Comparing, we get " +s1.compareTo(s2));
        System.out.println("Comparing, we get " +s1.compareTo(s3));
        System.out.println("Comparing, we get " +s1.compareTo(s4));

        s5=s5.concat("cream");
        System.out.println(s5);

        System.out.println(s6.isEmpty());    //True
        System.out.println(s2.isEmpty());    //False

        System.out.println(s1+" is in Maharashtra.");               // without trim()
        System.out.println(s1.trim()+" is in Maharashtra.");        // with trim()

        String s1lower=s1.toLowerCase();
        System.out.println(s1lower);

        String s1upper=s1.toUpperCase();
        System.out.println(s1upper);
    }
}
