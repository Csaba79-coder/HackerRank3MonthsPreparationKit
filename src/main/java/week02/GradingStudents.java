package week02;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {

        // expected output: 75, 67, 40, 33;

        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> list = gradingStudents(grades);
        System.out.println(list.toString());
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<Integer>(grades.size());
        for(int i: grades){
            int diff = i % 5;
            if(i < 38 || diff < 3){
                list.add(i);
            }
            else{
                int result = i + (5 - diff);
                list.add(result);
            }
        }
        return list;
    }
}
