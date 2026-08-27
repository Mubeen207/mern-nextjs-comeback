package androidx.appcompat.view.menu;

import io.flutter.embedding.engine.FlutterJNI;
/* loaded from: classes.dex */
public class lu {
    public final FlutterJNI a;

    public lu(FlutterJNI flutterJNI) {
        this.a = flutterJNI;
    }

    public int a(CharSequence charSequence, int i) {
        int charCount;
        int length = charSequence.length();
        int i2 = length - 1;
        if (i >= i2) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i);
        int charCount2 = Character.charCount(codePointAt);
        int i3 = i + charCount2;
        int i4 = 0;
        if (i3 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i3) == 13) {
                charCount2++;
            }
            return i + charCount2;
        } else if (g(codePointAt)) {
            if (i3 >= i2 || !g(Character.codePointAt(charSequence, i3))) {
                return i3;
            }
            int i5 = i;
            while (i5 > 0 && g(Character.codePointBefore(charSequence, i))) {
                i5 -= Character.charCount(Character.codePointBefore(charSequence, i));
                i4++;
            }
            if (i4 % 2 == 0) {
                charCount2 += 2;
            }
            return i + charCount2;
        } else {
            if (f(codePointAt)) {
                charCount2 += Character.charCount(codePointAt);
            }
            if (codePointAt == 8419) {
                int codePointBefore = Character.codePointBefore(charSequence, i3);
                int charCount3 = i3 + Character.charCount(codePointBefore);
                if (charCount3 < length && i(codePointBefore)) {
                    int codePointAt2 = Character.codePointAt(charSequence, charCount3);
                    if (f(codePointAt2)) {
                        charCount2 += Character.charCount(codePointBefore) + Character.charCount(codePointAt2);
                    }
                } else if (f(codePointBefore)) {
                    charCount2 += Character.charCount(codePointBefore);
                }
                return i + charCount2;
            }
            if (c(codePointAt)) {
                boolean z = false;
                int i6 = 0;
                do {
                    if (z) {
                        charCount2 += Character.charCount(codePointAt) + i6 + 1;
                        z = false;
                    }
                    if (d(codePointAt)) {
                        break;
                    }
                    if (i3 < length) {
                        codePointAt = Character.codePointAt(charSequence, i3);
                        i3 += Character.charCount(codePointAt);
                        if (codePointAt != 8419) {
                            if (!d(codePointAt)) {
                                if (!i(codePointAt)) {
                                    if (codePointAt == 8205) {
                                        codePointAt = Character.codePointAt(charSequence, i3);
                                        i3 += Character.charCount(codePointAt);
                                        if (i3 >= length || !i(codePointAt)) {
                                            i6 = 0;
                                        } else {
                                            codePointAt = Character.codePointAt(charSequence, i3);
                                            int charCount4 = Character.charCount(codePointAt);
                                            i3 += Character.charCount(codePointAt);
                                            i6 = charCount4;
                                        }
                                        z = true;
                                        if (i3 < length || !z) {
                                            break;
                                            break;
                                        }
                                    }
                                } else {
                                    charCount = Character.charCount(codePointAt);
                                }
                            } else {
                                charCount = Character.charCount(codePointAt);
                            }
                            charCount2 += charCount;
                            break;
                        }
                        int codePointBefore2 = Character.codePointBefore(charSequence, i3);
                        int charCount5 = i3 + Character.charCount(codePointBefore2);
                        if (charCount5 < length && i(codePointBefore2)) {
                            int codePointAt3 = Character.codePointAt(charSequence, charCount5);
                            if (f(codePointAt3)) {
                                charCount2 += Character.charCount(codePointBefore2) + Character.charCount(codePointAt3);
                            }
                        } else if (f(codePointBefore2)) {
                            charCount2 += Character.charCount(codePointBefore2);
                        }
                        return i + charCount2;
                    }
                    i6 = 0;
                    if (i3 < length) {
                        break;
                    }
                } while (c(codePointAt));
            }
            return i + charCount2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0155 A[EDGE_INSN: B:103:0x0155->B:96:0x0155 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(java.lang.CharSequence r9, int r10) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.lu.b(java.lang.CharSequence, int):int");
    }

    public boolean c(int i) {
        return this.a.isCodePointEmoji(i);
    }

    public boolean d(int i) {
        return this.a.isCodePointEmojiModifier(i);
    }

    public boolean e(int i) {
        return this.a.isCodePointEmojiModifierBase(i);
    }

    public boolean f(int i) {
        return (48 <= i && i <= 57) || i == 35 || i == 42;
    }

    public boolean g(int i) {
        return this.a.isCodePointRegionalIndicator(i);
    }

    public boolean h(int i) {
        return 917536 <= i && i <= 917630;
    }

    public boolean i(int i) {
        return this.a.isCodePointVariantSelector(i);
    }
}
