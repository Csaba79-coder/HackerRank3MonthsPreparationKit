package week01;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    int[] arr = new int[]{-4, 3, -9, 0, 4, 1};
    public List<Integer> intList = createList(arr);

    public void plusMinus(List<Integer> arr) {
        // Write your code here
        double divisor = arr.get(0);
        double firstNum = arr.get(1) / divisor;
        double secNum = arr.get(2) / divisor;
        double thirdNum = arr.get(3) / divisor;

        System.out.println(formattingNums(firstNum));
        System.out.println(formattingNums(secNum));
        System.out.println(formattingNums(thirdNum));
    }

    private String formattingNums(double num) {
        return String.format("%.6g%n", num).trim();
    }

    private List<Integer> createList(int[] array) {
        List<Integer> intList = new ArrayList<>();
        int n = array.length;
        int counterPoz = countPosElement(array);
        int counterNeg = countNegElement(array);
        int counterZero = countZeroElement(array);

        intList.add(n);
        intList.add(counterPoz);
        intList.add(counterNeg);
        intList.add(counterZero);
        return intList;
    }


    private int countZeroElement(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter++;
            }
        } return counter;
    }

    private int countNegElement(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                counter++;
            }
        } return counter;
    }

    private int countPosElement(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
        } return counter;
    }
}
