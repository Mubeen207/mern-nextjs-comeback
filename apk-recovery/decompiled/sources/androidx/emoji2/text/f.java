package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.appcompat.view.menu.c31;
import androidx.appcompat.view.menu.jd0;
import androidx.appcompat.view.menu.kd0;
import androidx.appcompat.view.menu.r11;
import androidx.appcompat.view.menu.tj0;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class f {
    public final jd0 a;
    public final char[] b;
    public final a c = new a(1024);
    public final Typeface d;

    /* loaded from: classes.dex */
    public static class a {
        public final SparseArray a;
        public c31 b;

        public a() {
            this(1);
        }

        public a a(int i) {
            SparseArray sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i);
        }

        public final c31 b() {
            return this.b;
        }

        public void c(c31 c31Var, int i, int i2) {
            a a = a(c31Var.b(i));
            if (a == null) {
                a = new a();
                this.a.put(c31Var.b(i), a);
            }
            if (i2 > i) {
                a.c(c31Var, i + 1, i2);
            } else {
                a.b = c31Var;
            }
        }

        public a(int i) {
            this.a = new SparseArray(i);
        }
    }

    public f(Typeface typeface, jd0 jd0Var) {
        this.d = typeface;
        this.a = jd0Var;
        this.b = new char[jd0Var.k() * 2];
        a(jd0Var);
    }

    public static f b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            r11.a("EmojiCompat.MetadataRepo.create");
            return new f(typeface, kd0.b(byteBuffer));
        } finally {
            r11.b();
        }
    }

    public final void a(jd0 jd0Var) {
        int k = jd0Var.k();
        for (int i = 0; i < k; i++) {
            c31 c31Var = new c31(this, i);
            Character.toChars(c31Var.f(), this.b, i * 2);
            h(c31Var);
        }
    }

    public char[] c() {
        return this.b;
    }

    public jd0 d() {
        return this.a;
    }

    public int e() {
        return this.a.l();
    }

    public a f() {
        return this.c;
    }

    public Typeface g() {
        return this.d;
    }

    public void h(c31 c31Var) {
        tj0.h(c31Var, "emoji metadata cannot be null");
        tj0.b(c31Var.c() > 0, "invalid metadata codepoint length");
        this.c.c(c31Var, 0, c31Var.c() - 1);
    }
}
