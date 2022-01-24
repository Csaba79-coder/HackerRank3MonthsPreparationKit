package week03;

public class XORString3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        String s, t;
        s = "10101";
        t = "00101";

        String result = stringsXOR(s, t);
        System.out.println(result);
        }

    public static String stringsXOR(String s, String t) {
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                res = res + "0";
            } else {
                res = res + "1";
            }
        }
        return res;
    }
}
