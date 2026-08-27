package androidx.appcompat.view.menu;

import android.accounts.Account;
import java.util.Objects;
/* loaded from: classes.dex */
public class c11 {
    public final int a;
    public final Account b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;

    public c11(int i, Account account, String str, String str2, String str3, long j) {
        this.a = i;
        this.b = account;
        this.c = j;
        this.d = str3;
        this.e = str2;
        this.f = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c11) {
            c11 c11Var = (c11) obj;
            return this.a == c11Var.a && this.c == c11Var.c && Objects.equals(this.b, c11Var.b) && Objects.equals(this.d, c11Var.d) && Objects.equals(this.e, c11Var.e) && Objects.equals(this.f, c11Var.f);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, Long.valueOf(this.c), this.d, this.e, this.f);
    }
}
