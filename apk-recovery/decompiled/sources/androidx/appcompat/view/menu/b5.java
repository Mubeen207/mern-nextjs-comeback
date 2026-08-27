package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.al0;
/* loaded from: classes.dex */
public final class b5 {
    public int a;
    public al0.a b = al0.a.DEFAULT;

    /* loaded from: classes.dex */
    public static final class a implements al0 {
        public final int a;
        public final al0.a b;

        public a(int i, al0.a aVar) {
            this.a = i;
            this.b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return al0.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof al0) {
                al0 al0Var = (al0) obj;
                return this.a == al0Var.tag() && this.b.equals(al0Var.intEncoding());
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // androidx.appcompat.view.menu.al0
        public al0.a intEncoding() {
            return this.b;
        }

        @Override // androidx.appcompat.view.menu.al0
        public int tag() {
            return this.a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
        }
    }

    public static b5 b() {
        return new b5();
    }

    public al0 a() {
        return new a(this.a, this.b);
    }

    public b5 c(int i) {
        this.a = i;
        return this;
    }
}
