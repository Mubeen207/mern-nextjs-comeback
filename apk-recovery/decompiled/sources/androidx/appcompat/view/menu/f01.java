package androidx.appcompat.view.menu;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.appcompat.view.menu.nj0;
/* loaded from: classes.dex */
public abstract class f01 {

    /* loaded from: classes.dex */
    public static class a {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void d(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements ActionMode.Callback {
        public abstract ActionMode.Callback a();
    }

    public static Drawable[] a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int d(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static nj0.a e(TextView textView) {
        return new nj0.a(b.c(textView));
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        tj0.g(textView);
        a.f(textView, colorStateList);
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        tj0.g(textView);
        a.g(textView, mode);
    }

    public static void h(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void i(TextView textView, int i) {
        tj0.d(i);
        b.d(textView, i);
    }

    public static void j(TextView textView, int i) {
        tj0.d(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void k(TextView textView, int i) {
        tj0.d(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void l(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.a(textView, i, f);
        } else {
            k(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void m(TextView textView, nj0 nj0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        e(textView);
        throw null;
    }

    public static void n(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    public static void o(TextView textView, nj0.a aVar) {
        textView.setTextDirection(d(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.e(textView, aVar.b());
        a.h(textView, aVar.c());
    }

    public static ActionMode.Callback p(ActionMode.Callback callback) {
        return callback instanceof d ? ((d) callback).a() : callback;
    }

    public static ActionMode.Callback q(TextView textView, ActionMode.Callback callback) {
        return callback;
    }
}
