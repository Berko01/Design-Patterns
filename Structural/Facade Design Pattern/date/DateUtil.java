package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static Date getCurrentDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        String dateStr = format.format(new Date());

        Date date = null;

        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;

    }

    public static long calculateDayDifference(Date firstDate, Date lastDate) {

        int dayCoefficient = 24 * 60 * 60 * 1000;

        long first = firstDate.getTime();
        long last = lastDate.getTime();

        long dayDifference = (last / dayCoefficient) - (first / dayCoefficient);

        return dayDifference;

    }

    public static long yearOfDate(Date date){
        
        String yearStr = new SimpleDateFormat("yyyyy").format(date);

        return Long.valueOf(yearStr);
    }

    
    public static long monthOfDate(Date date){
        
        String monthStr = new SimpleDateFormat("MM").format(date);

        return Long.valueOf(monthStr);
    }

    public static Date createDate(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return date;

    }


}
