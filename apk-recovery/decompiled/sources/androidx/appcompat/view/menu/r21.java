package androidx.appcompat.view.menu;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class r21 {
    public final a a = new a();

    public void a(String str) {
        a aVar = this.a;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            sb.append(charAt);
            a aVar2 = new a(charAt, sb.toString());
            Objects.requireNonNull(aVar);
            if (aVar.d.contains(aVar2)) {
                aVar = aVar.a(charAt);
            } else {
                aVar.d.add(aVar2);
                aVar = aVar2;
            }
            if (i == str.length() - 1) {
                Objects.requireNonNull(aVar);
                aVar.c = true;
            }
        }
    }

    public String b(String str) {
        a aVar = this.a;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!aVar.d.contains(new a(charAt, null))) {
                break;
            }
            aVar = aVar.a(charAt);
            Objects.requireNonNull(aVar);
            if (aVar.c) {
                return aVar.b;
            }
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static class a {
        public char a;
        public String b;
        public boolean c = false;
        public final List d = new LinkedList();

        public a() {
        }

        public a a(char c) {
            for (a aVar : this.d) {
                if (aVar.a == c) {
                    return aVar;
                }
            }
            return null;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public a(char c, String str) {
            this.a = c;
            this.b = str;
        }
    }
}
