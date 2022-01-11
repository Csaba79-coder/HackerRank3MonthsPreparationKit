package week01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String myDate = "";
        DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");
        Date date = null;
        try {
            date = inFormat.parse(s);
        }catch (ParseException e ){
            e.printStackTrace();
        }
        if( date != null ){
            myDate = outFormat.format(date);
            System.out.println(myDate);
        }
        return myDate;
    }
}
