/**
 * Created by Rohith on 6/18/2017.
 */
public class Builder {

    public static void main(String[] args) {

//        StringBuilder roh = new StringBuilder("rohith");
//        String str = new String("twinker tanker hello");
//        roh.append("anc");
//        System.out.print(roh + "\n");
//        System.out.print(str.replaceAll("hello","rohith") + "\n");
//        System.out.print(roh.replace(1,4,"mystery") + "\n");
//        System.out.print(roh.reverse() + "\n");

        StringBuilder sb = new StringBuilder("rohith");
        System.out.println(sb.append(" gupta"));
        System.out.println(sb.replace(0,7,"rachana "));
        System.out.println(sb.delete(0,8));
        System.out.println(sb.length());
        System.out.println(sb.substring(3));
        System.out.println(sb.substring(3,5));
    }
}
