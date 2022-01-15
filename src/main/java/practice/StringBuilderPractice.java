package practice;

public class StringBuilderPractice {

    // https://stackoverflow.com/questions/8725739/correct-way-to-use-stringbuilder-in-sql

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();


        sb.append("1, ");
        sb.append("2, ");
        sb.append("3");

        System.out.println("With StringBuilder: " + sb.toString());

        String s;

        s = "1, ";
        s += "2, ";
        s += "3";

        System.out.println("String concatenate: " + s);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Karakter");

        System.out.println("Reverse with StringBuilder: " + stringBuilder.reverse());
        System.out.println("Inserting String after certain index using StringBuilder: " + stringBuilder.insert(1, "Krisz"));
    }
}
