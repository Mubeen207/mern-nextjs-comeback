package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public abstract class fd {
    public static String a(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return "unknown status code: " + i;
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case t02.c.c /* 3 */:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case t02.c.e /* 5 */:
                return "INVALID_ACCOUNT";
            case t02.c.f /* 6 */:
                return "RESOLUTION_REQUIRED";
            case t02.c.g /* 7 */:
                return "NETWORK_ERROR";
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
