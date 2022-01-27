package week03;

public class DrawingBook {

    public static void main(String[] args) {
        int n = 6;
        int p = 2;

        int page = pageCount(n, p); // output: 1
        System.out.println(page);

        int flipPage = pageCount2(n, p); // output: 1
        System.out.println(flipPage);
    }

    public static int pageCount(int n, int p) {
        // Write your code here
        int flip = n - p;

        if(flip != 0 && n % 2 == 0) {
            flip =  n - p + 1;
        }
        return Math.min(p / 2, flip / 2);
    }

    public static int pageCount2(int n, int p) {
        // Write your code here
        return Math.min((p / 2), (n / 2) - (p / 2));
    }
}
