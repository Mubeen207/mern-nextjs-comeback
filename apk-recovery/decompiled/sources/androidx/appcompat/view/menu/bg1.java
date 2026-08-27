package androidx.appcompat.view.menu;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class bg1 implements tg1 {
    public final Double m;

    public bg1(Double d) {
        if (d == null) {
            this.m = Double.valueOf(Double.NaN);
        } else {
            this.m = d;
        }
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final tg1 c() {
        return new bg1(this.m);
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Boolean d() {
        return Boolean.valueOf((Double.isNaN(this.m.doubleValue()) || this.m.doubleValue() == 0.0d) ? false : true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bg1) {
            return this.m.equals(((bg1) obj).m);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Double f() {
        return this.m;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final String g() {
        if (Double.isNaN(this.m.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.m.doubleValue())) {
            return this.m.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.m.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
        }
        return format;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Iterator i() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final tg1 p(String str, sw1 sw1Var, List list) {
        if ("toString".equals(str)) {
            return new xg1(g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", g(), str));
    }

    public final String toString() {
        return g();
    }
}
