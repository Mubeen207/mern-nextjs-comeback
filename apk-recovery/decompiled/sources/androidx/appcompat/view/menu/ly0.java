package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class ly0 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    public Object d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class[] c = {MenuItem.class};
        public Object a;
        public Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                }
                this.b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;
        public Menu a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        public void a() {
            this.h = true;
            i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, ly0.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = ly0.this.c.obtainStyledAttributes(attributeSet, pn0.J0);
            this.b = obtainStyledAttributes.getResourceId(pn0.L0, 0);
            this.c = obtainStyledAttributes.getInt(pn0.N0, 0);
            this.d = obtainStyledAttributes.getInt(pn0.O0, 0);
            this.e = obtainStyledAttributes.getInt(pn0.P0, 0);
            this.f = obtainStyledAttributes.getBoolean(pn0.M0, true);
            this.g = obtainStyledAttributes.getBoolean(pn0.K0, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            b11 s = b11.s(ly0.this.c, attributeSet, pn0.Q0);
            this.i = s.m(pn0.T0, 0);
            this.j = (s.j(pn0.W0, this.c) & (-65536)) | (s.j(pn0.X0, this.d) & 65535);
            this.k = s.o(pn0.Y0);
            this.l = s.o(pn0.Z0);
            this.m = s.m(pn0.R0, 0);
            this.n = c(s.n(pn0.a1));
            this.o = s.j(pn0.h1, 4096);
            this.p = c(s.n(pn0.b1));
            this.q = s.j(pn0.l1, 4096);
            if (s.q(pn0.c1)) {
                this.r = s.a(pn0.c1, false) ? 1 : 0;
            } else {
                this.r = this.e;
            }
            this.s = s.a(pn0.U0, false);
            this.t = s.a(pn0.V0, this.f);
            this.u = s.a(pn0.S0, this.g);
            this.v = s.j(pn0.m1, -1);
            this.z = s.n(pn0.d1);
            this.w = s.m(pn0.e1, 0);
            this.x = s.n(pn0.g1);
            String n = s.n(pn0.f1);
            this.y = n;
            if (n != null && this.w == 0 && this.x == null) {
                my0.a(e(n, ly0.f, ly0.this.b));
            }
            this.A = s.o(pn0.i1);
            this.B = s.o(pn0.n1);
            if (s.q(pn0.k1)) {
                this.D = vm.d(s.j(pn0.k1, -1), this.D);
            } else {
                this.D = null;
            }
            if (s.q(pn0.j1)) {
                this.C = s.c(pn0.j1);
            } else {
                this.C = null;
            }
            s.v();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (ly0.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(ly0.this.b(), this.z));
            }
            if (this.r >= 2 && (menuItem instanceof tc0)) {
                ((tc0) menuItem).s(true);
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, ly0.e, ly0.this.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            rc0.b(menuItem, this.A);
            rc0.f(menuItem, this.B);
            rc0.a(menuItem, this.n, this.o);
            rc0.e(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                rc0.d(menuItem, mode);
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                rc0.c(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public ly0(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.d == null) {
            this.d = a(this.c);
        }
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.d() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (r15.equals("menu") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r7 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
        if (r15.equals("group") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
        if (r15.equals("item") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
        if (r15.equals("menu") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            androidx.appcompat.view.menu.ly0$b r0 = new androidx.appcompat.view.menu.ly0$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lb8
            if (r15 == r3) goto Lb0
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L80
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lab
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lab
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lab
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L78
            boolean r15 = r0.d()
            if (r15 != 0) goto Lab
            r0.a()
            goto Lab
        L78:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lab
            r6 = r3
            goto Lab
        L80:
            if (r7 == 0) goto L83
            goto Lab
        L83:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L91
            r0.f(r14)
            goto Lab
        L91:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L9b
            r0.g(r14)
            goto Lab
        L9b:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto La9
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lab
        La9:
            r8 = r15
            r7 = r3
        Lab:
            int r15 = r13.next()
            goto L40
        Lb0:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ly0.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof ky0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof pc0) {
                    pc0 pc0Var = (pc0) menu;
                    if (pc0Var.B()) {
                        pc0Var.W();
                        z = true;
                    }
                }
                c(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((pc0) menu).V();
                }
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((pc0) menu).V();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
