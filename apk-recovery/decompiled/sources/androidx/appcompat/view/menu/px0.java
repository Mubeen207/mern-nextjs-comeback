package androidx.appcompat.view.menu;

import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class px0 {
    public static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
