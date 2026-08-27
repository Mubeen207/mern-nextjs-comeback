package androidx.emoji2.text;

import android.content.Context;
import androidx.appcompat.view.menu.b50;
import androidx.appcompat.view.menu.d90;
import androidx.appcompat.view.menu.q3;
import androidx.appcompat.view.menu.r11;
import androidx.appcompat.view.menu.uj;
import androidx.appcompat.view.menu.we;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.c;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b50 {

    /* loaded from: classes.dex */
    public class a implements uj {
        public final /* synthetic */ androidx.lifecycle.f a;

        public a(androidx.lifecycle.f fVar) {
            this.a = fVar;
        }

        @Override // androidx.appcompat.view.menu.uj
        public void g(d90 d90Var) {
            EmojiCompatInitializer.this.e();
            this.a.c(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c.AbstractC0041c {
        public b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements c.h {
        public final Context a;

        /* loaded from: classes.dex */
        public class a extends c.i {
            public final /* synthetic */ c.i a;
            public final /* synthetic */ ThreadPoolExecutor b;

            public a(c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = iVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.i
            public void b(f fVar) {
                try {
                    this.a.b(fVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        public c(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.h
        public void a(final c.i iVar) {
            final ThreadPoolExecutor b = we.b("EmojiCompatInitializer");
            b.execute(new Runnable() { // from class: androidx.appcompat.view.menu.on
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.c.this.d(iVar, b);
                }
            });
        }

        /* renamed from: c */
        public void d(c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                e a2 = androidx.emoji2.text.a.a(this.a);
                if (a2 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a2.c(threadPoolExecutor);
                a2.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                r11.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.i()) {
                    androidx.emoji2.text.c.c().l();
                }
            } finally {
                r11.b();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.b50
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // androidx.appcompat.view.menu.b50
    /* renamed from: c */
    public Boolean b(Context context) {
        androidx.emoji2.text.c.h(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    public void d(Context context) {
        androidx.lifecycle.f h = ((d90) q3.e(context).f(ProcessLifecycleInitializer.class)).h();
        h.a(new a(h));
    }

    public void e() {
        we.d().postDelayed(new d(), 500L);
    }
}
