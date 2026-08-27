package androidx.appcompat.view.menu;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class fw0 extends SpannableStringBuilder {
    public final Class m;
    public final List n;

    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {
        public final Object a;
        public final AtomicInteger b = new AtomicInteger(0);

        public a(Object obj) {
            this.a = obj;
        }

        public final void a() {
            this.b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.a).afterTextChanged(editable);
        }

        public final boolean b(Object obj) {
            return obj instanceof vn;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.a).beforeTextChanged(charSequence, i, i2, i3);
        }

        public final void c() {
            this.b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.a).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public fw0(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.n = new ArrayList();
        tj0.h(cls, "watcherClass cannot be null");
        this.m = cls;
    }

    public static fw0 c(Class cls, CharSequence charSequence) {
        return new fw0(cls, charSequence);
    }

    public void a() {
        b();
    }

    public final void b() {
        for (int i = 0; i < this.n.size(); i++) {
            ((a) this.n.get(i)).a();
        }
    }

    public void d() {
        i();
        e();
    }

    public final void e() {
        for (int i = 0; i < this.n.size(); i++) {
            ((a) this.n.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    public final a f(Object obj) {
        for (int i = 0; i < this.n.size(); i++) {
            a aVar = (a) this.n.get(i);
            if (aVar.a == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean g(Class cls) {
        return this.m == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a f;
        if (h(obj) && (f = f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a f;
        if (h(obj) && (f = f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a f;
        if (h(obj) && (f = f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        if (g(cls)) {
            a[] aVarArr = (a[]) super.getSpans(i, i2, a.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, aVarArr.length);
            for (int i3 = 0; i3 < aVarArr.length; i3++) {
                objArr[i3] = aVarArr[i3].a;
            }
            return objArr;
        }
        return super.getSpans(i, i2, cls);
    }

    public final boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    public final void i() {
        for (int i = 0; i < this.n.size(); i++) {
            ((a) this.n.get(i)).c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || g(cls)) ? a.class : a.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.n.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.n.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return new fw0(this.m, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        b();
        super.replace(i, i2, charSequence);
        i();
        return this;
    }

    public fw0(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.n = new ArrayList();
        tj0.h(cls, "watcherClass cannot be null");
        this.m = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        b();
        super.replace(i, i2, charSequence, i3, i4);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
