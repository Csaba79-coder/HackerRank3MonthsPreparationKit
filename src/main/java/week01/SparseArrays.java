package week01;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {


    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        int count=0;
        for (int i = 0; i< queries.size(); i++){
            for (int j = 0; j < strings.size(); j++){
                if (queries.get(i).equals(strings.get(j))){
                    count++;
                }
            }
            results.add(i,count);
            count=0;
        }
        return  results;
    }
}
