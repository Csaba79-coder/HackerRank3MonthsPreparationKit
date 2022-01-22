package week2;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {
        // s.matches("[a-zA-Z]+")
        String s = "We promptly judged antique ivory buckles for the next prize";
        String notPangram = "alma";

        String result = pangrams(s);
        System.out.println(result);

        String notPangramResult = pangrams(notPangram);
        System.out.println(notPangramResult);
    }



    public static String pangrams(String s) {
        // Write your code here

        Set<Character> alphabet = new HashSet<>();
        for (char c :
                s.toCharArray()) {
            if (Character.isLetter(c)) {
                char C = Character.toUpperCase(c);
                alphabet.add(C);
            }
        }
        if (alphabet.size()==26)
            return "pangram";
        else return "not pangram";
    }
}
