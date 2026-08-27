package androidx.appcompat.view.menu;

import com.snake.helper.Native;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
/* loaded from: classes.dex */
public class s60 implements Thread.UncaughtExceptionHandler {
    public static final s60 b = new s60();
    public Thread.UncaughtExceptionHandler a = null;

    public static s60 a() {
        return b;
    }

    public void b() {
        this.a = Thread.getDefaultUncaughtExceptionHandler();
        try {
            Thread.setDefaultUncaughtExceptionHandler(this);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        Native.chl(stringWriter.toString().getBytes());
    }
}
