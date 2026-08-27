package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public @interface al0 {

    /* loaded from: classes.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
