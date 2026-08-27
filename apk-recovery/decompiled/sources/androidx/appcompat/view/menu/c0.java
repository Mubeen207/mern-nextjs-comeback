package androidx.appcompat.view.menu;

import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public abstract class c0 {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
