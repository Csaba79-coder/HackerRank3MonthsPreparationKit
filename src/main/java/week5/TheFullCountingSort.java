package week5;

import java.util.*;

public class TheFullCountingSort {

    // input
    // 20
    // 0 ab
    // 6 cd
    // 0 ef
    // 6 gh
    // 4 ij
    // 0 ab
    // 6 cd
    // 0 ef
    // 6 gh
    // 0 ij
    // 4 that
    // 3 be
    // 0 to
    // 1 be
    // 5 question
    // 1 or
    // 2 not
    // 4 is
    // 2 to{-truncated-}

    // output:
    // - - - - - to be or not to be - that is the question - - - -

    public static void countSort(List<List<String>> arr) {
        // Write your code here

        // only one test failed regarding timeout! Time limit exceeded ...
        StringBuffer[] st=new StringBuffer[100];
        int size = arr.size();
        for(int i=0;i<100;i++)
        {
            st[i]=new StringBuffer();
        }
        for(int i = 0 ; i < size; i++){
            int k = Integer.parseInt(arr.get(i).get(0));
            String s;
            s=arr.get(i).get(1);
            st[k].append(i < size / 2 ? "-" : s).append(" ");
        }
        for(int i=0;i<100;i++) {
            System.out.print(st[i]);
        }
    }
}
