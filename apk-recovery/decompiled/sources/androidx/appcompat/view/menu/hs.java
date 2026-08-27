package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class hs extends yr {
    public final a m;

    /* loaded from: classes.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public hs(a aVar) {
        this.m = aVar;
    }

    public hs(String str, a aVar) {
        super(str);
        this.m = aVar;
    }
}
