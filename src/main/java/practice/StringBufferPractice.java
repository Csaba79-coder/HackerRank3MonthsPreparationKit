package practice;

public class StringBufferPractice {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Karakter");

        System.out.println("Reverse with StringBuffer: " + stringBuffer.reverse());
        System.out.println("Inserting String after certain index using StringBuffer: " + stringBuffer.insert(1, "Krisz"));
    }
}
