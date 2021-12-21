//. Write a java program to demonstrate java string buffer functions

public class BufferFunction {

    public static void main(String[] args) {
        StringBuffer rd=new StringBuffer("Stefan ");
        rd.append("Salvatore");  //append
        System.out.println(rd);

        System.out.println("--------------------------");

        StringBuffer tvd=new StringBuffer("Hello ");
        tvd.insert(6,"Vampire");  //insert
        System.out.println(tvd);

        System.out.println("-------------------------");

        StringBuffer vd=new StringBuffer("Stefan ");
        vd.replace(3,6,"Damon");    //replace
        System.out.println(vd);

        System.out.println("-------------------------");

        StringBuffer kl=new StringBuffer("Klaus");
        kl.delete(2,4);
        System.out.println(kl);

        System.out.println("-------------------------");

        StringBuffer cf=new StringBuffer("Javachip Coffee");
        cf.reverse();       //reverse
        System.out.println(cf);

        System.out.println("-------------------------");

        StringBuffer dv=new StringBuffer();
        System.out.println(dv.capacity());   //capacity
        dv.append("Elena");
        System.out.println(dv.capacity());
        dv.append("Vampire Diaries is my favourite series.");
        System.out.println(dv.capacity());

        System.out.println("-------------------------");

        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello Brother");
        System.out.println(sb.capacity());
        sb.append("Vampire Diaries");
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

    }
}
