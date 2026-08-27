package androidx.appcompat.view.menu;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* loaded from: classes.dex */
public final class k70 implements xf0, a51 {
    public k70 a = null;
    public boolean b = true;
    public final JsonWriter c;
    public final Map d;
    public final Map e;
    public final wf0 f;
    public final boolean g;

    public k70(Writer writer, Map map, Map map2, wf0 wf0Var, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = wf0Var;
        this.g = z;
    }

    @Override // androidx.appcompat.view.menu.xf0
    public xf0 a(nr nrVar, int i) {
        return j(nrVar.b(), i);
    }

    @Override // androidx.appcompat.view.menu.xf0
    public xf0 b(nr nrVar, long j) {
        return k(nrVar.b(), j);
    }

    @Override // androidx.appcompat.view.menu.xf0
    public xf0 e(nr nrVar, Object obj) {
        return l(nrVar.b(), obj);
    }

    public k70 f(int i) {
        t();
        this.c.value(i);
        return this;
    }

    public k70 g(long j) {
        t();
        this.c.value(j);
        return this;
    }

    public k70 h(Object obj, boolean z) {
        int[] iArr;
        int i = 0;
        if (z && o(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new no(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        } else if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.c.beginArray();
                for (Object obj2 : (Collection) obj) {
                    h(obj2, false);
                }
                this.c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        l((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new no(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.c.endObject();
                return this;
            } else {
                wf0 wf0Var = (wf0) this.d.get(obj.getClass());
                if (wf0Var != null) {
                    return q(wf0Var, obj, z);
                }
                z41 z41Var = (z41) this.e.get(obj.getClass());
                if (z41Var != null) {
                    z41Var.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    c(((Enum) obj).name());
                    return this;
                } else {
                    return q(this.f, obj, z);
                }
            }
        } else if (obj instanceof byte[]) {
            return n((byte[]) obj);
        } else {
            this.c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    g(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    h(number, false);
                }
            } else {
                for (Object obj3 : (Object[]) obj) {
                    h(obj3, false);
                }
            }
            this.c.endArray();
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.a51
    /* renamed from: i */
    public k70 c(String str) {
        t();
        this.c.value(str);
        return this;
    }

    public k70 j(String str, int i) {
        t();
        this.c.name(str);
        return f(i);
    }

    public k70 k(String str, long j) {
        t();
        this.c.name(str);
        return g(j);
    }

    public k70 l(String str, Object obj) {
        return this.g ? s(str, obj) : r(str, obj);
    }

    @Override // androidx.appcompat.view.menu.a51
    /* renamed from: m */
    public k70 d(boolean z) {
        t();
        this.c.value(z);
        return this;
    }

    public k70 n(byte[] bArr) {
        t();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void p() {
        t();
        this.c.flush();
    }

    public k70 q(wf0 wf0Var, Object obj, boolean z) {
        if (!z) {
            this.c.beginObject();
        }
        wf0Var.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }

    public final k70 r(String str, Object obj) {
        t();
        this.c.name(str);
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        return h(obj, false);
    }

    public final k70 s(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        t();
        this.c.name(str);
        return h(obj, false);
    }

    public final void t() {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        k70 k70Var = this.a;
        if (k70Var != null) {
            k70Var.t();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }
}
