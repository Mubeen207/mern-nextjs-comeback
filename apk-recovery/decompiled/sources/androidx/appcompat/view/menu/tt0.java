package androidx.appcompat.view.menu;

import android.os.Build;
import android.util.DisplayMetrics;
import androidx.appcompat.view.menu.f8;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.dex */
public class tt0 {
    public static final a b = new a();
    public final f8 a;

    /* loaded from: classes.dex */
    public static class a {
        public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
        public b b;
        public b c;

        /* renamed from: androidx.appcompat.view.menu.tt0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0031a implements f8.e {
            public final /* synthetic */ b a;

            public C0031a(b bVar) {
                this.a = bVar;
            }

            @Override // androidx.appcompat.view.menu.f8.e
            public void a(Object obj) {
                a.this.a.remove(this.a);
                if (a.this.a.isEmpty()) {
                    return;
                }
                ha0.b("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(this.a.a));
            }
        }

        /* loaded from: classes.dex */
        public static class b {
            public static int c = Integer.MIN_VALUE;
            public final int a;
            public final DisplayMetrics b;

            public b(DisplayMetrics displayMetrics) {
                int i = c;
                c = i + 1;
                this.a = i;
                this.b = displayMetrics;
            }
        }

        public f8.e b(b bVar) {
            this.a.add(bVar);
            b bVar2 = this.c;
            this.c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new C0031a(bVar2);
        }

        public b c(int i) {
            b bVar;
            if (this.b == null) {
                this.b = (b) this.a.poll();
            }
            while (true) {
                bVar = this.b;
                if (bVar == null || bVar.a >= i) {
                    break;
                }
                this.b = (b) this.a.poll();
            }
            if (bVar == null) {
                ha0.b("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i) + ", after exhausting the queue.");
                return null;
            } else if (bVar.a != i) {
                ha0.b("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i) + ", the oldest config is now: " + String.valueOf(this.b.a));
                return null;
            } else {
                return bVar;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final f8 a;
        public Map b = new HashMap();
        public DisplayMetrics c;

        public b(f8 f8Var) {
            this.a = f8Var;
        }

        public void a() {
            ha0.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.b.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.c;
            if (!tt0.c() || displayMetrics == null) {
                this.a.c(this.b);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            f8.e b = tt0.b.b(bVar);
            this.b.put("configurationId", Integer.valueOf(bVar.a));
            this.a.d(this.b, b);
        }

        public b b(boolean z) {
            this.b.put("brieflyShowPassword", Boolean.valueOf(z));
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.c = displayMetrics;
            return this;
        }

        public b d(boolean z) {
            this.b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
            return this;
        }

        public b e(c cVar) {
            this.b.put("platformBrightness", cVar.m);
            return this;
        }

        public b f(float f) {
            this.b.put("textScaleFactor", Float.valueOf(f));
            return this;
        }

        public b g(boolean z) {
            this.b.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        light("light"),
        dark("dark");
        
        public String m;

        c(String str) {
            this.m = str;
        }
    }

    public tt0(si siVar) {
        this.a = new f8(siVar, "flutter/settings", p60.a);
    }

    public static DisplayMetrics b(int i) {
        a.b c2 = b.c(i);
        if (c2 == null) {
            return null;
        }
        return c2.b;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public b d() {
        return new b(this.a);
    }
}
