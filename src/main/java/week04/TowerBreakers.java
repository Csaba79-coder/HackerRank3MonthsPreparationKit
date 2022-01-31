package week04;

public class TowerBreakers {

    public static void main(String[] args) {

        // input:
        // 2 2
        // 1 4

        // output:
        // 2
        // 1

        System.out.println(towerBreakers(2, 2));
        System.out.println(towerBreakers(1,4));
    }

    public static int towerBreakers(int n, int m) {
        // Write your code here
        if (m == 1) {
            return 2;
        } else {
            return (n % 2 == 0) ? 2 : 1;
        }
    }
}
