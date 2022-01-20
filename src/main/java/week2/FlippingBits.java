package week2;

public class FlippingBits {

    public static void main(String[] args) {
        long numberOfExamples = 3; // how many
        long num1 = 2147483647;
        long num2 = 1;
        long num3 = 0;

        System.out.println(flippingBits(num1));
        System.out.println(flippingBits(num2));
        System.out.println(flippingBits(num3));
    }

    public static long flippingBits(long n) {
        // Write your code here
        return (long)4294967296.0 + (~n);
    }
}
