package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class li extends hh {
    public float a = -1.0f;

    @Override // androidx.appcompat.view.menu.hh
    public void a(xt0 xt0Var, float f, float f2, float f3) {
        xt0Var.o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        xt0Var.m((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
