package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {

    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(3);
        result.add(3);

        System.out.println(maximumPerimeterTriangle(result));
    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        Collections.sort(sticks);
        long maxPerimeter=0;
        List<Integer> result=new ArrayList<Integer>(Arrays.asList(0,0,0));
        for(int i=0;i<=sticks.size()-3;i++){
            List<Integer> temp=sticks.subList(i,i+3);
            if(isValidTriangle(temp) && maxPerimeter<perimeter(temp)) {
                maxPerimeter=perimeter(temp);
                result.set(0,temp.get(0));
                result.set(1,temp.get(1));
                result.set(2,temp.get(2));
            }
        }
        if(maxPerimeter==0) {
            return new ArrayList<>(List.of(-1));
            // return new ArrayList(List.of(-1));
            // return new ArrayList(Arrays.asList(-1));
        } else {
            return result;
        }
    }

    public static long perimeter(List<Integer> sticks) {
        long result=sticks.get(0);
        result+=sticks.get(1);
        result+=sticks.get(2);
        return result;
    }

    public static boolean isValidTriangle(List<Integer> sticks) {
        if(sticks.get(0)+sticks.get(1)>sticks.get(2)) {
            if(sticks.get(1)+sticks.get(2)>sticks.get(0)) {
                if(sticks.get(2)+sticks.get(0)>sticks.get(1)) {
                    return true;
                }
            }
        }
        return false;
    }
}