package androidx.appcompat.view.menu;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
/* loaded from: classes.dex */
public abstract class nj0 implements Spannable {

    /* loaded from: classes.dex */
    public static final class a {
        public final TextPaint a;
        public final TextDirectionHeuristic b;
        public final int c;
        public final int d;
        public final PrecomputedText.Params e;

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            this.e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public boolean a(a aVar) {
            if (this.c == aVar.b() && this.d == aVar.c() && this.a.getTextSize() == aVar.e().getTextSize() && this.a.getTextScaleX() == aVar.e().getTextScaleX() && this.a.getTextSkewX() == aVar.e().getTextSkewX() && this.a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.a.getFlags() == aVar.e().getFlags() && this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.a.getTypeface() == null ? aVar.e().getTypeface() == null : this.a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a(aVar) && this.b == aVar.d();
            }
            return false;
        }

        public int hashCode() {
            return bg0.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.a.getTextSize());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            sb.append(", letterSpacing=" + this.a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            sb.append(", textLocale=" + this.a.getTextLocales());
            sb.append(", typeface=" + this.a.getTypeface());
            sb.append(", variationSettings=" + this.a.getFontVariationSettings());
            sb.append(", textDir=" + this.b);
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }
    }
}
