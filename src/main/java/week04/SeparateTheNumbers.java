package week04;

public class SeparateTheNumbers {

    public static void main(String[] args) {
        // 1234
        // 91011
        // 99100
        // 101103
        // 010203
        // 13
        // 1
        separateNumbers("1234");
        separateNumbers("91011");
        separateNumbers("99100");
        separateNumbers("101103");
        separateNumbers("010203");
        separateNumbers("13");
        separateNumbers("1");
    }

    public static void separateNumbers(String s) {
        // Write your code here
        String sub = "";
        boolean isValid = false;

        for (int i = 1; i <= s.length() / 2; i++) {
            sub = s.substring(0, i);
            long num = Long.parseLong(sub);
            StringBuilder valid = new StringBuilder(sub);
            while (valid.length() < s.length()) {
                valid.append(++num);
            }
            if (s.equals(valid.toString())) {
                isValid = true;
                break;
            }
        }
        System.out.println(isValid ? "YES " + sub : "NO");
    }
}
