package androidx.appcompat.view.menu;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
/* loaded from: classes.dex */
public class y31 implements Spannable {
    public boolean m = false;
    public Spannable n;

    /* loaded from: classes.dex */
    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public abstract boolean a(CharSequence charSequence);
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // androidx.appcompat.view.menu.y31.b
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedText;
        }
    }

    public y31(Spannable spannable) {
        this.n = spannable;
    }

    public static b c() {
        return new c();
    }

    public final void a() {
        Spannable spannable = this.n;
        if (!this.m && c().a(spannable)) {
            this.n = new SpannableString(spannable);
        }
        this.m = true;
    }

    public Spannable b() {
        return this.n;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.n.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.n);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.n);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.n.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.n.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.n.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        return this.n.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.n.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.n.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.n.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.n.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.n.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.n.toString();
    }

    public y31(CharSequence charSequence) {
        this.n = new SpannableString(charSequence);
    }
}
