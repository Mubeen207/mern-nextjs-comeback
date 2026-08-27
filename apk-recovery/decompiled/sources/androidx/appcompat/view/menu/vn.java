package androidx.appcompat.view.menu;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* loaded from: classes.dex */
public abstract class vn extends ReplacementSpan {
    public final c31 b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public short d = -1;
    public float e = 1.0f;

    public vn(c31 c31Var) {
        tj0.h(c31Var, "rasterizer cannot be null");
        this.b = c31Var;
    }

    public final c31 a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.a);
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        this.e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.b.e();
        this.d = (short) (this.b.e() * this.e);
        short i3 = (short) (this.b.i() * this.e);
        this.c = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}
