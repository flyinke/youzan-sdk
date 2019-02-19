package com.youzan.open.sdk.util.misc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    private TimeUtil() {}

    public static String formatTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

}
