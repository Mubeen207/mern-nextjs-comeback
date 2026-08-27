package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.appcompat.view.menu.nh0;
import androidx.emoji2.text.c;
/* loaded from: classes.dex */
public class b implements c.e {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.c.e
    public boolean a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder b2 = b();
        b2.setLength(0);
        while (i < i2) {
            b2.append(charSequence.charAt(i));
            i++;
        }
        return nh0.a(this.a, b2.toString());
    }
}
