package androidx.appcompat.view.menu;

import android.content.Intent;
import android.net.Uri;
import android.util.ArrayMap;
import androidx.appcompat.view.menu.u6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class z50 {
    public final ArrayMap a = new ArrayMap();
    public final ArrayMap b = new ArrayMap();
    public final ArrayMap c = new ArrayMap();
    public final ArrayMap d = new ArrayMap();
    public final ArrayMap e = new ArrayMap();
    public final ArrayMap f = new ArrayMap();

    public static zq e(Intent intent) {
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            return null;
        }
        return new zq((String[]) categories.toArray(new String[0]));
    }

    public final void a(ArrayMap arrayMap, String str, u6.f fVar) {
        u6.f[] fVarArr = (u6.f[]) arrayMap.get(str);
        if (fVarArr == null) {
            u6.f[] g = g(2);
            arrayMap.put(str, g);
            g[0] = fVar;
            return;
        }
        int length = fVarArr.length;
        int i = length;
        while (i > 0 && fVarArr[i - 1] == null) {
            i--;
        }
        if (i < length) {
            fVarArr[i] = fVar;
            return;
        }
        u6.f[] g2 = g((length * 3) / 2);
        System.arraycopy(fVarArr, 0, g2, 0, length);
        g2[length] = fVar;
        arrayMap.put(str, g2);
    }

    public void b(u6.f fVar) {
        int k = k(fVar, fVar.m.schemesIterator(), this.d, "      Scheme: ");
        int l = l(fVar);
        if (k == 0 && l == 0) {
            k(fVar, fVar.m.actionsIterator(), this.e, "      Action: ");
        }
        if (l != 0) {
            k(fVar, fVar.m.actionsIterator(), this.f, "      TypedAction: ");
        }
    }

    public boolean c(u6.f fVar, List list) {
        return true;
    }

    public final void d(Intent intent, zq zqVar, boolean z, boolean z2, String str, String str2, u6.f[] fVarArr, List list, int i) {
        u6.f fVar;
        String str3;
        Uri uri;
        u6.f[] fVarArr2 = fVarArr;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str4 = intent.getPackage();
        int length = fVarArr2 != null ? fVarArr2.length : 0;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length && (fVar = fVarArr2[i2]) != null) {
            if (z) {
                zu0.a("IntentResolver", "Matching against filter " + fVar);
            }
            if (str4 == null || f(str4, fVar)) {
                if (c(fVar, list)) {
                    str3 = action;
                    uri = data;
                    int match = fVar.m.match(action, str, str2, data, zqVar, "IntentResolver");
                    if (match >= 0) {
                        if (z) {
                            zu0.a("IntentResolver", "  Filter matched!  match=0x" + Integer.toHexString(match) + " hasDefault=" + fVar.m.hasCategory("android.intent.category.DEFAULT"));
                        }
                        if (!z2 || fVar.m.hasCategory("android.intent.category.DEFAULT")) {
                            Object h = h(fVar, match, i);
                            if (z) {
                                zu0.a("IntentResolver", "    Created result: " + h);
                            }
                            if (h != null) {
                                list.add(h);
                            }
                        } else {
                            z3 = true;
                        }
                    } else if (z) {
                        zu0.a("IntentResolver", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                    }
                    i2++;
                    fVarArr2 = fVarArr;
                    action = str3;
                    data = uri;
                } else if (z) {
                    zu0.a("IntentResolver", "  Filter's target already added");
                }
            } else if (z) {
                zu0.a("IntentResolver", "  Filter is not from package " + str4 + "; skipping");
            }
            str3 = action;
            uri = data;
            i2++;
            fVarArr2 = fVarArr;
            action = str3;
            data = uri;
        }
        if (z && z3) {
            if (list.size() == 0) {
                zu0.a("IntentResolver", "resolveIntent failed: found match, but none with CATEGORY_DEFAULT");
            } else if (list.size() > 1) {
                zu0.a("IntentResolver", "resolveIntent: multiple matches, only some with CATEGORY_DEFAULT");
            }
        }
    }

    public abstract boolean f(String str, u6.f fVar);

    public abstract u6.f[] g(int i);

    public abstract Object h(u6.f fVar, int i, int i2);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List i(android.content.Intent r22, java.lang.String r23, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.z50.i(android.content.Intent, java.lang.String, boolean, int):java.util.List");
    }

    public List j(Intent intent, String str, boolean z, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = (intent.getFlags() & 8) != 0;
        zq e = e(intent);
        String scheme = intent.getScheme();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d(intent, e, z2, z, str, scheme, (u6.f[]) arrayList.get(i2), arrayList2, i);
        }
        return arrayList2;
    }

    public final int k(u6.f fVar, Iterator it, ArrayMap arrayMap, String str) {
        int i = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i++;
            a(arrayMap, (String) it.next(), fVar);
        }
        return i;
    }

    public final int l(u6.f fVar) {
        String str;
        Iterator<String> typesIterator = fVar.m.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            i++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str = next.substring(0, indexOf).intern();
            } else {
                str = next;
                next = next + "/*";
            }
            a(this.a, next, fVar);
            if (indexOf > 0) {
                a(this.b, str, fVar);
            } else {
                a(this.c, str, fVar);
            }
        }
        return i;
    }

    public void m(u6.f fVar) {
        n(fVar);
    }

    public void n(u6.f fVar) {
        int p = p(fVar, fVar.m.schemesIterator(), this.d, "      Scheme: ");
        int q = q(fVar);
        if (p == 0 && q == 0) {
            p(fVar, fVar.m.actionsIterator(), this.e, "      Action: ");
        }
        if (q != 0) {
            p(fVar, fVar.m.actionsIterator(), this.f, "      TypedAction: ");
        }
    }

    public final void o(ArrayMap arrayMap, String str, Object obj) {
        u6.f[] fVarArr = (u6.f[]) arrayMap.get(str);
        if (fVarArr != null) {
            int length = fVarArr.length - 1;
            while (length >= 0 && fVarArr[length] == null) {
                length--;
            }
            int i = length;
            while (length >= 0) {
                if (fVarArr[length] == obj) {
                    int i2 = i - length;
                    if (i2 > 0) {
                        System.arraycopy(fVarArr, length + 1, fVarArr, length, i2);
                    }
                    fVarArr[i] = null;
                    i--;
                }
                length--;
            }
            if (i < 0) {
                arrayMap.remove(str);
            } else if (i < fVarArr.length / 2) {
                u6.f[] g = g(i + 2);
                System.arraycopy(fVarArr, 0, g, 0, i + 1);
                arrayMap.put(str, g);
            }
        }
    }

    public final int p(u6.f fVar, Iterator it, ArrayMap arrayMap, String str) {
        int i = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i++;
            o(arrayMap, (String) it.next(), fVar);
        }
        return i;
    }

    public final int q(u6.f fVar) {
        String str;
        Iterator<String> typesIterator = fVar.m.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            i++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str = next.substring(0, indexOf).intern();
            } else {
                str = next;
                next = next + "/*";
            }
            o(this.a, next, fVar);
            if (indexOf > 0) {
                o(this.b, str, fVar);
            } else {
                o(this.c, str, fVar);
            }
        }
        return i;
    }
}
