package week5;

import java.util.HashSet;
import java.util.Set;

public class StrongPassword {

    public static void main(String[] args) {
        int n = 3;
        String passwordTest = "Ab1"; // output: 3

        int result = minimumNumber(n, passwordTest);

        System.out.println(result);
    }

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        boolean lowercase = false;
        boolean uppercase = false;
        boolean number = false;
        boolean special = false;
        char[] schars = "!@#$%^&*()-+".toCharArray();
        Set<Character> cs = new HashSet<>();
        for (char c : schars) {
            cs.add(c);
        }
        for (int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if (c >= '0' && c <= '9') number = true;
            if (c >= 'a' && c <= 'z') lowercase = true;
            if (c >= 'A' && c <= 'Z') uppercase = true;
            if (cs.contains(c)) special = true;
        }
        int need = 0;
        need += lowercase ? 0 : 1;
        need += uppercase ? 0 : 1;
        need += number ? 0 : 1;
        need += special ? 0 : 1;
        return n + need < 6 ? 6 - n : need;
    }
}
