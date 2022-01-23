package week02;

public class MarsExploration {

    public static void main(String[] args) {
        String s1 = "SOSSPSSQSSOR"; // output: 3

        int result1 = marsExploration(s1);
        System.out.println(result1);
    }

    public static int marsExploration(String s) {
        // Write your code here
        int count = 0;
        int currentPos = 0;
        for(char letter : s.toCharArray())
        {

            if(currentPos % 3 == 1)
            {
                count += (letter != 'O') ? 1 : 0;
            }
            else
            {
                count += (letter != 'S') ? 1 : 0;
            }
            currentPos++;
        }
        return count;
    }
}
