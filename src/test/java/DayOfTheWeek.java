import com.sun.org.apache.regexp.internal.RE;

import java.util.Calendar;

public class DayOfTheWeek {
    public static String findDay(int month, int day , int year) {

        Calendar cal  = Calendar.getInstance();
        cal.set(Calendar.MONTH,month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR,year);

        String[] day_of_week = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        return day_of_week[cal.get(Calendar.DAY_OF_WEEK)-1];
    }
}
