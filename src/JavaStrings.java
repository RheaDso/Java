public class JavaStrings {

    public static void main(String[] args) {
        String s1="RHEA";
        String s2="Dsouza";
        String s3="Wednesday";
        String s4="DBIT";
        String s5="Mumbai_";
        String s6="";

        System.out.println("String length is: "+s1.length());   //length()
        System.out.println("String length is: "+s2.length());   //length()

        System.out.println("-----------------------------");

        System.out.println("Comparing, we get" +s1.compareTo(s2));    //compareTo()
        System.out.println("Comparing, we get" +s1.compareTo(s3));    //compareTo()
        System.out.println("Comparing, we get" +s1.compareTo(s4));    //compareTo()

        System.out.println("-----------------------------");

        s5=s5.concat("Place");        //concat()
        System.out.println(s5);       //concat()

        System.out.println("-----------------------------");

        System.out.println(s6.isEmpty());    //IsEmpty()
        System.out.println(s2.isEmpty());    //IsEmpty()

        System.out.println("-----------------------------");

        System.out.println(s1+"SEIT");               // without trim()
        System.out.println(s1.trim()+"SEIT");        // with trim()

        System.out.println("-----------------------------");

        String s1lower=s1.toLowerCase();    //LowerCase
        System.out.println(s1lower);        //LowerCase

        System.out.println("-----------------------------");

        String s1upper=s1.toUpperCase();    //UpperCase
        System.out.println(s1upper);        //UpperCase

        System.out.println("-----------------------------");
    }
}
