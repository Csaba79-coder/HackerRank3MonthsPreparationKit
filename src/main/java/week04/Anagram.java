package week04;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        // aaabbb
        // ab
        // abc
        // mnop
        // xyyx
        // xaxbbbxx
        System.out.println(anagram("aaabbb")); // -> 3
        System.out.println(anagram("ab")); // -> 1
        System.out.println(anagram("abc")); // -> -1
        System.out.println(anagram("mnop")); // -> 2
        System.out.println(anagram("xyyx")); // -> 0
        System.out.println(anagram("xaxbbbxx")); // -> 1
    }

    public static int anagram(String s) {
        // Write your code here
        String[] toCheck = splitString(s);
        String firstPart = toCheck[0];
        String secondPart = toCheck[1];

        if (s.length() % 2 != 0) {
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : firstPart.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : secondPart.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0)
                    map.remove(ch);
            }
        }

        int ans = 0;
        for(char ch : map.keySet())
            ans += map.get(ch);

        return ans;
    }


    private static String[] splitString(String s) {
        final int mid = s.length() / 2; //get the middle of the String
        String[] parts = {s.substring(0, mid),s.substring(mid)};

        return new String[] {parts[0], parts[1]};
    }
}
