package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class q0 {
    public final Object a;

    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {
        public final q0 a;

        public a(q0 q0Var) {
            this.a = q0Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            p0 b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.B0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i) {
            List c = this.a.c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((p0) c.get(i2)).B0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            p0 d = this.a.d(i);
            if (d == null) {
                return null;
            }
            return d.B0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(q0 q0Var) {
            super(q0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, p0.C0(accessibilityNodeInfo), str, bundle);
        }
    }

    public q0() {
        this.a = new b(this);
    }

    public void a(int i, p0 p0Var, String str, Bundle bundle) {
    }

    public p0 b(int i) {
        return null;
    }

    public List c(String str, int i) {
        return null;
    }

    public p0 d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public q0(Object obj) {
        this.a = obj;
    }
}
