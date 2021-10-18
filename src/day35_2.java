public class day35_2 {

    public static void main(String[] args) {
        String str="Rhea", nstr="";
        char ch;

        System.out.println("Original word: ");
        System.out.println("Rhea");

        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reserved word: "+nstr);
    }
}
