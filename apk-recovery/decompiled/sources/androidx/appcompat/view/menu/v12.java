package androidx.appcompat.view.menu;

import java.io.IOException;
/* loaded from: classes.dex */
public class v12 extends IOException {
    public z32 m;

    public v12(String str) {
        super(str);
        this.m = null;
    }

    public static u12 a() {
        return new u12("Protocol message tag had invalid wire type.");
    }

    public static v12 b() {
        return new v12("Protocol message contained an invalid tag (zero).");
    }

    public static v12 c() {
        return new v12("Protocol message had invalid UTF-8.");
    }

    public static v12 d() {
        return new v12("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static v12 e() {
        return new v12("Failed to parse the message.");
    }

    public static v12 f() {
        return new v12("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
