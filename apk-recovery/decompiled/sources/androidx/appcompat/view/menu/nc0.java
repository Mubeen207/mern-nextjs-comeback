package androidx.appcompat.view.menu;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
/* loaded from: classes.dex */
public abstract class nc0 {
    public static final b a = new b(null);

    /* loaded from: classes.dex */
    public static final class a extends nc0 {
        public final mc0 b;

        /* renamed from: androidx.appcompat.view.menu.nc0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0017a extends oy0 implements yw {
            public int q;

            public C0017a(hl hlVar, xg xgVar) {
                super(2, xgVar);
            }

            @Override // androidx.appcompat.view.menu.y7
            public final xg a(Object obj, xg xgVar) {
                return new C0017a(null, xgVar);
            }

            @Override // androidx.appcompat.view.menu.y7
            public final Object k(Object obj) {
                Object c;
                c = f60.c();
                int i = this.q;
                if (i == 0) {
                    rp0.b(obj);
                    mc0 mc0Var = a.this.b;
                    this.q = 1;
                    if (mc0Var.a(null, this) == c) {
                        return c;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp0.b(obj);
                }
                return u31.a;
            }

            @Override // androidx.appcompat.view.menu.yw
            /* renamed from: o */
            public final Object h(th thVar, xg xgVar) {
                return ((C0017a) a(thVar, xgVar)).k(u31.a);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends oy0 implements yw {
            public int q;

            public b(xg xgVar) {
                super(2, xgVar);
            }

            @Override // androidx.appcompat.view.menu.y7
            public final xg a(Object obj, xg xgVar) {
                return new b(xgVar);
            }

            @Override // androidx.appcompat.view.menu.y7
            public final Object k(Object obj) {
                Object c;
                c = f60.c();
                int i = this.q;
                if (i == 0) {
                    rp0.b(obj);
                    mc0 mc0Var = a.this.b;
                    this.q = 1;
                    obj = mc0Var.b(this);
                    if (obj == c) {
                        return c;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp0.b(obj);
                }
                return obj;
            }

            @Override // androidx.appcompat.view.menu.yw
            /* renamed from: o */
            public final Object h(th thVar, xg xgVar) {
                return ((b) a(thVar, xgVar)).k(u31.a);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends oy0 implements yw {
            public int q;
            public final /* synthetic */ Uri s;
            public final /* synthetic */ InputEvent t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, xg xgVar) {
                super(2, xgVar);
                this.s = uri;
                this.t = inputEvent;
            }

            @Override // androidx.appcompat.view.menu.y7
            public final xg a(Object obj, xg xgVar) {
                return new c(this.s, this.t, xgVar);
            }

            @Override // androidx.appcompat.view.menu.y7
            public final Object k(Object obj) {
                Object c;
                c = f60.c();
                int i = this.q;
                if (i == 0) {
                    rp0.b(obj);
                    mc0 mc0Var = a.this.b;
                    Uri uri = this.s;
                    InputEvent inputEvent = this.t;
                    this.q = 1;
                    if (mc0Var.c(uri, inputEvent, this) == c) {
                        return c;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp0.b(obj);
                }
                return u31.a;
            }

            @Override // androidx.appcompat.view.menu.yw
            /* renamed from: o */
            public final Object h(th thVar, xg xgVar) {
                return ((c) a(thVar, xgVar)).k(u31.a);
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends oy0 implements yw {
            public int q;
            public final /* synthetic */ Uri s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Uri uri, xg xgVar) {
                super(2, xgVar);
                this.s = uri;
            }

            @Override // androidx.appcompat.view.menu.y7
            public final xg a(Object obj, xg xgVar) {
                return new d(this.s, xgVar);
            }

            @Override // androidx.appcompat.view.menu.y7
            public final Object k(Object obj) {
                Object c;
                c = f60.c();
                int i = this.q;
                if (i == 0) {
                    rp0.b(obj);
                    mc0 mc0Var = a.this.b;
                    Uri uri = this.s;
                    this.q = 1;
                    if (mc0Var.d(uri, this) == c) {
                        return c;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp0.b(obj);
                }
                return u31.a;
            }

            @Override // androidx.appcompat.view.menu.yw
            /* renamed from: o */
            public final Object h(th thVar, xg xgVar) {
                return ((d) a(thVar, xgVar)).k(u31.a);
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends oy0 implements yw {
            public int q;

            public e(w71 w71Var, xg xgVar) {
                super(2, xgVar);
            }

            @Override // androidx.appcompat.view.menu.y7
            public final xg a(Object obj, xg xgVar) {
                return new e(null, xgVar);
            }

            @Override // androidx.appcompat.view.menu.y7
            public final Object k(Object obj) {
                Object c;
                c = f60.c();
                int i = this.q;
                if (i == 0) {
                    rp0.b(obj);
                    mc0 mc0Var = a.this.b;
                    this.q = 1;
                    if (mc0Var.e(null, this) == c) {
                        return c;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp0.b(obj);
                }
                return u31.a;
            }

            @Override // androidx.appcompat.view.menu.yw
            /* renamed from: o */
            public final Object h(th thVar, xg xgVar) {
                return ((e) a(thVar, xgVar)).k(u31.a);
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends oy0 implements yw {
            public int q;

            public f(x71 x71Var, xg xgVar) {
                super(2, xgVar);
            }

            @Override // androidx.appcompat.view.menu.y7
            public final xg a(Object obj, xg xgVar) {
                return new f(null, xgVar);
            }

            @Override // androidx.appcompat.view.menu.y7
            public final Object k(Object obj) {
                Object c;
                c = f60.c();
                int i = this.q;
                if (i == 0) {
                    rp0.b(obj);
                    mc0 mc0Var = a.this.b;
                    this.q = 1;
                    if (mc0Var.f(null, this) == c) {
                        return c;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp0.b(obj);
                }
                return u31.a;
            }

            @Override // androidx.appcompat.view.menu.yw
            /* renamed from: o */
            public final Object h(th thVar, xg xgVar) {
                return ((f) a(thVar, xgVar)).k(u31.a);
            }
        }

        public a(mc0 mc0Var) {
            c60.e(mc0Var, "mMeasurementManager");
            this.b = mc0Var;
        }

        @Override // androidx.appcompat.view.menu.nc0
        public m90 b() {
            ok b2;
            b2 = c9.b(uh.a(fm.a()), null, null, new b(null), 3, null);
            return jh.c(b2, null, 1, null);
        }

        @Override // androidx.appcompat.view.menu.nc0
        public m90 c(Uri uri) {
            ok b2;
            c60.e(uri, "trigger");
            b2 = c9.b(uh.a(fm.a()), null, null, new d(uri, null), 3, null);
            return jh.c(b2, null, 1, null);
        }

        public m90 e(hl hlVar) {
            ok b2;
            c60.e(hlVar, "deletionRequest");
            b2 = c9.b(uh.a(fm.a()), null, null, new C0017a(hlVar, null), 3, null);
            return jh.c(b2, null, 1, null);
        }

        public m90 f(Uri uri, InputEvent inputEvent) {
            ok b2;
            c60.e(uri, "attributionSource");
            b2 = c9.b(uh.a(fm.a()), null, null, new c(uri, inputEvent, null), 3, null);
            return jh.c(b2, null, 1, null);
        }

        public m90 g(w71 w71Var) {
            ok b2;
            c60.e(w71Var, "request");
            b2 = c9.b(uh.a(fm.a()), null, null, new e(w71Var, null), 3, null);
            return jh.c(b2, null, 1, null);
        }

        public m90 h(x71 x71Var) {
            ok b2;
            c60.e(x71Var, "request");
            b2 = c9.b(uh.a(fm.a()), null, null, new f(x71Var, null), 3, null);
            return jh.c(b2, null, 1, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(lj ljVar) {
            this();
        }

        public final nc0 a(Context context) {
            c60.e(context, "context");
            mc0 a = mc0.a.a(context);
            if (a != null) {
                return new a(a);
            }
            return null;
        }
    }

    public static final nc0 a(Context context) {
        return a.a(context);
    }

    public abstract m90 b();

    public abstract m90 c(Uri uri);
}
