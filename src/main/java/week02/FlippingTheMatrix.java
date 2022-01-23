package week02;

import java.util.List;

public class FlippingTheMatrix {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here

        int size = matrix.size();
        int n = size / 2;

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += Math.max(Math.max(matrix.get(i).get(j), matrix.get(size -1 - i).get(j)),
                        Math.max(matrix.get(i).get(size - 1 - j), matrix.get(size - 1 - i).get(size - 1 - j)));
            }
        }
        return result;
    }
}
