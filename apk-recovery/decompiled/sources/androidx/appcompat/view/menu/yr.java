package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class yr extends Exception {
    public yr() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr(String str) {
        super(str);
        pj0.f(str, "Detail message must not be empty");
    }
}
