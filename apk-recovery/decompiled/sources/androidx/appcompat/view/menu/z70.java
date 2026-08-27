package androidx.appcompat.view.menu;

import android.view.KeyEvent;
import androidx.appcompat.view.menu.d80;
import androidx.appcompat.view.menu.e80;
import androidx.appcompat.view.menu.i8;
import androidx.appcompat.view.menu.v70;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class z70 implements d80.d {
    public final i8 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final d80.b d = new d80.b();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v70.b.values().length];
            a = iArr;
            try {
                iArr[v70.b.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[v70.b.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[v70.b.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public z70(i8 i8Var) {
        e80.e[] a2;
        this.a = i8Var;
        for (e80.e eVar : e80.a()) {
            this.c.put(Long.valueOf(eVar.c), eVar);
        }
    }

    public static v70.b e(KeyEvent keyEvent) {
        boolean z = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z ? v70.b.kRepeat : v70.b.kDown;
        } else if (action == 1) {
            return v70.b.kUp;
        } else {
            throw new AssertionError("Unexpected event type");
        }
    }

    public static long j(long j, long j2) {
        return (j & 4294967295L) | j2;
    }

    public static /* synthetic */ void k(d80.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                bool = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            ha0.g("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        aVar.a(bool.booleanValue());
    }

    @Override // androidx.appcompat.view.menu.d80.d
    public void a(KeyEvent keyEvent, d80.d.a aVar) {
        if (i(keyEvent, aVar)) {
            return;
        }
        q(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    public final Long f(KeyEvent keyEvent) {
        Long l = (Long) e80.b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l != null ? l : Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
    }

    public final Long g(KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
        }
        Long l = (Long) e80.a.get(Long.valueOf(scanCode));
        return l != null ? l : Long.valueOf(j(keyEvent.getScanCode(), 73014444032L));
    }

    public Map h() {
        return Collections.unmodifiableMap(this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c A[LOOP:2: B:68:0x0146->B:70:0x014c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.view.KeyEvent r18, androidx.appcompat.view.menu.d80.d.a r19) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.z70.i(android.view.KeyEvent, androidx.appcompat.view.menu.d80$d$a):boolean");
    }

    public final /* synthetic */ void l(e80.c cVar, long j, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.b), Long.valueOf(j), keyEvent.getEventTime());
    }

    public final /* synthetic */ void m(e80.c cVar, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.b), Long.valueOf(cVar.a), keyEvent.getEventTime());
    }

    public final void n(v70 v70Var, final d80.d.a aVar) {
        this.a.b("flutter/keydata", v70Var.a(), aVar == null ? null : new i8.b() { // from class: androidx.appcompat.view.menu.w70
            @Override // androidx.appcompat.view.menu.i8.b
            public final void a(ByteBuffer byteBuffer) {
                z70.k(d80.d.a.this, byteBuffer);
            }
        });
    }

    public void o(e80.d dVar, boolean z, long j, final long j2, final KeyEvent keyEvent, ArrayList arrayList) {
        e80.c[] cVarArr = dVar.b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z2 = false;
        int i = 0;
        while (true) {
            e80.c[] cVarArr2 = dVar.b;
            boolean z3 = true;
            if (i >= cVarArr2.length) {
                break;
            }
            final e80.c cVar = cVarArr2[i];
            boolean containsKey = this.b.containsKey(Long.valueOf(cVar.a));
            zArr[i] = containsKey;
            if (cVar.b == j) {
                int i2 = a.a[e(keyEvent).ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    } else if (i2 == 3) {
                        if (!z) {
                            arrayList.add(new Runnable() { // from class: androidx.appcompat.view.menu.y70
                                @Override // java.lang.Runnable
                                public final void run() {
                                    z70.this.m(cVar, keyEvent);
                                }
                            });
                        }
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                    i++;
                } else {
                    boolArr[i] = Boolean.FALSE;
                    if (!z) {
                        arrayList.add(new Runnable() { // from class: androidx.appcompat.view.menu.x70
                            @Override // java.lang.Runnable
                            public final void run() {
                                z70.this.l(cVar, j2, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z2 && !containsKey) {
                z3 = false;
            }
            z2 = z3;
            i++;
        }
        if (z) {
            for (int i3 = 0; i3 < dVar.b.length; i3++) {
                if (boolArr[i3] == null) {
                    if (z2) {
                        boolArr[i3] = Boolean.valueOf(zArr[i3]);
                    } else {
                        boolArr[i3] = Boolean.TRUE;
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i4 = 0; i4 < dVar.b.length; i4++) {
                if (boolArr[i4] == null) {
                    boolArr[i4] = Boolean.FALSE;
                }
            }
        }
        for (int i5 = 0; i5 < dVar.b.length; i5++) {
            if (zArr[i5] != boolArr[i5].booleanValue()) {
                e80.c cVar2 = dVar.b[i5];
                q(boolArr[i5].booleanValue(), Long.valueOf(cVar2.b), Long.valueOf(cVar2.a), keyEvent.getEventTime());
            }
        }
    }

    public void p(e80.e eVar, boolean z, long j, KeyEvent keyEvent) {
        if (eVar.c == j || eVar.d == z) {
            return;
        }
        boolean containsKey = this.b.containsKey(Long.valueOf(eVar.b));
        boolean z2 = !containsKey;
        if (z2) {
            eVar.d = !eVar.d;
        }
        q(z2, Long.valueOf(eVar.c), Long.valueOf(eVar.b), keyEvent.getEventTime());
        if (!z2) {
            eVar.d = !eVar.d;
        }
        q(containsKey, Long.valueOf(eVar.c), Long.valueOf(eVar.b), keyEvent.getEventTime());
    }

    public final void q(boolean z, Long l, Long l2, long j) {
        v70 v70Var = new v70();
        v70Var.a = j;
        v70Var.b = z ? v70.b.kDown : v70.b.kUp;
        v70Var.d = l.longValue();
        v70Var.c = l2.longValue();
        v70Var.g = null;
        v70Var.e = true;
        v70Var.f = v70.a.kKeyboard;
        if (l2.longValue() != 0 && l.longValue() != 0) {
            if (!z) {
                l = null;
            }
            r(l2, l);
        }
        n(v70Var, null);
    }

    public void r(Long l, Long l2) {
        if (l2 != null) {
            if (((Long) this.b.put(l, l2)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) this.b.remove(l)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
