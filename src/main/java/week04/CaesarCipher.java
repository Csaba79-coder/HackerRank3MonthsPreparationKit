package week04;

public class CaesarCipher {

    public static void main(String[] args) {

        // https://www.dcode.fr/caesar-cipher

        // Original alphabet:      abcdefghijklmnopqrstuvwxyz
        // Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc

        System.out.println(caesarCipher("middle-Outz", 2)); // expected output: okffng-Qwvb --> passing all the test!
        System.out.println(caesarCipher2("middle-Outz", 2)); // expected output: okffng-Qwvb --> pass this test, but failed some!
        System.out.println(caesarCipher2("middle-Outz", 3)); // expected output: okffng-Qwvb --> effective output: plggoh-Rxwc
    }

    // this one passed all the tests!!!

    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (Character.isLetter(currChar)) {
                sb.append(rotateChar(currChar, k));
            } else {
                sb.append(currChar);
            }
        }

        return sb.toString();
    }

    public static char rotateChar(char c, int d) {
        boolean isCap = 65 <= c && c <= 90;
        char newChar;

        if (isCap) {
            newChar = ((char) (((c - 65 + d) % 26) + 65));
        } else {
            newChar = ((char) (((c - 97 + d) % 26) + 97));
        }

        return newChar;
    }

    // failed some test!
    public static String caesarCipher2(String s, int k) {
        // Write your code here
        StringBuilder strBuilder = new StringBuilder();
        char c;
        for (int i = 0; i < s.length(); i++)
        {
            c = s.charAt(i);
            // if c is letter ONLY then shift them, else directly add it
            if (Character.isLetter(c))
            {
                c = (char) (s.charAt(i) + k);
                // System.out.println(c);

                // checking case or range check is important, just if (c > 'z'
                // || c > 'Z')
                // will not work
                if ((Character.isLowerCase(s.charAt(i)) && c > 'z')
                        || (Character.isUpperCase(s.charAt(i)) && c > 'Z'))

                    c = (char) (s.charAt(i) - (26 - k));
            }
            strBuilder.append(c);
        }
        return strBuilder.toString();
    }

    // wrong output
    public static String caesarCipher3(String s, int k) {
        // Write your code here
        String result;
        StringBuilder output = new StringBuilder("");

        for(char letter : s.toCharArray())
        {
            if(letter > 64 && letter < 91)//Capital letter
            {
                char encrypted = (char) (letter+k);
                if(encrypted > 90)
                {
                    encrypted = (char) ((encrypted % 90) + 64);
                }
                output.append(encrypted);
            }
            else if(letter > 96 && letter < 123)//Lower case letter
            {
                char encrypted = (char) (letter+k);
                if(encrypted > 122)
                {
                    encrypted = (char) ((encrypted % 122) + 96);
                }
                output.append(encrypted);
            }
            else//Symbol
            {
                output.append(letter);
            }
        }
        result = output.toString();

        return result;
    }
}
