package week5;

import java.math.BigInteger;

public class FibonacciModified {

    public static void main(String[] args) {
        int t1 = 0;
        int t2 = 1;
        int n = 5;

        int result = fibonacciModified(t1, t2, n);
        System.out.println(result); // output: 5

        BigInteger bigIntegerResult = fibonacciModifiedInBigInteger(t1, t2, n);
        System.out.println(bigIntegerResult);
    }

    public static int fibonacciModified(int t1, int t2, int n) {
        // Write your code here
        BigInteger num1 = new BigInteger(Integer.toString(t1));
        BigInteger num2 = new BigInteger(Integer.toString(t2));

        for(int i=3; i<n+1; i++) {
            BigInteger newNum2 = num1.add(num2.multiply(num2));
            num1 = num2;
            num2 = newNum2;
        }

        return num2.intValueExact();
    }

    public static BigInteger fibonacciModifiedInBigInteger(int t1, int t2, int n) {

        BigInteger num1 = new BigInteger(Integer.toString(t1));
        BigInteger num2 = new BigInteger(Integer.toString(t2));

        for (int i = 3; i < n + 1; i++) {
            BigInteger newNum2 = num1.add(num2.multiply(num2));
            num1 = num2;
            num2 = newNum2;
        }

        return num2;
    }
}
