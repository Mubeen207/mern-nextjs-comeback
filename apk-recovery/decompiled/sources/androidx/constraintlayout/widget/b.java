package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.appcompat.view.menu.jn0;
import androidx.appcompat.view.menu.t02;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class b {
    public String a;
    public EnumC0037b b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0037b.values().length];
            a = iArr;
            try {
                iArr[EnumC0037b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0037b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0037b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC0037b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC0037b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC0037b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC0037b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0037b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public b(String str, EnumC0037b enumC0037b, Object obj) {
        this.a = str;
        this.b = enumC0037b;
        d(obj);
    }

    public static HashMap a(HashMap hashMap, View view) {
        HashMap hashMap2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = (b) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        EnumC0037b enumC0037b;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), jn0.O2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0037b enumC0037b2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == jn0.P2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == jn0.Q2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0037b2 = EnumC0037b.BOOLEAN_TYPE;
            } else {
                if (index == jn0.S2) {
                    enumC0037b = EnumC0037b.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == jn0.R2) {
                    enumC0037b = EnumC0037b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == jn0.W2) {
                    enumC0037b = EnumC0037b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == jn0.T2) {
                    enumC0037b = EnumC0037b.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == jn0.U2) {
                    enumC0037b = EnumC0037b.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == jn0.V2) {
                    enumC0037b = EnumC0037b.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == jn0.X2) {
                    enumC0037b = EnumC0037b.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                Object obj2 = string;
                enumC0037b2 = enumC0037b;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new b(str, enumC0037b2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = (b) hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (a.a[bVar.b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.g);
                        method.invoke(view, colorDrawable);
                        break;
                    case t02.c.c /* 3 */:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.d));
                        break;
                    case t02.c.e /* 5 */:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.e);
                        break;
                    case t02.c.f /* 6 */:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f));
                        break;
                    case t02.c.g /* 7 */:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.d));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.getMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(str);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cls.getName());
                sb3.append(" must have a method ");
                sb3.append(str2);
            } catch (InvocationTargetException e3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" Custom Attribute \"");
                sb4.append(str);
                sb4.append("\" not found on ");
                sb4.append(cls.getName());
                e3.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (a.a[this.b.ordinal()]) {
            case 1:
            case 2:
                this.g = ((Integer) obj).intValue();
                return;
            case t02.c.c /* 3 */:
                this.c = ((Integer) obj).intValue();
                return;
            case 4:
                this.d = ((Float) obj).floatValue();
                return;
            case t02.c.e /* 5 */:
                this.e = (String) obj;
                return;
            case t02.c.f /* 6 */:
                this.f = ((Boolean) obj).booleanValue();
                return;
            case t02.c.g /* 7 */:
                this.d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public b(b bVar, Object obj) {
        this.a = bVar.a;
        this.b = bVar.b;
        d(obj);
    }
}
