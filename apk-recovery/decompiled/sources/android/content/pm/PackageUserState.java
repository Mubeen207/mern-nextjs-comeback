package android.content.pm;

import android.util.ArraySet;
/* loaded from: classes.dex */
public class PackageUserState {
    public int appLinkGeneration;
    public boolean blockUninstall;
    public ArraySet<String> disabledComponents;
    public int domainVerificationStatus;
    public int enabled;
    public ArraySet<String> enabledComponents;
    public boolean hidden;
    public boolean installed;
    public String lastDisableAppCaller;
    public boolean notLaunched;
    public boolean stopped;

    public PackageUserState() {
        throw new RuntimeException("Stub!");
    }

    public PackageUserState(PackageUserState packageUserState) {
        throw new RuntimeException("Stub!");
    }
}
