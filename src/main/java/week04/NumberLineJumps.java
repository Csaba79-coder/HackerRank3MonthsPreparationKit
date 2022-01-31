package week04;

public class NumberLineJumps {

    public static void main(String[] args) {
        /*
         * Complete the 'kangaroo' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER x1
         *  2. INTEGER v1
         *  3. INTEGER x2
         *  4. INTEGER v2
         */

        // String: either YES or NO

        // 0 3 4 2 --> YES
        String kangaroo = kangaroo(0, 3, 4, 2);
        System.out.println(kangaroo);

        // 0 2 5 3 --> NO
        String result = kangaroo(0, 2, 5, 3);
        System.out.println(result);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if ((v1 <= v2)) {
            return "NO";
        } else {
            for (int i = 0; i < v1 * x2; i++) {
                if (x1 + (v1*i) == x2 + (v2 * i)){
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
