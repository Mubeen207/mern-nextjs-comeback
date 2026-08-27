package androidx.appcompat.view.menu;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
/* loaded from: classes.dex */
public final class uf {
    public final f a;

    /* loaded from: classes.dex */
    public static final class a {
        public final c a;

        public a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new b(clipData, i);
            } else {
                this.a = new d(clipData, i);
            }
        }

        public uf a() {
            return this.a.a();
        }

        public a b(Bundle bundle) {
            this.a.b(bundle);
            return this;
        }

        public a c(int i) {
            this.a.d(i);
            return this;
        }

        public a d(Uri uri) {
            this.a.c(uri);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {
        public final ContentInfo.Builder a;

        public b(ClipData clipData, int i) {
            this.a = xf.a(clipData, i);
        }

        @Override // androidx.appcompat.view.menu.uf.c
        public uf a() {
            ContentInfo build;
            build = this.a.build();
            return new uf(new e(build));
        }

        @Override // androidx.appcompat.view.menu.uf.c
        public void b(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        @Override // androidx.appcompat.view.menu.uf.c
        public void c(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // androidx.appcompat.view.menu.uf.c
        public void d(int i) {
            this.a.setFlags(i);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        uf a();

        void b(Bundle bundle);

        void c(Uri uri);

        void d(int i);
    }

    /* loaded from: classes.dex */
    public static final class d implements c {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        public d(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // androidx.appcompat.view.menu.uf.c
        public uf a() {
            return new uf(new g(this));
        }

        @Override // androidx.appcompat.view.menu.uf.c
        public void b(Bundle bundle) {
            this.e = bundle;
        }

        @Override // androidx.appcompat.view.menu.uf.c
        public void c(Uri uri) {
            this.d = uri;
        }

        @Override // androidx.appcompat.view.menu.uf.c
        public void d(int i) {
            this.c = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements f {
        public final ContentInfo a;

        public e(ContentInfo contentInfo) {
            this.a = tf.a(tj0.g(contentInfo));
        }

        @Override // androidx.appcompat.view.menu.uf.f
        public ClipData a() {
            ClipData clip;
            clip = this.a.getClip();
            return clip;
        }

        @Override // androidx.appcompat.view.menu.uf.f
        public int b() {
            int flags;
            flags = this.a.getFlags();
            return flags;
        }

        @Override // androidx.appcompat.view.menu.uf.f
        public ContentInfo c() {
            return this.a;
        }

        @Override // androidx.appcompat.view.menu.uf.f
        public int d() {
            int source;
            source = this.a.getSource();
            return source;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* loaded from: classes.dex */
    public static final class g implements f {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public g(d dVar) {
            this.a = (ClipData) tj0.g(dVar.a);
            this.b = tj0.c(dVar.b, 0, 5, "source");
            this.c = tj0.f(dVar.c, 1);
            this.d = dVar.d;
            this.e = dVar.e;
        }

        @Override // androidx.appcompat.view.menu.uf.f
        public ClipData a() {
            return this.a;
        }

        @Override // androidx.appcompat.view.menu.uf.f
        public int b() {
            return this.c;
        }

        @Override // androidx.appcompat.view.menu.uf.f
        public ContentInfo c() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.uf.f
        public int d() {
            return this.b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(uf.e(this.b));
            sb.append(", flags=");
            sb.append(uf.a(this.c));
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public uf(f fVar) {
        this.a = fVar;
    }

    public static String a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    public static String e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static uf g(ContentInfo contentInfo) {
        return new uf(new e(contentInfo));
    }

    public ClipData b() {
        return this.a.a();
    }

    public int c() {
        return this.a.b();
    }

    public int d() {
        return this.a.d();
    }

    public ContentInfo f() {
        ContentInfo c2 = this.a.c();
        Objects.requireNonNull(c2);
        return tf.a(c2);
    }

    public String toString() {
        return this.a.toString();
    }
}
