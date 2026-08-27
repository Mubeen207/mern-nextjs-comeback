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
public class o82 {
    public static final o82 A;
    public static final o82 B;
    public static final o82 C;
    public static final o82 D;
    public static final o82 E;
    public static final o82 F;
    public static final /* synthetic */ o82[] G;
    public static final o82 o;
    public static final o82 p;
    public static final o82 q;
    public static final o82 r;
    public static final o82 s;
    public static final o82 t;
    public static final o82 u;
    public static final o82 v;
    public static final o82 w;
    public static final o82 x;
    public static final o82 y;
    public static final o82 z;
    public final i92 m;
    public final int n;

    static {
        o82 o82Var = new o82("DOUBLE", 0, i92.DOUBLE, 1);
        o = o82Var;
        o82 o82Var2 = new o82("FLOAT", 1, i92.FLOAT, 5);
        p = o82Var2;
        i92 i92Var = i92.LONG;
        o82 o82Var3 = new o82("INT64", 2, i92Var, 0);
        q = o82Var3;
        o82 o82Var4 = new o82("UINT64", 3, i92Var, 0);
        r = o82Var4;
        i92 i92Var2 = i92.INT;
        o82 o82Var5 = new o82("INT32", 4, i92Var2, 0);
        s = o82Var5;
        o82 o82Var6 = new o82("FIXED64", 5, i92Var, 1);
        t = o82Var6;
        o82 o82Var7 = new o82("FIXED32", 6, i92Var2, 5);
        u = o82Var7;
        o82 o82Var8 = new o82("BOOL", 7, i92.BOOLEAN, 0);
        v = o82Var8;
        m82 m82Var = new m82("STRING", i92.STRING);
        w = m82Var;
        i92 i92Var3 = i92.MESSAGE;
        q82 q82Var = new q82("GROUP", i92Var3);
        x = q82Var;
        u82 u82Var = new u82("MESSAGE", i92Var3);
        y = u82Var;
        y82 y82Var = new y82("BYTES", i92.BYTE_STRING);
        z = y82Var;
        o82 o82Var9 = new o82("UINT32", 12, i92Var2, 0);
        A = o82Var9;
        o82 o82Var10 = new o82("ENUM", 13, i92.ENUM, 0);
        B = o82Var10;
        o82 o82Var11 = new o82("SFIXED32", 14, i92Var2, 5);
        C = o82Var11;
        o82 o82Var12 = new o82("SFIXED64", 15, i92Var, 1);
        D = o82Var12;
        o82 o82Var13 = new o82("SINT32", 16, i92Var2, 0);
        E = o82Var13;
        o82 o82Var14 = new o82("SINT64", 17, i92Var, 0);
        F = o82Var14;
        G = new o82[]{o82Var, o82Var2, o82Var3, o82Var4, o82Var5, o82Var6, o82Var7, o82Var8, m82Var, q82Var, u82Var, y82Var, o82Var9, o82Var10, o82Var11, o82Var12, o82Var13, o82Var14};
    }

    public static o82[] values() {
        return (o82[]) G.clone();
    }

    public final i92 c() {
        return this.m;
    }

    public o82(String str, int i, i92 i92Var, int i2) {
        this.m = i92Var;
        this.n = i2;
    }
}
