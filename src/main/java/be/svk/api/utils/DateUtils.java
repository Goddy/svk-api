package be.svk.api.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by u0090265 on 07/11/16.
 */
public class DateUtils {
    private static final DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd/MM/YYYY");

    public static DateTime convertToDate(String date) {
        return dateFormatter.parseDateTime(date);
    }
}
