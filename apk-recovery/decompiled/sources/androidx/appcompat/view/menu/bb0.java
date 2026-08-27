package androidx.appcompat.view.menu;

import java.util.Map;
/* loaded from: classes.dex */
public abstract class bb0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static abstract class a implements uw {
        public static final a m = new C0000a("KEY", 0);
        public static final a n = new b("VALUE", 1);
        public static final /* synthetic */ a[] o = c();

        /* renamed from: androidx.appcompat.view.menu.bb0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum C0000a extends a {
            public C0000a(String str, int i) {
                super(str, i, null);
            }

            @Override // androidx.appcompat.view.menu.uw
            /* renamed from: e */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* loaded from: classes.dex */
        public enum b extends a {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // androidx.appcompat.view.menu.uw
            /* renamed from: e */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        public a(String str, int i) {
        }

        public static /* synthetic */ a[] c() {
            return new a[]{m, n};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) o.clone();
        }

        public /* synthetic */ a(String str, int i, ab0 ab0Var) {
            this(str, i);
        }
    }

    public static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static uw b() {
        return a.m;
    }

    public static String c(Map map) {
        StringBuilder a2 = pc.a(map.size());
        a2.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                a2.append(", ");
            }
            a2.append(entry.getKey());
            a2.append('=');
            a2.append(entry.getValue());
            z = false;
        }
        a2.append('}');
        return a2.toString();
    }

    public static uw d() {
        return a.n;
    }
}
