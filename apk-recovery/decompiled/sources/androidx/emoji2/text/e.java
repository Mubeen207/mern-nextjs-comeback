package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.appcompat.view.menu.b31;
import androidx.appcompat.view.menu.bv;
import androidx.appcompat.view.menu.r11;
import androidx.appcompat.view.menu.tj0;
import androidx.appcompat.view.menu.we;
import androidx.appcompat.view.menu.xu;
import androidx.emoji2.text.c;
import androidx.emoji2.text.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public class e extends c.AbstractC0041c {
    public static final a k = new a();

    /* loaded from: classes.dex */
    public static class a {
        public Typeface a(Context context, bv.b bVar) {
            return bv.a(context, null, new bv.b[]{bVar});
        }

        public bv.a b(Context context, xu xuVar) {
            return bv.b(context, null, xuVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c.h {
        public final Context a;
        public final xu b;
        public final a c;
        public final Object d = new Object();
        public Handler e;
        public Executor f;
        public ThreadPoolExecutor g;
        public c.i h;
        public ContentObserver i;
        public Runnable j;

        public b(Context context, xu xuVar, a aVar) {
            tj0.h(context, "Context cannot be null");
            tj0.h(xuVar, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = xuVar;
            this.c = aVar;
        }

        @Override // androidx.emoji2.text.c.h
        public void a(c.i iVar) {
            tj0.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        this.c.c(this.a, contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(this.j);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    try {
                        bv.b e = e();
                        int b = e.b();
                        if (b == 2) {
                            synchronized (this.d) {
                            }
                        }
                        if (b != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b + ")");
                        }
                        r11.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface a = this.c.a(this.a, e);
                        ByteBuffer e2 = b31.e(this.a, null, e.d());
                        if (e2 == null || a == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        f b2 = f.b(a, e2);
                        r11.b();
                        synchronized (this.d) {
                            c.i iVar = this.h;
                            if (iVar != null) {
                                iVar.b(b2);
                            }
                        }
                        b();
                    } catch (Throwable th) {
                        synchronized (this.d) {
                            try {
                                c.i iVar2 = this.h;
                                if (iVar2 != null) {
                                    iVar2.a(th);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void d() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor b = we.b("emojiCompat");
                        this.g = b;
                        this.f = b;
                    }
                    this.f.execute(new Runnable() { // from class: androidx.appcompat.view.menu.yu
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.b.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final bv.b e() {
            try {
                bv.a b = this.c.b(this.a, this.b);
                if (b.c() == 0) {
                    bv.b[] b2 = b.b();
                    if (b2 == null || b2.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b2[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b.c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        public void f(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public e(Context context, xu xuVar) {
        super(new b(context, xuVar, k));
    }

    public e c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
