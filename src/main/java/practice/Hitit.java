package practice;

public class Hitit {

    public static void main(String[] args) {
        // System.out.println("Start airplane company :) --> junior java developer");
        String my_input = "happy";
        System.out.println(returnDuplicates(my_input));

        int[] array = {1, 2, 3, 2, 1};
        System.out.println(returnMax(array));
    }

    public static String returnDuplicates(String my_input) {
        for (int i = 0; i < my_input.length(); i++) {
            char result = my_input.charAt(i);
            // Map<char>
        }
        return null;
    }

    public static int returnMax(int[] nums) {

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
