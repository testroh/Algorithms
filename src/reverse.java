/**
 * Created by Rohith on 11/15/2017.
 */
public class reverse {
    public static void main(String[] args) {
        String s  = "my name is Rohith";
        String r  = "";
        for(int i = 0;i<s.length();i++){
            r = s.charAt(i) + r;
        }
        System.out.println("Reversed String is " + r );
    }
}
