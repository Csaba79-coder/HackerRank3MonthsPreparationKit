package week02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyInteger {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        int noDuplicated = lonelyInteger(arrayList);
        System.out.println(noDuplicated);
    }

    public static int lonelyInteger(List<Integer> a) {
        // Write your code here
        int noDuplicatedNum = 0;

        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (!a.get(i).equals(a.get(j))) {
                    noDuplicatedNum = a.get(j);
                }
            }
        }
        return noDuplicatedNum;
    }
}
