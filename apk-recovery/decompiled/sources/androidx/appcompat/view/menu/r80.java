package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class r80 implements hl0 {
    public volatile Set b = null;
    public volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public r80(Collection collection) {
        this.a.addAll(collection);
    }

    public static r80 b(Collection collection) {
        return new r80((Set) collection);
    }

    public synchronized void a(hl0 hl0Var) {
        try {
            if (this.b == null) {
                this.a.add(hl0Var);
            } else {
                this.b.add(hl0Var.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.hl0
    /* renamed from: c */
    public Set get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }

    public final synchronized void d() {
        try {
            for (hl0 hl0Var : this.a) {
                this.b.add(hl0Var.get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
