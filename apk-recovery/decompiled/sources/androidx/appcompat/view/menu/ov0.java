package androidx.appcompat.view.menu;

import java.io.File;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class ov0 {
    public static final File a = new File(bv0.m().getCacheDir().getParent(), "root");
    public static final File b = bv0.m().getExternalFilesDir("root");

    public static File a() {
        return new File(t(), "accounts.conf");
    }

    public static File b(String str) {
        File file = a;
        return new File(file, "data/app/" + str);
    }

    public static File c(String str) {
        return new File(b(str), "lib");
    }

    public static File d() {
        return b("");
    }

    public static File e(String str) {
        File file = a;
        return new File(file, "data/app/" + str + "/base.apk");
    }

    public static File f() {
        return new File(a, "cache");
    }

    public static File g(String str, int i) {
        return new File(i(str, i), "cache");
    }

    public static File h(String str, int i) {
        return new File(i(str, i), "databases");
    }

    public static File i(String str, int i) {
        return new File(a, String.format(Locale.ENGLISH, "data/user/%d/%s", Integer.valueOf(i), str));
    }

    public static File j(String str, int i) {
        return new File(i(str, i), "files");
    }

    public static File k(String str, int i) {
        return new File(i(str, i), "lib");
    }

    public static File l(String str, int i) {
        return new File(a, String.format(Locale.ENGLISH, "data/user_de/%d/%s", Integer.valueOf(i), str));
    }

    public static File m(String str, int i) {
        return new File(n(i), String.format(Locale.ENGLISH, "Android/data/%s", str));
    }

    public static File n(int i) {
        return new File(b, String.format(Locale.ENGLISH, "storage/emulated/%d/", Integer.valueOf(i)));
    }

    public static File o() {
        return new File(t(), "fake-location.conf");
    }

    public static File p(String str) {
        return new File(b(str), "package.conf");
    }

    public static File q() {
        return new File(a, "proc");
    }

    public static File r(int i) {
        File file = new File(q(), String.format(Locale.ENGLISH, "%d", Integer.valueOf(i)));
        qr.g(file);
        return file;
    }

    public static File s() {
        return new File(t(), "shared-user.conf");
    }

    public static File t() {
        return new File(a, "system");
    }

    public static File u() {
        return new File(t(), "uid.conf");
    }

    public static File v(int i) {
        return new File(a, String.format(Locale.ENGLISH, "data/user/%d", Integer.valueOf(i)));
    }

    public static File w() {
        return new File(t(), "user.conf");
    }

    public static void x() {
        qr.g(a);
        qr.g(b);
        qr.g(t());
        qr.g(f());
        qr.g(q());
    }
}
