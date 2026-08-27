package androidx.appcompat.view.menu;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class cx0 {
    public static final int n = 1;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int e;
    public boolean l;
    public int d = 0;
    public Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    public int g = Integer.MAX_VALUE;
    public float h = 0.0f;
    public float i = 1.0f;
    public int j = n;
    public boolean k = true;
    public TextUtils.TruncateAt m = null;

    /* loaded from: classes.dex */
    public static class a extends Exception {
    }

    public cx0(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.e = charSequence.length();
    }

    public static cx0 b(CharSequence charSequence, TextPaint textPaint, int i) {
        return new cx0(charSequence, textPaint, i);
    }

    public StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, max, this.m);
        }
        int min = Math.min(charSequence.length(), this.e);
        this.e = min;
        if (this.l && this.g == 1) {
            this.f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.d, min, this.b, max);
        obtain.setAlignment(this.f);
        obtain.setIncludePad(this.k);
        obtain.setTextDirection(this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.g);
        float f = this.h;
        if (f != 0.0f || this.i != 1.0f) {
            obtain.setLineSpacing(f, this.i);
        }
        if (this.g > 1) {
            obtain.setHyphenationFrequency(this.j);
        }
        return obtain.build();
    }

    public cx0 c(Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    public cx0 d(TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    public cx0 e(int i) {
        this.j = i;
        return this;
    }

    public cx0 f(boolean z) {
        this.k = z;
        return this;
    }

    public cx0 g(boolean z) {
        this.l = z;
        return this;
    }

    public cx0 h(float f, float f2) {
        this.h = f;
        this.i = f2;
        return this;
    }

    public cx0 i(int i) {
        this.g = i;
        return this;
    }

    public cx0 j(dx0 dx0Var) {
        return this;
    }
}
