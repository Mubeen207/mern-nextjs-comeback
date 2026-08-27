package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class xz0 {
    public static final wz0 a = new e(null, false);
    public static final wz0 b = new e(null, true);
    public static final wz0 c;
    public static final wz0 d;
    public static final wz0 e;
    public static final wz0 f;

    /* loaded from: classes.dex */
    public static class a implements c {
        public static final a b = new a(true);
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // androidx.appcompat.view.menu.xz0.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = xz0.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                        z = z;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c {
        public static final b a = new b();

        @Override // androidx.appcompat.view.menu.xz0.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = xz0.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* loaded from: classes.dex */
    public static abstract class d implements wz0 {
        public final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        @Override // androidx.appcompat.view.menu.wz0
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.a == null ? b() : c(charSequence, i, i2);
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i, int i2) {
            int a = this.a.a(charSequence, i, i2);
            if (a != 0) {
                if (a != 1) {
                    return b();
                }
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        public final boolean b;

        public e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // androidx.appcompat.view.menu.xz0.d
        public boolean b() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends d {
        public static final f b = new f();

        public f() {
            super(null);
        }

        @Override // androidx.appcompat.view.menu.xz0.d
        public boolean b() {
            return e01.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.a;
        c = new e(bVar, false);
        d = new e(bVar, true);
        e = new e(a.b, false);
        f = f.b;
    }

    public static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
