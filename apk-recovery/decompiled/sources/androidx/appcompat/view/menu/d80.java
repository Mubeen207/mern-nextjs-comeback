package androidx.appcompat.view.menu;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.appcompat.view.menu.c80;
import io.flutter.plugin.editing.a;
import java.util.HashSet;
import java.util.Map;
/* loaded from: classes.dex */
public class d80 implements a.InterfaceC0069a, c80.b {
    public final d[] a;
    public final HashSet b = new HashSet();
    public final e c;

    /* loaded from: classes.dex */
    public static class b {
        public int a = 0;

        public Character a(int i) {
            char c = (char) i;
            if ((Integer.MIN_VALUE & i) != 0) {
                int i2 = i & Integer.MAX_VALUE;
                int i3 = this.a;
                if (i3 != 0) {
                    this.a = KeyCharacterMap.getDeadChar(i3, i2);
                } else {
                    this.a = i2;
                }
            } else {
                int i4 = this.a;
                if (i4 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i4, i);
                    if (deadChar > 0) {
                        c = (char) deadChar;
                    }
                    this.a = 0;
                }
            }
            return Character.valueOf(c);
        }
    }

    /* loaded from: classes.dex */
    public class c {
        public final KeyEvent a;
        public int b;
        public boolean c = false;

        /* loaded from: classes.dex */
        public class a implements d.a {
            public boolean a;

            public a() {
                this.a = false;
            }

            @Override // androidx.appcompat.view.menu.d80.d.a
            public void a(boolean z) {
                if (this.a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.a = true;
                c cVar = c.this;
                int i = cVar.b - 1;
                cVar.b = i;
                boolean z2 = z | cVar.c;
                cVar.c = z2;
                if (i != 0 || z2) {
                    return;
                }
                d80.this.e(cVar.a);
            }
        }

        public c(KeyEvent keyEvent) {
            this.b = d80.this.a.length;
            this.a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    /* loaded from: classes.dex */
    public interface d {

        /* loaded from: classes.dex */
        public interface a {
            void a(boolean z);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        i8 getBinaryMessenger();
    }

    public d80(e eVar) {
        this.c = eVar;
        this.a = new d[]{new z70(eVar.getBinaryMessenger()), new u70(new b80(eVar.getBinaryMessenger()))};
        new c80(eVar.getBinaryMessenger()).b(this);
    }

    @Override // androidx.appcompat.view.menu.c80.b
    public Map a() {
        return ((z70) this.a[0]).h();
    }

    @Override // io.flutter.plugin.editing.a.InterfaceC0069a
    public boolean b(KeyEvent keyEvent) {
        if (this.b.remove(keyEvent)) {
            return false;
        }
        if (this.a.length <= 0) {
            e(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    public void d() {
        int size = this.b.size();
        if (size > 0) {
            ha0.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    public final void e(KeyEvent keyEvent) {
        e eVar = this.c;
        if (eVar == null || eVar.c(keyEvent)) {
            return;
        }
        this.b.add(keyEvent);
        this.c.a(keyEvent);
        if (this.b.remove(keyEvent)) {
            ha0.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }
}
