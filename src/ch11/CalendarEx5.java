package ch11;

import com.sun.xml.internal.ws.streaming.MtomStreamWriter;

import java.util.Calendar;

public class CalendarEx5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2005, 0, 31);
        System.out.println(toString(date));
        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
    }
}
