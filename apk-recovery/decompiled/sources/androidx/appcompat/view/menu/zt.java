package androidx.appcompat.view.menu;

import android.content.Context;
import io.flutter.view.TextureRegistry;
/* loaded from: classes.dex */
public interface zt {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static class b {
        public final Context a;
        public final io.flutter.embedding.engine.a b;
        public final i8 c;
        public final TextureRegistry d;
        public final wi0 e;
        public final a f;
        public final io.flutter.embedding.engine.b g;

        public b(Context context, io.flutter.embedding.engine.a aVar, i8 i8Var, TextureRegistry textureRegistry, wi0 wi0Var, a aVar2, io.flutter.embedding.engine.b bVar) {
            this.a = context;
            this.b = aVar;
            this.c = i8Var;
            this.d = textureRegistry;
            this.e = wi0Var;
            this.f = aVar2;
            this.g = bVar;
        }
    }

    void f(b bVar);

    void h(b bVar);
}
