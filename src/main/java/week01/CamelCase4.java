package week01;

import java.util.Scanner;

public class CamelCase4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] input = line.split(";");
            String cmd = input[1];
            String bet = input[2];

            if (input[0].equals("S")) {
                bet = bet.replaceAll("(.)([A-Z])", "$1 $2").toLowerCase();
                if (cmd.equals("M")) {
                    bet = bet.replaceAll("[()]", "");
                }
            } else {
                String[] words = bet.split(" ");
                int size = words.length;
                for (int i = 1; i < size; i++) {
                    words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
                }
                bet = String.join("", words);
                if (cmd.equals("M")) {
                    bet += "()";
                }
                if (cmd.equals("C")) {
                    bet = Character.toUpperCase(bet.charAt(0)) + bet.substring(1);
                }
            }
            System.out.println(bet);
        }
    }
}
