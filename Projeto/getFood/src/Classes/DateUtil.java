package Classes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

    public DateUtil() {

    }

    public Date resolvePrimeiroUltimoSemana(Date data, boolean isPrimeiro) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        if (isPrimeiro) {
            calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        } else {
            calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        }
        return calendar.getTime();
    }

}
