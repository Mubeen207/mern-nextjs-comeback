package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class r9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public r9(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    public static r9 b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        r9 r9Var = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int p = e(f8, f2, f).p();
            float b = s9.b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                r9 c = c(p);
                float a = c.a(e(c.k(), c.i(), f));
                if (a <= 1.0f) {
                    r9Var = c;
                    f5 = abs;
                    f7 = a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            } else if (b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return r9Var;
    }

    public static r9 c(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i, f71.k, fArr, fArr2);
        return new r9(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void d(int i, f71 f71Var, float[] fArr, float[] fArr2) {
        float pow;
        s9.f(i, fArr2);
        float[][] fArr3 = s9.a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = (fArr4[0] * f) + (fArr4[1] * f2) + (fArr4[2] * f3);
        float[] fArr5 = fArr3[1];
        float f5 = (fArr5[0] * f) + (fArr5[1] * f2) + (fArr5[2] * f3);
        float[] fArr6 = fArr3[2];
        float f6 = f71Var.i()[0] * f4;
        float f7 = f71Var.i()[1] * f5;
        float f8 = f71Var.i()[2] * ((f * fArr6[0]) + (f2 * fArr6[1]) + (f3 * fArr6[2]));
        float pow2 = (float) Math.pow((f71Var.c() * Math.abs(f6)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((f71Var.c() * Math.abs(f7)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((f71Var.c() * Math.abs(f8)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f8) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f9 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f10 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f11 = signum2 * 20.0f;
        float f12 = (((signum * 20.0f) + f11) + (21.0f * signum3)) / 20.0f;
        float f13 = (((signum * 40.0f) + f11) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f10, f9)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f14 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f13 * f71Var.f()) / f71Var.a(), f71Var.b() * f71Var.j())) * 100.0f;
        float b = (4.0f / f71Var.b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (f71Var.a() + 4.0f) * f71Var.d();
        float sqrt = ((float) Math.sqrt(pow5 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, f71Var.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * f71Var.g()) * f71Var.h()) * ((float) Math.sqrt((f9 * f9) + (f10 * f10)))) / (f12 + 0.305f), 0.9d));
        float d2 = f71Var.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((pow * f71Var.b()) / (f71Var.a() + 4.0f))) * 50.0f;
        float f15 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * d2) + 1.0f)) * 43.85965f;
        double d3 = f14;
        float cos = ((float) Math.cos(d3)) * log;
        float sin = log * ((float) Math.sin(d3));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow5;
            fArr[1] = b;
            fArr[2] = d2;
            fArr[3] = sqrt2;
            fArr[4] = f15;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    public static r9 e(float f, float f2, float f3) {
        return f(f, f2, f3, f71.k);
    }

    public static r9 f(float f, float f2, float f3, f71 f71Var) {
        double d;
        float b = (4.0f / f71Var.b()) * ((float) Math.sqrt(f / 100.0d)) * (f71Var.a() + 4.0f) * f71Var.d();
        float d2 = f2 * f71Var.d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * f71Var.b()) / (f71Var.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((d2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f3) / 180.0f;
        return new r9(f3, f2, f, b, d2, sqrt, f4, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static int m(float f, float f2, float f3) {
        return n(f, f2, f3, f71.k);
    }

    public static int n(float f, float f2, float f3, f71 f71Var) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return s9.a(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        r9 r9Var = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            r9 b = b(min, f5, f3);
            if (!z) {
                if (b == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    r9Var = b;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else if (b != null) {
                return b.o(f71Var);
            } else {
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return r9Var == null ? s9.a(f3) : r9Var.o(f71Var);
    }

    public float a(r9 r9Var) {
        float l = l() - r9Var.l();
        float g = g() - r9Var.g();
        float h = h() - r9Var.h();
        return (float) (Math.pow(Math.sqrt((l * l) + (g * g) + (h * h)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public float i() {
        return this.b;
    }

    public float j() {
        return this.a;
    }

    public float k() {
        return this.c;
    }

    public float l() {
        return this.g;
    }

    public int o(f71 f71Var) {
        float f;
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, f71Var.e()), 0.73d), 1.1111111111111112d);
        double j = (j() * 3.1415927f) / 180.0f;
        float a = f71Var.a() * ((float) Math.pow(k() / 100.0d, (1.0d / f71Var.b()) / f71Var.j()));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * f71Var.g() * f71Var.h();
        float f2 = a / f71Var.f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f3 = (((0.305f + f2) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = f2 * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / f71Var.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / f71Var.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / f71Var.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f) * 27.13d) / (400.0d - Math.abs(f))), 2.380952380952381d));
        float f9 = signum / f71Var.i()[0];
        float f10 = signum2 / f71Var.i()[1];
        float f11 = signum3 / f71Var.i()[2];
        float[][] fArr = s9.b;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return cd.b(f12, (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11), (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    public int p() {
        return o(f71.k);
    }
}
