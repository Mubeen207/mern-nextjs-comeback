package androidx.appcompat.view.menu;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum q uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class y12 {
    public static final y12 p;
    public static final y12 q;
    public static final y12 r;
    public static final y12 s;
    public static final y12 t;
    public static final y12 u;
    public static final y12 v;
    public static final y12 w;
    public static final y12 x;
    public static final y12 y;
    public static final /* synthetic */ y12[] z;
    public final Class m;
    public final Class n;
    public final Object o;

    static {
        y12 y12Var = new y12("VOID", 0, Void.class, Void.class, null);
        p = y12Var;
        Class cls = Integer.TYPE;
        y12 y12Var2 = new y12("INT", 1, cls, Integer.class, 0);
        q = y12Var2;
        y12 y12Var3 = new y12("LONG", 2, Long.TYPE, Long.class, 0L);
        r = y12Var3;
        y12 y12Var4 = new y12("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        s = y12Var4;
        y12 y12Var5 = new y12("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        t = y12Var5;
        y12 y12Var6 = new y12("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        u = y12Var6;
        y12 y12Var7 = new y12("STRING", 6, String.class, String.class, "");
        v = y12Var7;
        y12 y12Var8 = new y12("BYTE_STRING", 7, tx1.class, tx1.class, tx1.n);
        w = y12Var8;
        y12 y12Var9 = new y12("ENUM", 8, cls, Integer.class, null);
        x = y12Var9;
        y12 y12Var10 = new y12("MESSAGE", 9, Object.class, Object.class, null);
        y = y12Var10;
        z = new y12[]{y12Var, y12Var2, y12Var3, y12Var4, y12Var5, y12Var6, y12Var7, y12Var8, y12Var9, y12Var10};
    }

    public y12(String str, int i, Class cls, Class cls2, Object obj) {
        this.m = cls;
        this.n = cls2;
        this.o = obj;
    }

    public static y12[] values() {
        return (y12[]) z.clone();
    }

    public final Class c() {
        return this.n;
    }
}
