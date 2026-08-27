package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class z31 extends UnsupportedOperationException {
    public final mr m;

    public z31(mr mrVar) {
        this.m = mrVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.m));
    }
}
