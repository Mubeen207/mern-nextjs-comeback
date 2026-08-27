package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ah;
/* loaded from: classes.dex */
public interface kh {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: androidx.appcompat.view.menu.kh$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0010a extends j80 implements yw {
            public static final C0010a n = new C0010a();

            public C0010a() {
                super(2);
            }

            @Override // androidx.appcompat.view.menu.yw
            /* renamed from: a */
            public final kh h(kh khVar, b bVar) {
                dd ddVar;
                c60.e(khVar, "acc");
                c60.e(bVar, "element");
                kh j = khVar.j(bVar.getKey());
                bo boVar = bo.m;
                if (j == boVar) {
                    return bVar;
                }
                ah.b bVar2 = ah.b;
                ah ahVar = (ah) j.d(bVar2);
                if (ahVar == null) {
                    ddVar = new dd(j, bVar);
                } else {
                    kh j2 = j.j(bVar2);
                    if (j2 == boVar) {
                        return new dd(bVar, ahVar);
                    }
                    ddVar = new dd(new dd(j2, bVar), ahVar);
                }
                return ddVar;
            }
        }

        public static kh a(kh khVar, kh khVar2) {
            c60.e(khVar2, "context");
            return khVar2 == bo.m ? khVar : (kh) khVar2.p(khVar, C0010a.n);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends kh {

        /* loaded from: classes.dex */
        public static final class a {
            public static Object a(b bVar, Object obj, yw ywVar) {
                c60.e(ywVar, "operation");
                return ywVar.h(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                c60.e(cVar, "key");
                if (c60.a(bVar.getKey(), cVar)) {
                    c60.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static kh c(b bVar, c cVar) {
                c60.e(cVar, "key");
                return c60.a(bVar.getKey(), cVar) ? bo.m : bVar;
            }

            public static kh d(b bVar, kh khVar) {
                c60.e(khVar, "context");
                return a.a(bVar, khVar);
            }
        }

        @Override // androidx.appcompat.view.menu.kh
        b d(c cVar);

        c getKey();
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    b d(c cVar);

    kh j(c cVar);

    kh o(kh khVar);

    Object p(Object obj, yw ywVar);
}
