package androidx.appcompat.view.menu;

import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes.dex */
public class w01 {
    public static final w01 c = new w01(null, null);
    public final Long a;
    public final TimeZone b;

    public w01(Long l, TimeZone timeZone) {
        this.a = l;
        this.b = timeZone;
    }

    public static w01 c() {
        return c;
    }

    public Calendar a() {
        return b(this.b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
