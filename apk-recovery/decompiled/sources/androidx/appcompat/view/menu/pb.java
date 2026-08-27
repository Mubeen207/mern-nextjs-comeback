package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class pb implements n70, nb {
    public static final a b = new a(null);
    public static final Map c;
    public static final HashMap d;
    public static final HashMap e;
    public static final HashMap f;
    public static final Map g;
    public final Class a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final String a(Class cls) {
            String str;
            c60.e(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) pb.f.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) pb.f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
            if (r2 == null) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b(java.lang.Class r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                androidx.appcompat.view.menu.c60.e(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb5
            Le:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L6c
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L43
                androidx.appcompat.view.menu.c60.d(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = androidx.appcompat.view.menu.qx0.z(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L40
                goto L43
            L40:
                r1 = r2
                goto Lb5
            L43:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L64
                androidx.appcompat.view.menu.c60.d(r0, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = androidx.appcompat.view.menu.qx0.z(r0, r8, r1, r3, r1)
                goto Lb5
            L64:
                androidx.appcompat.view.menu.c60.d(r0, r5)
                java.lang.String r1 = androidx.appcompat.view.menu.qx0.y(r0, r4, r1, r3, r1)
                goto Lb5
            L6c:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto La0
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9d
                java.util.Map r0 = androidx.appcompat.view.menu.pb.g()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L9d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9d:
                if (r1 != 0) goto Lb5
                goto L40
            La0:
                java.util.Map r0 = androidx.appcompat.view.menu.pb.g()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb5
                java.lang.String r1 = r8.getSimpleName()
            Lb5:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.pb.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(Object obj, Class cls) {
            c60.e(cls, "jClass");
            Map map = pb.c;
            c60.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return t21.c(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = l70.b(l70.c(cls));
            }
            return cls.isInstance(obj);
        }
    }

    static {
        List g2;
        int j;
        Map g3;
        int a2;
        String B;
        String B2;
        int i = 0;
        g2 = sc.g(iw.class, kw.class, yw.class, ax.class, bx.class, cx.class, dx.class, ex.class, fx.class, gx.class, jw.class, lw.class, mw.class, nw.class, ow.class, pw.class, qw.class, rw.class, sw.class, tw.class, vw.class, ww.class, xw.class);
        List list = g2;
        j = tc.j(list, 10);
        ArrayList arrayList = new ArrayList(j);
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                sc.i();
            }
            arrayList.add(s21.a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        g3 = fb0.g(arrayList);
        c = g3;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        c60.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            c60.d(str, "kotlinName");
            B2 = ay0.B(str, '.', null, 2, null);
            sb.append(B2);
            sb.append("CompanionObject");
            oh0 a3 = s21.a(sb.toString(), str + ".Companion");
            hashMap3.put(a3.c(), a3.d());
        }
        for (Map.Entry entry : c.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + intValue);
        }
        f = hashMap3;
        a2 = eb0.a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            B = ay0.B((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, B);
        }
        g = linkedHashMap;
    }

    public pb(Class cls) {
        c60.e(cls, "jClass");
        this.a = cls;
    }

    @Override // androidx.appcompat.view.menu.n70
    public String a() {
        return b.a(d());
    }

    @Override // androidx.appcompat.view.menu.n70
    public boolean b(Object obj) {
        return b.c(obj, d());
    }

    @Override // androidx.appcompat.view.menu.n70
    public String c() {
        return b.b(d());
    }

    @Override // androidx.appcompat.view.menu.nb
    public Class d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof pb) && c60.a(l70.b(this), l70.b((n70) obj));
    }

    public int hashCode() {
        return l70.b(this).hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
