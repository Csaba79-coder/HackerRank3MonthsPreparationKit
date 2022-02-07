package week5;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        // initialize an **array** of size 10,0001 (maximum input)
        int[] array = new int[100001];

        // Decrement the value in the **array** for the corresponding item we read
        // This indicates that that particular index is missing **this** number of times in brr
        // eg : consider input arr -> [7,2,5,3,5,3] brr -> [7,2,5,4,6,3,5,3]
        // we scan 7 and in 7th index in** array** we decrement its value so that array[7] = -1 ,
        //    which means 7 is missing 1 times in brr
        for(int i = 0 ; i < arr.size() ; i++) {
            int item = arr.get(i);
            array[item]--;
        }

        // similarly whenever we scan an item in brr , increment its value for the corresponding item in **array**
        // eg : after end of previous for loop , 7 is missing one times in brr.
        //      now we found 7 in brr, so increment its corresponding index so that 7 is missing 0 times in brr
        for(int i = 0 ; i < brr.size() ; i++) {
            int item = brr.get(i);
            array[item]++;
        }

        // if an element's value in **array** is >0 , it means that element is missing
        for(int i = 0 ; i < 100001 ; i++) {
            if(array[i] > 0) {
                result.add(i);
            }
        }
        return result;
    }
}